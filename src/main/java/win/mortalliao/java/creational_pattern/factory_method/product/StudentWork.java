package win.mortalliao.java.creational_pattern.factory_method.product;

/**
 * @author mortal
 */
public class StudentWork implements Work {
    @Override
    public void doWork() {
        System.out.println("学生做作业!");
    }
}
