package xyz.lbf.dspt.strategy;

/**
 * @author lbf
 * @date 2021/2/1
 */
public abstract class Payment {

    /**
     * 获取支付方式名称
     * @return
     */
    public abstract String getName();

    /**
     * 获取余额
     * @return
     */
    public abstract double getBalance();


    public MsgResult pay(double price) {
        if (getBalance() < price) {
            return new MsgResult(500, "支付失败", "余额不足");
        }
        return new MsgResult(200, "支付成功", "支付金额" + price);
    }

}
