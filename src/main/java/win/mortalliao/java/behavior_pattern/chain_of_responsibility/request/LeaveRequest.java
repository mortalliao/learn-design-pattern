package win.mortalliao.java.behavior_pattern.chain_of_responsibility.request;

/**
 * @author mortal
 */
public class LeaveRequest implements Request {

    @Override
    public String request() {
        return "要请假, 项目组长审批!";
    }
}
