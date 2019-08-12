package ar.com.mercadolibre.envios;

import java.util.List;

public class AsignadorVehiculo {

    public AsignadorVehiculo() {};


    public Vehiculo getVehiculo(List<Paquete> paquetes) {
        Integer peso = paquetes.stream().mapToInt(paquete -> paquete.getPeso()).sum();
        if (peso <= 0) {
            throw new Error("No se puede asignar vehículo si no hay paqutes");
        }
        if (peso <= 5) {
            return new Bicicleta();
        }
        if (peso <= 10 && peso > 5) {
            return new Auto();
        }
        if (peso <= 150 && peso > 10) {
            return new Camioneta();
        }
        throw new Error("No se puede asignar un vehículo a un grupo de paquetes que supere los 150kg");
    }
}
