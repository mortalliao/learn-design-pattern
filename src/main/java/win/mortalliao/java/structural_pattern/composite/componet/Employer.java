package win.mortalliao.java.structural_pattern.composite.componet;

import java.util.List;

/**
 * @author mortal
 */
public abstract class Employer {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void add(Employer employer);

    public abstract void delete(Employer employer);

    public List<Employer> employers;

    public void printInfo() {
        System.out.println(name);
    }

    public List<Employer> getEmployers() {
        return this.employers;
    }
}
