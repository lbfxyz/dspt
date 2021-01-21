package xyz.lbf.dspt.singletonpattern;

/**
 * @author lbf
 * @date 2021/1/21
 */
public class LazyStyleSingletonTest {


    public static void main(String[] args) {

        Thread t1 = new Thread(new SingletonRunnable());
        Thread t2 = new Thread(new SingletonRunnable());


        t1.start();
        t2.start();
    }

}
