package xyz.lbf.dspt.proxypattern.dynamicproxy.jdkproxy;

import sun.misc.ProxyGenerator;
import xyz.lbf.dspt.proxypattern.staticproxy.Buyer;
import xyz.lbf.dspt.proxypattern.staticproxy.HouseBuyer;

import java.io.*;

/**
 * @author lbf
 * @date 2021/1/25
 */
public class HouseCompanyProxyTest {


    public static void main(String[] args) {

        Buyer buyer = (Buyer) new HouseCompanyProxy().getInstance(new HouseBuyer());
        buyer.buy();

        try {
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Buyer.class});
            FileOutputStream outputStream = new FileOutputStream("$Proxy0.class");
            outputStream.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
