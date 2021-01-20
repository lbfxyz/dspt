package xyz.lbf.dspt.singletonpattern;

/**
 * @author lbf
 * @date 2021/1/14
 */
public class HungryStyleSingleton {

    /**
     * 饿汉式
     * 一开始就实例化对象，当访问类的全局访问点的时候就返回这个对象，是线程安全的
     */
    private static final HungryStyleSingleton SINGLETON = new HungryStyleSingleton();

    private HungryStyleSingleton() {

    }

    public static HungryStyleSingleton getInstance() {
        return SINGLETON;
    }
}
