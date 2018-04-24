package win.mortalliao.java.structural_pattern.proxy.proxy;

/**
 * @author mortal
 */
public class ProxySubject implements Subject {

    Subject subject;

    public ProxySubject() {
        System.out.println("这是代理类");
        subject = new SubjectImpl();
    }

    @Override
    public void action() {
        System.out.println("代理开始");
        subject.action();
        System.out.println("代理结束");
    }
}
