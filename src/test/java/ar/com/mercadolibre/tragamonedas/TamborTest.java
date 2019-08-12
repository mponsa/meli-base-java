package ar.com.mercadolibre.tragamonedas;


import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class TamborTest {

    @Test
    public void debeCrearTambor(){
        Tambor tambor = new Tambor();

        Assertions.assertThat(tambor).isNotNull();
    }

    @Test
    public void debeCrearTamborConPosicionInicial(){
        Tambor tambor = new Tambor();

        Assertions.assertThat(tambor.getPosicion()).isBetween(1,8);
    }


    @Test
    public void debeGirarYMantenerseEnlimite(){
        Tambor tambor = new Tambor();
        tambor.girar();

        Assertions.assertThat(tambor.getPosicion()).isBetween(1,8);
    }

}
