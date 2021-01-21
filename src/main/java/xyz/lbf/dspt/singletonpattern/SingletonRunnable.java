package xyz.lbf.dspt.singletonpattern;

/**
 * @author lbf
 * @date 2021/1/21
 */
public class SingletonRunnable implements Runnable{

    @Override
    public void run() {
        LazyStyleSingleton singleton = LazyStyleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" +singleton);
    }
}
