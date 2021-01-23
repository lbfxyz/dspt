package xyz.lbf.dspt.proxypattern.staticproxy;

/**
 * @author lbf
 * @date 2021/1/22
 */
public class HouseBuyerProxyTest {

    public static void main(String[] args) {
        HouseBuyer houseBuyer = new HouseBuyer();
        Buyer buyer = new HouseBuyerProxy(houseBuyer);
        buyer.buy();

    }

}
