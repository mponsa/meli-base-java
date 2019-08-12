package ar.com.mercadolibre.envios;

import java.util.Date;
import java.util.List;

public class Envio {
    private List<Paquete> paquetes;
    private Vehiculo vehiculo;
    private String direccion;
    private Date fechaDeEnvio;
    private double costo;

    public Envio(List<Paquete> paquetes, Vehiculo vehiculo, String direccion, double costo){
        this.paquetes = paquetes;
        this.vehiculo = vehiculo;
        this.direccion = direccion;
        this.fechaDeEnvio = new Date();
        this.costo = costo;
    }
}
