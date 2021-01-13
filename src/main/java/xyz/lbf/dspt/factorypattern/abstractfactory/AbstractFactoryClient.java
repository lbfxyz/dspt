package xyz.lbf.dspt.factorypattern.abstractfactory;

import java.util.Locale;

/**
 * @author lbf
 * @date 2020/12/11
 */
public class AbstractFactoryClient {

    public static void main(String[] args) {
        BookFactory alphaFactory = new AlphaFactory();
        Publisher publisher = new AlphaPublisher(alphaFactory);
        publisher.produce();

        BookFactory betaFactory = new BetaFactory();
        publisher = new BetaPublisher(betaFactory);
        publisher.produce();

        String osName = System.getProperty("os.name").toLowerCase(Locale.ROOT);

        System.out.println(osName);

    }

}
