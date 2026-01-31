package com.itsaky.androidide.logsender.socket;

import java.util.Objects;
/* loaded from: classes.dex */
public final class SignalCommand extends AbstractSocketCommand {
    public static final ISocketCommand STOP = new SignalCommand("stop");
    private final String name;

    public SignalCommand(String name) {
        this.name = name;
    }

    @Override // com.itsaky.androidide.logsender.socket.ISocketCommand
    public String getName() {
        return this.name;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SignalCommand)) {
            return false;
        }
        SignalCommand that = (SignalCommand) o;
        return Objects.equals(this.name, that.name);
    }

    public int hashCode() {
        return Objects.hash(this.name);
    }
}
