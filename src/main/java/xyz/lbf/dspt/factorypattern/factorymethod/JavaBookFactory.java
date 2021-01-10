package xyz.lbf.dspt.factorypattern.factorymethod;

import xyz.lbf.dspt.factorypattern.Book;
import xyz.lbf.dspt.factorypattern.JavaBook;

/**
 * @author lbf
 * @date 2020/12/10
 */
public class JavaBookFactory implements BookFactory{

    @Override
    public Book create() {
        System.out.println("印刷Java书籍时的其他要求");
        System.out.println("没有对象New一个就有了");
        return new JavaBook();
    }
}
