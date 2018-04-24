package win.mortalliao.java.creational_pattern.factory_method.factory;

import win.mortalliao.java.creational_pattern.factory_method.product.TeacherWork;
import win.mortalliao.java.creational_pattern.factory_method.product.Work;

/**
 * @author mortal
 */
public class TeacherWorkFactory implements IWorkFactory {

    @Override
    public Work getWork() {
        return new TeacherWork();
    }

}
