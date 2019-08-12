package ar.com.mercadolibre.envios;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PaquetesTest {

   @Test
   public void debeCrearPaqueteConPeso(){
       Paquete paquete = new Paquete(10);

       Assertions.assertThat(paquete).isNotNull();
   }

   @Test(expected = Error.class)
    public void noDeberiaCrearPaqueteConPesoMenorCero() {
       Paquete paquete = new Paquete(-1);

       Assertions.assertThat(paquete).isNotNull();
   }

   @Test
    public void deberiaDevolverElPeso(){
       Paquete paquete = new Paquete(10);

       Assertions.assertThat(paquete.getPeso()).isEqualTo(10);
   }
}
