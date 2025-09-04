package ar.edu.unahur.obj2.marcas.pais;

import ar.edu.unahur.obj2.marcas.Carpa;
import ar.edu.unahur.obj2.marcas.cervezas.Marca;

public class Alemania implements Pais{

    @Override
    public Boolean leGusta_(Marca marca) {
        return Boolean.TRUE;
    }

    @Override
    public Boolean quiereEntrar(Carpa carpa) {
        return (carpa.getPersonasAdentro().size() % 2 == 0) ? true : false;
    }

}
