package xyz.lbf.dspt.strategy;

/**
 * @author lbf
 * @date 2021/2/1
 */
public class AliPay extends Payment{

    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public double getBalance() {
        return 500;
    }
}
