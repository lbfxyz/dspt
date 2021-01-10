package xyz.lbf.dspt.factorypattern;

/**
 * @author lbf
 * @date 2020/12/9
 */
public class PythonBook implements Book {

    @Override
    public void make() {
        System.out.println("making python book...");
    }
}
