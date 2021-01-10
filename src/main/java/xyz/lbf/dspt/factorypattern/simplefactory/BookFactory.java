package xyz.lbf.dspt.factorypattern.simplefactory;

import xyz.lbf.dspt.factorypattern.Book;

/**
 * @author lbf
 * @date 2020/12/9
 */
public class BookFactory {

    public static Book creat(Class clazz) {
        if (clazz != null) {
            try {
                return (Book) clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
