package win.mortalliao.java.behavior_pattern.chain_of_responsibility.handler;

import win.mortalliao.java.behavior_pattern.chain_of_responsibility.request.LeaveRequest;
import win.mortalliao.java.behavior_pattern.chain_of_responsibility.request.Request;

/**
 * @author mortal
 */
public class TLRequestHandle implements RequestHandle {

    RequestHandle rh;

    public TLRequestHandle(RequestHandle rh) {
        this.rh = rh;
    }

    @Override
    public void handleRequest(Request request) {
        if (request instanceof LeaveRequest) {
            System.out.println(request.request());
        } else {
            rh.handleRequest(request);
        }
    }
}
