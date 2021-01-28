package xyz.lbf.dspt.delegate.simple;

/**
 * @author lbf
 * @date 2021/1/28
 */
public class EmployeeC implements Employee{

    @Override
    public void working(String command) {
        System.out.println("我接到委派【" + command + "】，要开始编码了" );
    }
}
