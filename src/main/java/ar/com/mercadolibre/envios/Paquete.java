package ar.com.mercadolibre.envios;

public class Paquete {
    private Integer peso;

    public Paquete(Integer peso){
        if (peso <= 0) {
            throw new Error("No se puede crear un paquete con peso menor o igual a 0kg");
        }
        this.peso = peso;
    }

    public Integer getPeso() {
        return this.peso;
    }
}
