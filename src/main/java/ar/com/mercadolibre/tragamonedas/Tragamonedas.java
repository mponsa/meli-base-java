package ar.com.mercadolibre.tragamonedas;

import java.util.ArrayList;
import java.util.List;

public class Tragamonedas {
    private List<Tambor> tambores;
    private Integer cantidadTambores = 3;
    private Integer juegosRealizados = 0;
    private boolean premio;

    public Tragamonedas() {
        tambores = new ArrayList<Tambor>(cantidadTambores);
        for (int i = 0; i < cantidadTambores; i++) {
            tambores.add(new Tambor());
        }
    }



    public void activar() {
        this.premio = true;
        this.tambores.stream().forEach(tambor -> tambor.girar());
        juegosRealizados++;

        for (int i = 0; i < this.cantidadTambores - 1; i++) {
            if (this.tambores.get(i) != this.tambores.get(i++)) {
                this.premio = false;
            }
        }
    }

    public boolean entregaPremio(){
        return premio;
    }

    public Integer getJuegosRealizados(){
        return juegosRealizados;
    }

}
