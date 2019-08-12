package ar.com.mercadolibre.tragamonedas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TragamonedasTest {

    @Test
    public void debeCrearTragamonedasConTambores() {
        Tragamonedas tragamoneda = new Tragamonedas();

        Assertions.assertThat(tragamoneda).isNotNull();
    }

    @Test
    public void debeActivarseElTragamonedas() {
        Tragamonedas tragamoneda = new Tragamonedas();
        Integer juegosRealizadosAnteriormente = tragamoneda.getJuegosRealizados();
        tragamoneda.activar();

        Assertions.assertThat(juegosRealizadosAnteriormente).isLessThan(tragamoneda.getJuegosRealizados());
    }

//    @Test
//    public void debeEntregarPremioSiLuegoDeGirarLosTresTamboresTienenElMismoNumero() {
//        Tragamonedas tragamoneda = new Tragamonedas();
//        tragamoneda.activar();
//
//        Assertions.assertThat(tragamoneda.entregaPremio()).isEqualTo(true);
//    }
}
