package xyz.lbf.dspt.proxypattern.dynamicproxy.cglibproxy;

import org.springframework.cglib.core.DebuggingClassWriter;
import sun.misc.ProxyGenerator;
import xyz.lbf.dspt.proxypattern.staticproxy.Buyer;

import java.io.FileOutputStream;

/**
 * @author lbf
 * @date 2021/1/27
 */
public class CglibProxyTest {


    public static void main(String[] args) {

        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "external-file/cglib-debug");

        HouseBuyer buyer = (HouseBuyer) new CglibHouseCompanyProxy().getInstance(new HouseBuyer());
        buyer.buy();

    }

}
