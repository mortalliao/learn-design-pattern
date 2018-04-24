package win.mortalliao.java.behavior_pattern.command.invoker;

import win.mortalliao.java.behavior_pattern.command.command.Command;

/**
 * @author mortal
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
