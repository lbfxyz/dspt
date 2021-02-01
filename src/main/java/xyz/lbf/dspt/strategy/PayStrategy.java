package xyz.lbf.dspt.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lbf
 * @date 2021/2/1
 */
public class PayStrategy {

    public static final String ALI_PAY = "ali_pay";
    public static final String WECHAT_PAY = "wechat_pay";
    public static final String UNION_PAY = "union_pay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static Map<String, Payment> payStrategy = new HashMap<>();

    static {
        payStrategy.put(ALI_PAY, new AliPay());
        payStrategy.put(WECHAT_PAY, new WechatPay());
        payStrategy.put(UNION_PAY, new UnionPay());
    }

    public static Payment get(String key) {
        if (!payStrategy.containsKey(key)) {
            return payStrategy.get(DEFAULT_PAY);
        }
        return payStrategy.get(key);
    }
}
