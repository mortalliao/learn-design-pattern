package win.mortalliao.java.structural_pattern.facade;

import win.mortalliao.java.structural_pattern.facade.facade.Facade;
import win.mortalliao.java.structural_pattern.facade.service.ServiceA;
import win.mortalliao.java.structural_pattern.facade.service.ServiceB;
import win.mortalliao.java.structural_pattern.facade.service.impl.ServiceAImpl;
import win.mortalliao.java.structural_pattern.facade.service.impl.ServiceBImpl;

/**
 * @author mortal
 */
public class Test {

    public static void main(String[] args) {
        ServiceA sa = new ServiceAImpl();
        ServiceB sb = new ServiceBImpl();

        sa.methodA();
        sb.methodB();

        System.out.println("========");
        //facade
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
