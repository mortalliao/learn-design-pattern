package win.mortalliao.java.structural_pattern.facade.facade;

import win.mortalliao.java.structural_pattern.facade.service.ServiceA;
import win.mortalliao.java.structural_pattern.facade.service.ServiceB;
import win.mortalliao.java.structural_pattern.facade.service.ServiceC;
import win.mortalliao.java.structural_pattern.facade.service.impl.ServiceAImpl;
import win.mortalliao.java.structural_pattern.facade.service.impl.ServiceBImpl;
import win.mortalliao.java.structural_pattern.facade.service.impl.ServiceCImpl;

/**
 * @author mortal
 */
public class Facade {
    ServiceA sa;

    ServiceB sb;

    ServiceC sc;

    public Facade() {
        sa = new ServiceAImpl();
        sb = new ServiceBImpl();
        sc = new ServiceCImpl();
    }

    public void methodA() {
        sa.methodA();
        sb.methodB();
    }

    public void methodB() {
        sb.methodB();
        sc.methodC();
    }

    public void methodC() {
        sc.methodC();
        sa.methodA();
    }
}
