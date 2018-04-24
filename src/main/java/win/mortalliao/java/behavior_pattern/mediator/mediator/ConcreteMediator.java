package win.mortalliao.java.behavior_pattern.mediator.mediator;

import win.mortalliao.java.behavior_pattern.mediator.colleague.ColleagueA;
import win.mortalliao.java.behavior_pattern.mediator.colleague.ColleagueB;

/**
 * @author mortal
 */
public class ConcreteMediator extends Mediator {

    private ColleagueA ca;

    private ColleagueB cb;

    public ConcreteMediator() {
        ca = new ColleagueA();
        cb = new ColleagueB();
    }

    @Override
    public void notice(String content) {
        if (content.equals("boss")) {
            //老板来了, 通知员工A
            ca.action();
        }
        if (content.equals("client")) {
            //客户来了, 通知前台B
            cb.action();
        }
    }
}
