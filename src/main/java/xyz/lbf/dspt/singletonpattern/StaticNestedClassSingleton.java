package xyz.lbf.dspt.singletonpattern;

/**
 * @author lbf
 * @date 2021/1/21
 */
public class StaticNestedClassSingleton {

    private StaticNestedClassSingleton() {

    }

    public static StaticNestedClassSingleton getInstance() {
        return SingletonHolder.SINGLETON;
    }

    private static class SingletonHolder{
        private static final StaticNestedClassSingleton SINGLETON = new StaticNestedClassSingleton();
    }
}
