package ar.com.mercadolibre.tragamonedas;

import java.util.Random;

public class Tambor {
    private Integer posicion;
    private Random r = new Random();

    public Tambor(){
        this.posicion = r.nextInt(7) + 1;
    }

    public Integer getPosicion(){
        return posicion;
    }

    public void girar(){
        this.posicion = r.nextInt(7) + 1;
    }
}
