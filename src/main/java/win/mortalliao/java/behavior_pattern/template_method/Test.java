package win.mortalliao.java.behavior_pattern.template_method;

import win.mortalliao.java.behavior_pattern.template_method.template.Template;
import win.mortalliao.java.behavior_pattern.template_method.template.TemplateConcrete;

/**
 * @author mortal
 */
public class Test {

    public static void main(String[] args) {
        Template temp = new TemplateConcrete();
        temp.update();
    }
}
