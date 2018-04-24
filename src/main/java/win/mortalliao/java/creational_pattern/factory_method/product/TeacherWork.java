package win.mortalliao.java.creational_pattern.factory_method.product;

/**
 * @author mortal
 */
public class TeacherWork implements Work {

    @Override
    public void doWork() {
        System.out.println("老师审批作业!");
    }

}
