package xyz.lbf.dspt.singletonpattern;

/**
 * @author lbf
 * @date 2021/1/21
 */
public class StaticNestedClassSingletonRunnable implements Runnable{

    @Override
    public void run() {
        StaticNestedClassSingleton singleton = StaticNestedClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" +singleton);
    }
}
