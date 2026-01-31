package com.itsaky.androidide.logsender.utils;

import com.itsaky.androidide.logsender.socket.ISocketCommand;
import com.itsaky.androidide.logsender.socket.SenderInfoCommand;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicBoolean;
import top.niunaijun.blackbox.utils.ShellUtils;
/* loaded from: classes.dex */
public class LogReader extends Thread {
    private final AtomicBoolean isInterrupted;
    private final String packageName;
    private final int port;
    private final ProcessBuilder processBuilder;
    private final String senderId;

    public LogReader(String senderId, String packageName, int port) {
        this(senderId, packageName, port, defaultCmd());
    }

    public LogReader(String senderId, String packageName, int port, String[] cmd) {
        super("AndroidIDE-LogReader");
        this.isInterrupted = new AtomicBoolean(false);
        this.senderId = senderId;
        this.packageName = packageName;
        this.port = port;
        ProcessBuilder processBuilder = new ProcessBuilder(cmd);
        this.processBuilder = processBuilder;
        processBuilder.redirectErrorStream(true);
    }

    private static String[] defaultCmd() {
        return new String[]{"logcat", "-v", "threadtime"};
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        BufferedReader reader;
        String line;
        Logger.info("Starting to read logs...");
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(), this.port);
            Process process = this.processBuilder.start();
            try {
                reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            } catch (IOException ioError) {
                Logger.error("Error reading from the logcat process or writing to the socket", ioError);
                socket.close();
            }
            try {
                OutputStream outputStream = socket.getOutputStream();
                writeCommand(new SenderInfoCommand(this.senderId, this.packageName), outputStream);
                while (!this.isInterrupted.get() && (line = reader.readLine()) != null) {
                    outputStream.write((line + ShellUtils.COMMAND_LINE_END).getBytes());
                }
                reader.close();
                socket.close();
                socket.close();
            } catch (Throwable th) {
                try {
                    reader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException ioError2) {
            Logger.error("Error creating the socket or starting the process", ioError2);
        }
    }

    private void writeCommand(ISocketCommand command, OutputStream outputStream) throws IOException {
        outputStream.write(command.toString().getBytes());
    }

    public void cancel() {
        this.isInterrupted.set(true);
        interrupt();
    }
}
