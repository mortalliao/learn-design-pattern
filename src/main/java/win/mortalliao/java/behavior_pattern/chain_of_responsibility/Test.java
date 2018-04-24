package win.mortalliao.java.behavior_pattern.chain_of_responsibility;

import win.mortalliao.java.behavior_pattern.chain_of_responsibility.handler.HRRequestHandle;
import win.mortalliao.java.behavior_pattern.chain_of_responsibility.handler.PMRequestHandle;
import win.mortalliao.java.behavior_pattern.chain_of_responsibility.handler.RequestHandle;
import win.mortalliao.java.behavior_pattern.chain_of_responsibility.handler.TLRequestHandle;
import win.mortalliao.java.behavior_pattern.chain_of_responsibility.request.AddMoneyRequest;
import win.mortalliao.java.behavior_pattern.chain_of_responsibility.request.DimissionRequest;
import win.mortalliao.java.behavior_pattern.chain_of_responsibility.request.Request;

/**
 * @author mortal
 */
public class Test {

    public static void main(String[] args) {
        RequestHandle hr = new HRRequestHandle();
        RequestHandle pm = new PMRequestHandle(hr);
        RequestHandle tl = new TLRequestHandle(pm);

        //team leader处理离职请求
        Request request = new DimissionRequest();
        tl.handleRequest(request);

        System.out.println("===========");
        //team leader处理加薪请求
        request = new AddMoneyRequest();
        tl.handleRequest(request);

        System.out.println("========");
        //项目经理上理辞职请求
        request = new DimissionRequest();
        pm.handleRequest(request);
    }
}
