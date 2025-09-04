package ar.edu.unahur.obj2.marcas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.marcas.cervezas.MarcaRoja;
import ar.edu.unahur.obj2.marcas.cervezas.Marca;

public class JarraTest {
    @Test
    void testContenidoDeAlcohol() {
        Marca marcaRoja = new MarcaRoja(0.032,"Alemania");
        Jarra jarra = new Jarra(0.5, marcaRoja);
        assertEquals(0.04, jarra.contenidoDeAlcohol());
    }
}
