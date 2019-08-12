package ar.com.mercadolibre.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Library {
    private static final Library INSTANCE =  new Library();
    private List<Rental> rentals;

    private Library() {
        this.rentals = new ArrayList<Rental>();
    }

    public static Library getInstance() {
        return INSTANCE;
    }

    public List<Rental> getRentals() {
        return this.rentals;
    }

    public void clearRentals() {
        this.rentals = new ArrayList<Rental>();
    }

    public void addRental(Rental rental){
        rentals.add(rental);
    }

//    public Rental searchRental(Book book) {
//        Optional<Rental> existsRental = getRentals().stream().filter(rental -> rental.getBook().equals(book)).findFirst();
//        if(existsRental.isPresent()){
//            return existsRental.get();
//        }else{
//            throw new Error("Book is not present in Rentals");
//        }
//    }
//
//    public void listRentedBooks() {
//        getRentals().stream().forEach(rental -> System.out.println("Titulo: " + rental.getBook().getTitle() + " Fecha: " + rental.getRentDate()));
//    }

}
