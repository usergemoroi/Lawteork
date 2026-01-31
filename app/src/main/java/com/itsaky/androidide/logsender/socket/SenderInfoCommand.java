package com.itsaky.androidide.logsender.socket;
/* loaded from: classes.dex */
public class SenderInfoCommand extends AbstractSocketCommand {
    public static final String NAME = "sender";
    public final String packageName;
    public final String senderId;

    public SenderInfoCommand(String senderId, String packageName) {
        this.senderId = senderId;
        this.packageName = packageName;
    }

    @Override // com.itsaky.androidide.logsender.socket.ISocketCommand
    public String getName() {
        return NAME;
    }

    @Override // com.itsaky.androidide.logsender.socket.AbstractSocketCommand
    protected String[] getParams() {
        return new String[]{this.senderId, this.packageName};
    }
}
