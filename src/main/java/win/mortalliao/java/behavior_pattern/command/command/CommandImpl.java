package win.mortalliao.java.behavior_pattern.command.command;

import win.mortalliao.java.behavior_pattern.command.receiver.Receiver;

/**
 * @author mortal
 */
public class CommandImpl extends Command {

    public CommandImpl(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.receive();
    }
}
