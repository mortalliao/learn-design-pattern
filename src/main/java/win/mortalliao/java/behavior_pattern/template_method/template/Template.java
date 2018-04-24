package win.mortalliao.java.behavior_pattern.template_method.template;

/**
 * @author mortal
 */
public abstract class Template {

    public abstract void print();

    public void update() {
        System.out.println("开始打印");
        for (int i = 0; i < 10; i++) {
            print();
        }
    }
}
