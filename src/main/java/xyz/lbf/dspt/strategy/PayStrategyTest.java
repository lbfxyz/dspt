package xyz.lbf.dspt.strategy;

/**
 * @author lbf
 * @date 2021/2/1
 */
public class PayStrategyTest {

    public static void main(String[] args) {
        double price = 1321.89;

        Payment payment = PayStrategy.get(PayStrategy.DEFAULT_PAY);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额:" + price);
        System.out.println(payment.pay(price));

    }

}
