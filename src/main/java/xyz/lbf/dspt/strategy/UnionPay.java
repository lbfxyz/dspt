package xyz.lbf.dspt.strategy;

/**
 * @author lbf
 * @date 2021/2/1
 */
public class UnionPay extends Payment{
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    public double getBalance() {
        return 280;
    }
}
