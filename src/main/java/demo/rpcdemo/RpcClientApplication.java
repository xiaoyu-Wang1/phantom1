package demo.rpcdemo;

import demo.rpcdemo.clientservice.HelloService;
import demo.rpcdemo.framework.RpcFramework;

public class RpcClientApplication {
    public static void main(String[] args) {
        try {
            HelloService service = RpcFramework.refer(HelloService.class, "127.0.0.1", 1234);
            String hello = service.hello("MYRPC");
            System.out.println(hello);
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
