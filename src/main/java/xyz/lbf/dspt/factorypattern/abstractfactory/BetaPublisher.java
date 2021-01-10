package xyz.lbf.dspt.factorypattern.abstractfactory;

/**
 * @author lbf
 * @date 2020/12/11
 */
public class BetaPublisher extends Publisher {

    private final BookFactory bookFactory;

    public BetaPublisher(BookFactory bookFactory) {
        this.bookFactory = bookFactory;
    }

    @Override
    void produce() {
        System.out.println("这是beta出版社要的产品");
        book = bookFactory.createBook();
        poster = bookFactory.createPoster();
        newspaper = bookFactory.createNewspaper();
    }
}
