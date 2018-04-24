package win.mortalliao.java.structural_pattern.facade.service.impl;

import win.mortalliao.java.structural_pattern.facade.service.ServiceB;

/**
 * @author mortal
 */
public class ServiceBImpl implements ServiceB {

    @Override
    public void methodB() {
        System.out.println("这是服务B");
    }
}
