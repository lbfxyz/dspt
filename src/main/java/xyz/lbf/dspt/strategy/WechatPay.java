package xyz.lbf.dspt.strategy;

/**
 * @author lbf
 * @date 2021/2/1
 */
public class WechatPay extends Payment{

    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    public double getBalance() {
        return 300;
    }
}
