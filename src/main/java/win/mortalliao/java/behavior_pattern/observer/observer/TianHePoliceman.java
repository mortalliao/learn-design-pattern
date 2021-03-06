package win.mortalliao.java.behavior_pattern.observer.observer;

import win.mortalliao.java.behavior_pattern.observer.subject.Citizen;

/**
 * @author mortal
 */
public class TianHePoliceman implements Policeman {

    @Override
    public void action(Citizen ci) {
        String help = ci.getHelp();
        if (help.equals("normal")) {
            System.out.println("一切正常, 不用出动");
        }
        if (help.equals("unnormal")) {
            System.out.println("有犯罪行为, 天河警察出动!");
        }
    }
}
