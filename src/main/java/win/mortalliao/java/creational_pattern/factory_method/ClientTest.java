package win.mortalliao.java.creational_pattern.factory_method;

import win.mortalliao.java.creational_pattern.factory_method.factory.IWorkFactory;
import win.mortalliao.java.creational_pattern.factory_method.factory.StudentWorkFactory;
import win.mortalliao.java.creational_pattern.factory_method.factory.TeacherWorkFactory;

/**
 * @author mortal
 */
public class ClientTest {

    public static void main(String[] args) {
        IWorkFactory studentWorkFactory = new StudentWorkFactory();
        studentWorkFactory.getWork().doWork();

        IWorkFactory teacherWorkFactory = new TeacherWorkFactory();
        teacherWorkFactory.getWork().doWork();
    }
}
