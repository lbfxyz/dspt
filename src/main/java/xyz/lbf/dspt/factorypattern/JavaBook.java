package xyz.lbf.dspt.factorypattern;

/**
 * @author lbf
 * @date 2020/12/9
 */
public class JavaBook implements Book {

    @Override
    public void make() {
        System.out.println("making java book...");
    }
}
