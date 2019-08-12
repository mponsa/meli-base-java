package ar.com.mercadolibre.envios;

import java.util.List;

public class CalculadorCosto {
    private Integer COSTO_SEGMENTO_UNO = 5;
    private Integer COSTO_SEGMENTO_DOS = 80;
    private Integer COSTO_POR_EXCEDENTE = 15;


    public CalculadorCosto() {}


    public double calcularCosto(List<Paquete> paquetes) {
        if (paquetes.size() < 5 && paquetes.size() > 0) {
            return COSTO_SEGMENTO_UNO;
        }
        if (paquetes.size() < 10 && paquetes.size() >= 5) {
            return COSTO_SEGMENTO_DOS;
        }
        if (paquetes.size() >10 ) {
            return COSTO_SEGMENTO_DOS + (paquetes.size() - 10) * COSTO_POR_EXCEDENTE;
        }
        throw new Error("No se puede calcular el costo si no hay paquetes");
    }
}
