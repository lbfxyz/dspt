package xyz.lbf.dspt.proxypattern.staticproxy;

/**
 * @author lbf
 * @date 2021/1/22
 */
public class HouseBuyerProxy implements Buyer{

    private final HouseBuyer houseBuyer;

    /**
     * 代理对象只能引用HouseBuyer
     * @param houseBuyer
     */
    public HouseBuyerProxy(HouseBuyer houseBuyer) {
        this.houseBuyer = houseBuyer;
    }

    @Override
    public void buy() {
        System.out.println("买房前需要验证是否符合购房资格，准备相关材料，办理手续");
        houseBuyer.buy();
    }
}
