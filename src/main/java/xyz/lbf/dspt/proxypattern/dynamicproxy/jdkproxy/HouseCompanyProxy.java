package xyz.lbf.dspt.proxypattern.dynamicproxy.jdkproxy;

import xyz.lbf.dspt.proxypattern.staticproxy.Buyer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lbf
 * @date 2021/1/25
 */
public class HouseCompanyProxy implements InvocationHandler {

    private Buyer target;

    public Object getInstance(Buyer buyer) {
        this.target = buyer;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target, args);
    }

}
