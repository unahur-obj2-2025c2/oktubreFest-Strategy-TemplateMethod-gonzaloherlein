package ar.edu.unahur.obj2.marcas.pais;

import ar.edu.unahur.obj2.marcas.Carpa;
import ar.edu.unahur.obj2.marcas.cervezas.Marca;

public interface Pais {
    Boolean leGusta_(Marca marca);

    Boolean quiereEntrar(Carpa carpa);
}
