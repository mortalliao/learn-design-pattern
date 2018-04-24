package win.mortalliao.java.structural_pattern.composite.leaf;

import win.mortalliao.java.structural_pattern.composite.componet.Employer;

/**
 * @author mortal
 */
public class Programmer extends Employer {

    public Programmer(String name) {
        setName(name);
        employers = null;
        //程序员, 表示没有下属了
    }

    @Override
    public void add(Employer employer) {

    }

    @Override
    public void delete(Employer employer) {

    }
}
