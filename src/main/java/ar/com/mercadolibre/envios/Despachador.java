package ar.com.mercadolibre.envios;

import java.util.ArrayList;
import java.util.List;

public class Despachador {
    private List<Envio> enviosDespachados;
    private static final Despachador instancia = new Despachador();

    private Despachador(){
        this.enviosDespachados = new ArrayList<Envio>();
    }

     public static Despachador getInstancia(){
        return instancia;
    }

    public void despacharEnvio(List<Paquete> paquetes, String direccion, AsignadorVehiculo asignador, CalculadorCosto calculador) {
        double costo = calculador.calcularCosto(paquetes);
        if (enviosDespachados.size() > 10) {
           costo = costo * 1.1;
        }
        this.enviosDespachados.add(new Envio (paquetes, asignador.getVehiculo(paquetes), direccion, costo ));
    }

    public List<Envio> getEnviosDespachados(){
        return this.enviosDespachados;
    }
}
