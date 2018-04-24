package win.mortalliao.java.structural_pattern.adapter;

import win.mortalliao.java.structural_pattern.adapter.adapter.Adaptee;
import win.mortalliao.java.structural_pattern.adapter.adapter.Adapter;
import win.mortalliao.java.structural_pattern.adapter.adapter.Target;

/**
 * @author mortal
 */
public class Test {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.adapteeMethod();

        target.adapterMethod();
    }
}
