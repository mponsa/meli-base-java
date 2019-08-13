package ar.com.mercadolibre.envios;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class DespachadorTest {
    @Mock
    private CalculadorCosto calculador;

    @Mock
    private AsignadorVehiculo asignador;


    @Test
    public void debeCrearUnDespachador() {
        Despachador despachador = Despachador.getInstancia();

        Assertions.assertThat(despachador).isNotNull();
    }

    @Test
    public void debeDespacharEnvio() {
        Despachador despachador = Despachador.getInstancia();

        Paquete paquete1 = new Paquete(10);
        Paquete paquete2 = new Paquete (40);

        Integer cantidadDeEnviosAnterior = despachador.getEnviosDespachados().size();

        List<Paquete> paquetes = new ArrayList<Paquete>();

        paquetes.add(paquete1);
        paquetes.add(paquete2);

        when(asignador.getVehiculo(paquetes)).thenReturn(new Camioneta());
        when(calculador.calcularCosto(paquetes)).thenReturn((double)500);

        despachador.despacharEnvio(paquetes,"Calle falsa 1233", asignador,calculador);

        Assertions.assertThat(cantidadDeEnviosAnterior).isLessThan(despachador.getEnviosDespachados().size());

    }
}
