package win.mortalliao.java.structural_pattern.facade.service.impl;

import win.mortalliao.java.structural_pattern.facade.service.ServiceA;

/**
 * @author mortal
 */
public class ServiceAImpl implements ServiceA {

    @Override
    public void methodA() {
        System.out.println("这是服务A");
    }
}
