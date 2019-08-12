package ar.com.mercadolibre.library;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BookTest {
    @Test
    public void shouldCreateStudyBook(){
        Book book = new StudyBook("Crime & Punishment","Salamandra","Crime");

        Assertions.assertThat(book).isNotNull();
    }
}
