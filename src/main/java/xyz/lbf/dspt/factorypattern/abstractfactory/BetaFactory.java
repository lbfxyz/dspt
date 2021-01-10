package xyz.lbf.dspt.factorypattern.abstractfactory;

import xyz.lbf.dspt.factorypattern.*;

/**
 * @author lbf
 * @date 2020/12/10
 */
public class BetaFactory implements BookFactory {

    @Override
    public Book createBook() {
        return null;
    }

    @Override
    public Newspaper createNewspaper() {
        return new BetaNewspaper();
    }

    @Override
    public Poster createPoster() {
        return new BetaPoster();
    }

}
