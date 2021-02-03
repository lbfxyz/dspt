package xyz.lbf.dspt.decorator.simple;

/**
 * @author lbf
 * @date 2021/2/2
 */
public class EggDecorator extends PancakesDecorator{

    public EggDecorator(Pancakes pancakes) {
        super(pancakes);
    }

    @Override
    protected String getDescription() {
        return super.getDescription() + "加了 1 个鸡蛋,";
    }

    @Override
    protected double cost() {
        return super.cost() + 1;
    }
}
