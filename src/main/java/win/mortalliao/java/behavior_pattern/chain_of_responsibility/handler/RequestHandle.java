package win.mortalliao.java.behavior_pattern.chain_of_responsibility.handler;

import win.mortalliao.java.behavior_pattern.chain_of_responsibility.request.Request;

/**
 * @author mortal
 */
public interface  RequestHandle {

    void handleRequest(Request request);

}
