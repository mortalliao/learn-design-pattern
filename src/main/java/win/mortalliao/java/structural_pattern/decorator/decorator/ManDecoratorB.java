package win.mortalliao.java.structural_pattern.decorator.decorator;

/**
 * @author mortal
 */
public class ManDecoratorB extends Decorator {

    @Override
    public void eat() {
        super.eat();
        System.out.println("===============");
        System.out.println("ManDecoratorB类");
    }
}
