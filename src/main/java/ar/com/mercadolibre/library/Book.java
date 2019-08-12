package ar.com.mercadolibre.library;

public abstract class Book {
    private String bookTitle;
    private String bookEditorial;

    public Book(String bookTitle, String bookEditorial){
        this.bookTitle = bookTitle;
        this.bookEditorial = bookEditorial;
    }

    public String getTitle() {
        return this.bookTitle;
    }
}
