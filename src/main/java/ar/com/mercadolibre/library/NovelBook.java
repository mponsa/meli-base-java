package ar.com.mercadolibre.library;

public class NovelBook extends Book implements Rentable {
    private String author;
    private String edition;
    private boolean rented = false;

    public NovelBook(String bookTitle, String bookEditorial,String author, String edition){
        super(bookTitle,bookEditorial);
        this.author = author;
        this.edition = edition;
    }

    @Override
    public void rent() {
        this.rented = true;
    }

    @Override
    public void giveBack() {
        this.rented = false;
    }
}
