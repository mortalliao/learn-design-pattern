package win.mortalliao.java.behavior_pattern.command.command;

import win.mortalliao.java.behavior_pattern.command.receiver.Receiver;

/**
 * @author mortal
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
