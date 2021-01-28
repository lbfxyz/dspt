package xyz.lbf.dspt.delegate.simple;

/**
 * @author lbf
 * @date 2021/1/28
 */
public class Boss {

    public void command(String command, Leader leader) {
        leader.doing(command);
    }
}
