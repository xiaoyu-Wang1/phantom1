package demo.rpcdemo;

import demo.rpcdemo.framework.RpcFramework;
import demo.rpcdemo.service.HelloService;
import demo.rpcdemo.serviceImpl.HelloServiceImpl;

public class RpcServerApplication {
    public static void main(String[] args) {
        HelloService service = new HelloServiceImpl();
        try {
            RpcFramework.export(service, 1234);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
