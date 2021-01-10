package xyz.lbf.dspt.factorypattern.factorymethod;

import xyz.lbf.dspt.factorypattern.Book;
import xyz.lbf.dspt.factorypattern.PythonBook;

/**
 * @author lbf
 * @date 2020/12/10
 */
public class PythonBookFactory implements BookFactory {

    @Override
    public Book create() {
        System.out.println("印刷Python书籍时的需求");
        System.out.println("我能大数据，我能AI，我无所不能");
        return new PythonBook();
    }
}
