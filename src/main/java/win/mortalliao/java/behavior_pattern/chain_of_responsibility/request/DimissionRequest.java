package win.mortalliao.java.behavior_pattern.chain_of_responsibility.request;

/**
 * @author mortal
 */
public class DimissionRequest implements Request {
    @Override
    public String request() {
        return "要离职, 人事审批!";
    }
}
