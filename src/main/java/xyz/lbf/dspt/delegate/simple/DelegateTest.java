package xyz.lbf.dspt.delegate.simple;

/**
 * @author lbf
 * @date 2021/1/28
 */
public class DelegateTest {


    public static void main(String[] args) {
        new Boss().command("coding", new Leader());
    }
}
