package win.mortalliao.java.behavior_pattern.chain_of_responsibility.request;

/**
 * @author mortal
 */
public class AddMoneyRequest implements Request {

    @Override
    public String request() {
        return "要加薪, 项目经理审批!";
    }
}
