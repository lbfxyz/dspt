package xyz.lbf.dspt.factorypattern.abstractfactory;

import xyz.lbf.dspt.factorypattern.Book;
import xyz.lbf.dspt.factorypattern.Newspaper;
import xyz.lbf.dspt.factorypattern.Poster;

/**
 * @author lbf
 * @date 2020/12/11
 */
public abstract class Publisher {

    Book book;

    Poster poster;

    Newspaper newspaper;


    /**
     * 生成印刷品
     */
    abstract void produce();

}
