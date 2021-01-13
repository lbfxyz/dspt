package xyz.lbf.dspt.factorypattern.abstractfactory;

import xyz.lbf.dspt.factorypattern.*;

/**
 * @author lbf
 * @date 2020/12/10
 */
public class AlphaFactory implements BookFactory {

    @Override
    public Book createBook() {
        System.out.println("AlphaFactory暂时不生产书籍");
        return null;
    }

    @Override
    public Newspaper createNewspaper() {
        System.out.println("AlphaFactory生产的报纸");
        return new AlphaNewspaper();
    }

    @Override
    public Poster createPoster() {
        System.out.println("AlphaFactory生产的简单风格的海报");
        return new AlphaPoster();
    }
}
