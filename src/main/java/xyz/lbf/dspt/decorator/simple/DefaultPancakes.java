package xyz.lbf.dspt.decorator.simple;

/**
 * @author lbf
 * @date 2021/2/2
 */
public class DefaultPancakes extends Pancakes{

    @Override
    protected String getDescription() {
        return "空白煎饼";
    }

    @Override
    protected double cost() {
        return 5;
    }
}
