package ar.com.mercadolibre.envios;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class VehiculoTest {

    @Test
    public void debeCrearCamioneta(){
        Camioneta camioneta = new Camioneta();

        Assertions.assertThat(camioneta).isNotNull();
    }

    @Test
    public void debeCrearAuto(){
        Auto auto = new Auto();

        Assertions.assertThat(auto).isNotNull();
    }

    @Test
    public void debeCrearBicicleta(){
        Bicicleta bicicleta = new Bicicleta();

        Assertions.assertThat(bicicleta).isNotNull();
    }
}
