package xyz.lbf.dspt.factorypattern.abstractfactory;

import xyz.lbf.dspt.factorypattern.Book;
import xyz.lbf.dspt.factorypattern.Newspaper;
import xyz.lbf.dspt.factorypattern.Poster;

/**
 * @author lbf
 * @date 2020/12/10
 */
public interface BookFactory {

    /**
     * 生产书籍
     * @return
     */
    Book createBook();

    /**
     * 生产报纸
     * @return
     */
    Newspaper createNewspaper();

    /**
     * 生产海报
     * @return
     */
    Poster createPoster();

}
