package xyz.lbf.dspt.strategy;

/**
 * @author lbf
 * @date 2021/2/1
 */
public class MsgResult {

    private int code;
    private Object data;
    private String msg;

    public MsgResult(int code, String msg, Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString(){
        return ("支付状态：[" + code + "]," + msg + ",交易详情：" + data);
    }

}
