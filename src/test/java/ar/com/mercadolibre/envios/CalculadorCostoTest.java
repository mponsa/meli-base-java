package ar.com.mercadolibre.envios;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculadorCostoTest {

    @Test
    public void debeCrearCalculador() {
        CalculadorCosto calculador = new CalculadorCosto();

        Assertions.assertThat(calculador).isNotNull();
    }

    @Test
    public void debeCalcularCosto(){
        CalculadorCosto calculador = new CalculadorCosto();

        Paquete paquete1 = new Paquete(10);
        Paquete paquete2 = new Paquete (40);

        List<Paquete> paquetes = new ArrayList<Paquete>();

        paquetes.add(paquete1);
        paquetes.add(paquete2);

        Assertions.assertThat(calculador.calcularCosto(paquetes)).isGreaterThan(0);
    }

    @Test(expected = Error.class)
    public void noDebeCalcularElCostoSiNoHayPaquetes(){
        CalculadorCosto calculador = new CalculadorCosto();
        List<Paquete> paquetes = new ArrayList<Paquete>();
        Assertions.assertThat(calculador.calcularCosto(paquetes)).isGreaterThan(0);
    }
}
