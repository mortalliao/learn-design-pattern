package win.mortalliao.java.structural_pattern.adapter.adapter;

/**
 * @author mortal
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void adapteeMethod() {
        adaptee.adapteeMethod();
    }

    @Override
    public void adapterMethod() {
        System.out.println("Adapter method!");
    }
}
