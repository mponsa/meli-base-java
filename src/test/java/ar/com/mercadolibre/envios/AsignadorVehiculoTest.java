package ar.com.mercadolibre.envios;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AsignadorVehiculoTest {
    @Test
    public void debeCrearAsignadorVehiculo() {
        AsignadorVehiculo asignador = new AsignadorVehiculo();

        Assertions.assertThat(asignador).isNotNull();
    }

    @Test
    public void debeAsignarVehiculoAlEnvio() {
        AsignadorVehiculo asignador = new AsignadorVehiculo();

        List<Paquete> paquetes = new ArrayList<Paquete>();
        Paquete paquete1 = new Paquete(10);
        Paquete paquete2 = new Paquete (40);
        paquetes.add(paquete1);
        paquetes.add(paquete2);

        Assertions.assertThat(asignador.getVehiculo(paquetes)).isInstanceOf(Vehiculo.class);
    }
}
