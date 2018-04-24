package win.mortalliao.java.behavior_pattern.mediator;

import win.mortalliao.java.behavior_pattern.mediator.mediator.ConcreteMediator;
import win.mortalliao.java.behavior_pattern.mediator.mediator.Mediator;

/**
 * @author mortal
 */
public class Test {

    public static void main(String[] args) {
        Mediator med = new ConcreteMediator();
        //老板来了
        med.notice("boss");

        //客户来了
        med.notice("client");
    }
}
