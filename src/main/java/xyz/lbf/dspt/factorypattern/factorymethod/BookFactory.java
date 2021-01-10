package xyz.lbf.dspt.factorypattern.factorymethod;

import xyz.lbf.dspt.factorypattern.Book;

/**
 * @author lbf
 * @date 2020/12/10
 */
public interface BookFactory {

    /**
     * 创建对象接口的创建对象的方法，此时工厂不负责产品的创建，而是把创建对象的职责给了实现此接口的子类
     * @return
     */
    Book create();
}
