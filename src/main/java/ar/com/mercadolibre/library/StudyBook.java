package ar.com.mercadolibre.library;

public class StudyBook extends Book implements Rentable {
    private String studyTopic;
    private boolean rented = false;

    public StudyBook(String bookTitle, String bookEditorial,String studyTopic){
        super(bookTitle,bookEditorial);
        this.studyTopic = studyTopic;
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
