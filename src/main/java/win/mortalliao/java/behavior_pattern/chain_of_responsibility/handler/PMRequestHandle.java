package win.mortalliao.java.behavior_pattern.chain_of_responsibility.handler;

import win.mortalliao.java.behavior_pattern.chain_of_responsibility.request.AddMoneyRequest;
import win.mortalliao.java.behavior_pattern.chain_of_responsibility.request.Request;

/**
 * @author mortal
 */
public class PMRequestHandle implements RequestHandle {

    RequestHandle rh;

    public PMRequestHandle(RequestHandle rh) {
        this.rh = rh;
    }

    @Override
    public void handleRequest(Request request) {
        if (request instanceof AddMoneyRequest) {
            System.out.println(request.request());
        } else {
            rh.handleRequest(request);
        }
    }
}
