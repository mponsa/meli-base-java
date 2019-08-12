package ar.com.mercadolibre.library;

public class ChildBook extends Book {
    private Integer fromAge;
    private Integer toAge;

    public ChildBook(String bookTitle, String bookEditorial,Integer fromAge, Integer toAge){
        super(bookTitle,bookEditorial);
        this.fromAge = fromAge;
        this.toAge = toAge;
    }

}
