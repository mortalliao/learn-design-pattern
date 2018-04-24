package win.mortalliao.java.behavior_pattern.observer.subject;

import win.mortalliao.java.behavior_pattern.observer.observer.Policeman;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mortal
 */
public abstract class Citizen {

    List<Policeman> pols;

    String help = "normal";

    public void setHelp(String help) {
        this.help = help;
    }

    public String getHelp() {
        return this.help;
    }

    public abstract void sendMessage(String help);

    public void setPolicemen() {
        this.pols = new ArrayList<>();
    }

    public void register(Policeman pol) {
        this.pols.add(pol);
    }

    public void unRegister(Policeman pol) {
        this.pols.remove(pol);
    }
}
