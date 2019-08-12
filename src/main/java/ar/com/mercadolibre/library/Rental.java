package ar.com.mercadolibre.library;

import java.util.Date;

public class Rental {
    private Rentable rentable;
    private Date rentDate;
    private Date dueDate;

    public Rental(Rentable rentable, Date rentDate, Date dueDate) {
        this.rentable = rentable;
        this.rentable.rent();
        this.rentDate = rentDate;
        this.dueDate = dueDate;
    }

    public Rentable getRentable() {
        return this.rentable;
    }

    public Date getRentDate() {
        return this.rentDate;
    }


}
