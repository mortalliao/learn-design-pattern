package win.mortalliao.java.behavior_pattern.template_method.template;

/**
 * @author mortal
 */
public class TemplateConcrete extends Template {

    @Override
    public void print() {
        System.out.println("这是子类的实现");
    }
}
