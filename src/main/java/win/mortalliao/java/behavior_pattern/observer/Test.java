package win.mortalliao.java.behavior_pattern.observer;

import win.mortalliao.java.behavior_pattern.observer.observer.HuangPuPoliceman;
import win.mortalliao.java.behavior_pattern.observer.observer.Policeman;
import win.mortalliao.java.behavior_pattern.observer.observer.TianHePoliceman;
import win.mortalliao.java.behavior_pattern.observer.subject.Citizen;
import win.mortalliao.java.behavior_pattern.observer.subject.HuangPuCitizen;
import win.mortalliao.java.behavior_pattern.observer.subject.TianHeCitizen;

/**
 * @author mortal
 */
public class Test {

    public static void main(String[] args) {
        Policeman tianHePoliceman = new TianHePoliceman();
        Policeman huangPuPoliceman = new HuangPuPoliceman();

        Citizen citizen = new HuangPuCitizen(huangPuPoliceman);
        citizen.sendMessage("unnormal");
        citizen.sendMessage("normal");

        System.out.println("===========");

        citizen = new TianHeCitizen(tianHePoliceman);
        citizen.sendMessage("normal");
        citizen.sendMessage("unnormal");
    }
}
