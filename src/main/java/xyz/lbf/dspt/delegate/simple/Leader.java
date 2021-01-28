package xyz.lbf.dspt.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lbf
 * @date 2021/1/28
 */
public class Leader {

    private Map<String, Employee> register = new HashMap<>();

    public Leader() {
        register.put("writing", new EmployeeW());
        register.put("coding", new EmployeeC());
    }

    public void doing(String command) {
        register.get(command).working(command);
    }

}
