package win.mortalliao.java.behavior_pattern.command;

import win.mortalliao.java.behavior_pattern.command.command.Command;
import win.mortalliao.java.behavior_pattern.command.command.CommandImpl;
import win.mortalliao.java.behavior_pattern.command.invoker.Invoker;
import win.mortalliao.java.behavior_pattern.command.receiver.Receiver;

/**
 * @author mortal
 */
public class Test {

    public static void main(String[] args) {
        Receiver rec = new Receiver();
        Command cmd = new CommandImpl(rec);
        Invoker i = new Invoker();
        i.setCommand(cmd);
        i.execute();
    }
}
