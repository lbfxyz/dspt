package xyz.lbf.dspt.delegate.simple;

/**
 * @author lbf
 * @date 2021/1/28
 */
public interface Employee {

    /**
     * 接收任务指令工作
     * @param command
     */
    void working(String command);
}
