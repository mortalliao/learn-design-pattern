package win.mortalliao.java.design.pattern.chainofresponsibilty;

/**
 * @author Jim
 */
public abstract class Approver {
    protected Approver approver;

    public void setNetApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
