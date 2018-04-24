package win.mortalliao.java.structural_pattern.proxy;

import win.mortalliao.java.structural_pattern.proxy.proxy.ProxySubject;
import win.mortalliao.java.structural_pattern.proxy.proxy.Subject;

/**
 * @author mortal
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.action();
    }
}
