package win.mortalliao.java.behavior_pattern.chain_of_responsibility.handler;

import win.mortalliao.java.behavior_pattern.chain_of_responsibility.request.DimissionRequest;
import win.mortalliao.java.behavior_pattern.chain_of_responsibility.request.Request;

/**
 * @author mortal
 */
public class HRRequestHandle implements RequestHandle {

    @Override
    public void handleRequest(Request request) {
        if (request instanceof DimissionRequest) {
            System.out.println(request.request());
        }

        System.out.println("请求完毕");
    }
}