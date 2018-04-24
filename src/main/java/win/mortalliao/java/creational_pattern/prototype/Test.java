package win.mortalliao.java.creational_pattern.prototype;

import win.mortalliao.java.creational_pattern.prototype.prototype.ConcretePrototype;
import win.mortalliao.java.creational_pattern.prototype.prototype.Prototype;

/**
 * @author mortal
 */
public class Test {

    public static void main(String[] args) {
        Prototype pro = new ConcretePrototype("prototype");
        Prototype pro2 = (Prototype) pro.clone();
        System.out.println(pro.getName());
        System.out.println(pro2.getName());
    }
}
