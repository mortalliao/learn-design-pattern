package win.mortalliao.java.creational_pattern.factory_method.factory;

import win.mortalliao.java.creational_pattern.factory_method.product.StudentWork;
import win.mortalliao.java.creational_pattern.factory_method.product.Work;

/**
 * @author mortal
 */
public class StudentWorkFactory implements IWorkFactory {

    @Override
    public Work getWork() {
        return new StudentWork();
    }

}
