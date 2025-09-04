package ar.edu.unahur.obj2.marcas.pais;

import ar.edu.unahur.obj2.marcas.Carpa;
import ar.edu.unahur.obj2.marcas.cervezas.Marca;

public class RepublicaCheca implements Pais{

    @Override
    public Boolean leGusta_(Marca marca) {
        return marca.getGraduacion() > 0.08;
    }

    @Override
    public Boolean quiereEntrar(Carpa carpa) {
        return Boolean.TRUE;
    }
}
