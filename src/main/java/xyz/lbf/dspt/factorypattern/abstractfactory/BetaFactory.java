package xyz.lbf.dspt.factorypattern.abstractfactory;

import xyz.lbf.dspt.factorypattern.*;

/**
 * @author lbf
 * @date 2020/12/10
 */
public class BetaFactory implements BookFactory {

    @Override
    public Book createBook() {
        System.out.println("BetaFactory生产的Python书籍");
        return new PythonBook();
    }

    @Override
    public Newspaper createNewspaper() {
        System.out.println("BetaFactory生产的报纸");
        return new BetaNewspaper();
    }

    @Override
    public Poster createPoster() {
        System.out.println("BetaFactory生产的精装海报");
        return new BetaPoster();
    }

}
