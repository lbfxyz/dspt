package xyz.lbf.dspt.factorypattern.factorymethod;

import xyz.lbf.dspt.factorypattern.Book;

/**
 * @author lbf
 * @date 2020/12/10
 */
public class FactoryMethodTest {


    public static void main(String[] args) {
        BookFactory javaFactory = new JavaBookFactory();
        Book javaBook = javaFactory.create();
        javaBook.make();

        BookFactory pythonFactory = new PythonBookFactory();
        Book pythonBook = pythonFactory.create();
        pythonBook.make();
    }
}
