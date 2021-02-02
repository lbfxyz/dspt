package xyz.lbf.dspt.decorator;

/**
 * @author lbf
 * @date 2021/2/2
 */
public abstract class PancakesDecorator extends Pancakes{

    private Pancakes pancakes;

    public PancakesDecorator(Pancakes pancakes) {
        this.pancakes = pancakes;
    }

    @Override
    protected String getDescription() {
        return pancakes.getDescription();
    }

    @Override
    protected double cost() {
        return pancakes.cost();
    }
}
