package win.mortalliao.java.structural_pattern.composite.composite;

import win.mortalliao.java.structural_pattern.composite.componet.Employer;

import java.util.ArrayList;

/**
 * @author mortal
 */
public class ProjectManager extends Employer {

    public ProjectManager(String name) {
        setName(name);
        employers = new ArrayList();
    }

    @Override
    public void add(Employer employer) {
        employers.add(employer);
    }

    @Override
    public void delete(Employer employer) {
        employers.remove(employer);
    }
}
