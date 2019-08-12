package ar.com.mercadolibre.library;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class LibraryTest {
//    @Before public void initialize() {
//        Library library = Library.getInstance();
//        library.clearRentals();
//    }
//
//    @Test
//    public void shouldCreateLibrary(){
//        Library library = Library.getInstance();
//        Assertions.assertThat(library).isNotNull();
//    }
//
//    @Test
//    public void shouldCreateLibraryWithEmptyRentals() {
//        Library library = Library.getInstance();
//
//        Assertions.assertThat(library.getRentals().size()).isEqualTo(0);
//    }
//
//    @Test
//    public void shouldAddRental(){
//        Book book = new StudyBook("Crime & Punishment","Salamandra","Crime");
//        Rental rental = new Rental(book,new Date(), new Date());
//        Library library = Library.getInstance();
//
//        int previousRentals = library.getRentals().size();
//
//        library.addRental(rental);
//
//        Assertions.assertThat(previousRentals).isLessThan(library.getRentals().size());
//
//    }
//
//
//    @Test
//    public void shouldLookForExistingRentedBook(){
//        Book book = new StudyBook("Crime & Punishment","Salamandra","Crime");
//        Rental rental = new Rental(book,new Date(), new Date());
//        Library library = Library.getInstance();
//        library.addRental(rental);
//
//        Assertions.assertThat(library.searchRental(book)).isInstanceOf(Rental.class);
//    }
//
//    @Test(expected = Error.class)
//    public void shouldFailedWhileLookingForNotExistingRentedBook(){
//        Book rented_book = new StudyBook("Crime & Punishment","Salamandra","Crime");
//        Rental rental = new Rental(rented_book,new Date(), new Date());
//        Library library = Library.getInstance();
//        library.addRental(rental);
//
//        Book book = new StudyBook("Crime & Punishment Second Version","Salamandra","Crime");
//
//        Assertions.assertThat(library.searchRental(book)).isInstanceOf(Rental.class);
//    }
//
//   @Test
//    public void shouldPrintTitlesAndDateOfRental(){
//        Book rented_book = new StudyBook("Crime & Punishment","Salamandra","Crime");
//        Rental rental = new Rental(rented_book,new Date(), new Date());
//        Library library = Library.getInstance();
//        library.addRental(rental);
//
//        library.listRentedBooks();
//    }



}
