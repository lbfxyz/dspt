package xyz.lbf.dspt.singletonpattern;

/**
 * @author lbf
 * @date 2021/1/20
 */
public class LazyStyleSingleton {

    private volatile static LazyStyleSingleton instance;

    private LazyStyleSingleton() {

    }

    public static LazyStyleSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyStyleSingleton.class) {
                if (instance == null) {
                    instance = new LazyStyleSingleton();
                }
            }
        }
        return instance;
    }

}
