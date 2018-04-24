package win.mortalliao.java.structural_pattern.decorator;

import win.mortalliao.java.structural_pattern.decorator.component.Man;
import win.mortalliao.java.structural_pattern.decorator.decorator.ManDecoratorA;
import win.mortalliao.java.structural_pattern.decorator.decorator.ManDecoratorB;

/**
 * @author mortal
 */
public class Test {

    public static void main(String[] args) {
        Man man = new Man();
        ManDecoratorA md1 = new ManDecoratorA();
        ManDecoratorB md2 = new ManDecoratorB();

        md1.setPerson(man);
        md2.setPerson(md1);
        md2.eat();
    }
}
