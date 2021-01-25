package xyz.lbf.dspt.proxypattern.dynamicproxy.jdkproxy;

import xyz.lbf.dspt.proxypattern.staticproxy.Buyer;
import xyz.lbf.dspt.proxypattern.staticproxy.HouseBuyer;

/**
 * @author lbf
 * @date 2021/1/25
 */
public class HouseCompanyProxyTest {


    public static void main(String[] args) {

        Buyer buyer = (Buyer) new HouseCompanyProxy().getInstance(new HouseBuyer());
        buyer.buy();


    }

}
