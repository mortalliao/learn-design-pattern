package win.mortalliao.java.behavior_pattern.memento;

import win.mortalliao.java.behavior_pattern.memento.memento.Caretaker;
import win.mortalliao.java.behavior_pattern.memento.memento.Originator;

/**
 * @author mortal
 */
public class Test {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("开会中");

        Caretaker caretaker = new Caretaker();
        //将数据封装在Caretaker
        caretaker.setMemento(originator.createMemento());

        originator.setState("睡觉中");
        originator.showState();//显示

        //将数据重新导入
        originator.setMemento(caretaker.getMemento());
        originator.showState();
    }
}
