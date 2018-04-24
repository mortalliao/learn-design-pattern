package win.mortalliao.java.structural_pattern.proxy.proxy;

/**
 * @author mortal
 */
public class SubjectImpl implements Subject {

    @Override
    public void action() {
        System.out.println("========");
        System.out.println("========");
        System.out.println("这是被代理的类");
        System.out.println("========");
        System.out.println("========");
    }
}
