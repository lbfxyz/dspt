package xyz.lbf.dspt.factorypattern.simplefactory;

import xyz.lbf.dspt.factorypattern.Book;
import xyz.lbf.dspt.factorypattern.JavaBook;
import xyz.lbf.dspt.factorypattern.PythonBook;

/**
 * @author lbf
 * @date 2020/12/9
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        Book book = BookFactory.creat(JavaBook.class);
        book.make();

        book = BookFactory.creat(PythonBook.class);
        book.make();
    }

}
