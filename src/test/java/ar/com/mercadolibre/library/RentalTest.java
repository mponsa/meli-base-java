package ar.com.mercadolibre.library;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Date;

public class RentalTest {
    @Test
    public void shouldCreateRental() {
        Rental rental = new Rental(new StudyBook("Crime & Punishment","Salamandra","Crime"),
                new Date(),
                new Date());

        Assertions.assertThat(rental).isNotNull();
    }
}
