package xyz.lbf.dspt.decorator;

/**
 * @author lbf
 * @date 2021/2/2
 */
public class DecoratorTest {

    public static void main(String[] args) {
        // 初始化一个什么都不加的煎饼
        Pancakes pancakes = new DefaultPancakes();
        pancakes = new EggDecorator(pancakes);
        pancakes = new SausageDecorator(pancakes);
        pancakes = new SausageDecorator(pancakes);

        System.out.println(pancakes.getDescription() + " 价格：" + pancakes.cost());

    }

}
