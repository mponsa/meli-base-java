package ar.com.mercadolibre.envios;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;

public class EnvioTest {

    @Test
    public void debeCrearEnvioConPaquetesVehiculoFechaEntrega() {
        Envio envio = new Envio(new ArrayList<Paquete>(), new Camioneta(), "Calle falsa 123" , 100);

        Assertions.assertThat(envio).isNotNull();
    }
}
