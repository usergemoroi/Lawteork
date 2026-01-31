package com.itsaky.androidide.logsender.socket;

import java.util.UUID;
/* loaded from: classes.dex */
public final class SocketCommandParser {
    public static ISocketCommand parse(String line) {
        String line2 = line.substring(1);
        if (!line2.contains(ISocketCommand.PARAM_DELIMITER)) {
            return create(line2);
        }
        String[] segments = line2.split(ISocketCommand.PARAM_DELIMITER);
        if (segments.length >= 2) {
            return createParameterized(segments);
        }
        return null;
    }

    private static ISocketCommand create(String name) {
        if (name.equals(SignalCommand.STOP.getName())) {
            return SignalCommand.STOP;
        }
        return null;
    }

    private static ISocketCommand createParameterized(String[] segments) {
        String command = segments[0];
        if (SenderInfoCommand.NAME.equals(command)) {
            try {
                UUID.fromString(segments[1]);
                return new SenderInfoCommand(segments[1], segments[2]);
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }
}
