package xyz.lbf.dspt.proxypattern.staticproxy;

/**
 * @author lbf
 * @date 2021/1/22
 */
public class HouseBuyer implements Buyer{

    @Override
    public void buy() {
        System.out.println("要买房");
    }
}
