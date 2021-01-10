package xyz.lbf.dspt.factorypattern.abstractfactory;

/**
 * @author lbf
 * @date 2020/12/11
 */
public class AlphaPublisher extends Publisher {

    private final BookFactory bookFactory;

    public AlphaPublisher(BookFactory bookFactory) {
        this.bookFactory = bookFactory;
    }

    @Override
    void produce() {
        System.out.println("这是alpha出版社要的产品");
        book = bookFactory.createBook();
        poster = bookFactory.createPoster();
        newspaper = bookFactory.createNewspaper();
    }
}
