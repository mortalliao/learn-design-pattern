package win.mortalliao.java.behavior_pattern.memento.memento;

/**
 * @author mortal
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento(){
        return this.memento;
    }

    public void setMemento(Memento memento){
        this.memento = memento;
    }
}
