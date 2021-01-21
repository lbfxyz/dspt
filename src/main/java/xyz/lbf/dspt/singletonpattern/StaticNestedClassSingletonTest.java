package xyz.lbf.dspt.singletonpattern;

/**
 * @author lbf
 * @date 2021/1/21
 */
public class StaticNestedClassSingletonTest {


    public static void main(String[] args) {

        Thread t1 = new Thread(new StaticNestedClassSingletonRunnable());
        Thread t2 = new Thread(new StaticNestedClassSingletonRunnable());


        t1.start();
        t2.start();
    }

}
