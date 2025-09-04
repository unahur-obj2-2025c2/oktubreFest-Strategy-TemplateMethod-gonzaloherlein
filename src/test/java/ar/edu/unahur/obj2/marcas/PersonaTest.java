package ar.edu.unahur.obj2.marcas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.marcas.cervezas.Marca;
import ar.edu.unahur.obj2.marcas.cervezas.MarcaNegra;
import ar.edu.unahur.obj2.marcas.cervezas.MarcaRoja;
import ar.edu.unahur.obj2.marcas.cervezas.MarcaRubia;

public class PersonaTest {
        Marca marcaRoja = new MarcaRoja(2.0,"Alemania");
        Marca marcaNegra = new MarcaNegra(2.0,"Alemania");
        Marca marcaRubia = new MarcaRubia(2.0,"Alemania",4.0);
        Jarra jarra1 = new Jarra(0.5, marcaRoja);
        Jarra jarra2 = new Jarra(0.5, marcaNegra);
        Jarra jarra3 = new Jarra(0.5, marcaRubia);

    @Test
    void testCantidadDeAlcoholConsumida() {
        Persona persona = new Persona(60.00,Boolean.TRUE, 6);
        persona.beber(jarra1);
        persona.beber(jarra2);
        persona.beber(jarra3);
        Double cantidadDeAlcoholEsperada = 0.625 + 0.5 + 2.0;
        assertEquals(cantidadDeAlcoholEsperada, persona.cantidadDeAlcoholConsumida());
    }

    @Test
    void testEstaEbria() {
        Persona persona = new Persona(60.00,Boolean.TRUE, 6);
        persona.beber(jarra1);
        persona.beber(jarra2);
        persona.beber(jarra3);
        assertTrue(persona.estaEbria());
    }

    @Test
    void testLeGusta_() {
        Persona persona = new Persona(60.00,Boolean.TRUE, 6);
        assertTrue(persona.leGusta_(marcaRubia));
        assertTrue(persona.leGusta_(marcaNegra));
        assertTrue(persona.leGusta_(marcaRoja));
    }
}
