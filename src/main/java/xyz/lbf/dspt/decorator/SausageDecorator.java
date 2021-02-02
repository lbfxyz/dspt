package xyz.lbf.dspt.decorator;

/**
 * @author lbf
 * @date 2021/2/2
 */
public class SausageDecorator extends PancakesDecorator{

    public SausageDecorator(Pancakes pancakes) {
        super(pancakes);
    }

    @Override
    protected String getDescription() {
        return super.getDescription() + "加了 1 根香肠,";
    }

    @Override
    protected double cost() {
        return super.cost() + 2.5;
    }
}
