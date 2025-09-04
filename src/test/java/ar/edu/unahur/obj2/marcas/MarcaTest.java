package ar.edu.unahur.obj2.marcas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.marcas.cervezas.MarcaRubia;
import ar.edu.unahur.obj2.marcas.cervezas.Marca;
import ar.edu.unahur.obj2.marcas.cervezas.MarcaNegra;
import ar.edu.unahur.obj2.marcas.cervezas.MarcaRoja;

public class MarcaTest {

    @Test
    public void crearMarcaDeCervezaRubiaYQueSuGraduacionSea4() {
        Marca marcaRubia = new MarcaRubia(2.0,"Alemania",4.0);
        assertEquals(4.0, marcaRubia.getGraduacion());
    }

    @Test
    public void crearMarcaDeCervezaNegraYQueSuGraduacionSea05() {
        Marca marcaNegra = new MarcaNegra(2.0,"Alemania");
        assertEquals(1, marcaNegra.getGraduacion());
    } 
    
    @Test
    public void crearMarcaDeCervezaRojaYQueSuGraduacionSea063() {
        Marca marcaRoja = new MarcaRoja(2.0,"Alemania");
        assertEquals(1.25, marcaRoja.getGraduacion());
    }  
}
