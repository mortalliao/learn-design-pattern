package win.mortalliao.java.behavior_pattern.observer.subject;

import win.mortalliao.java.behavior_pattern.observer.observer.Policeman;

/**
 * @author mortal
 */
public class HuangPuCitizen extends Citizen {

    public HuangPuCitizen(Policeman pol) {
        setPolicemen();
        register(pol);
    }

    @Override
    public void sendMessage(String help) {
        setHelp(help);
        for(int i = 0; i < pols.size(); i++) {
            Policeman pol = pols.get(i);
            //通知警察行动
            pol.action(this);
        }
    }
}
