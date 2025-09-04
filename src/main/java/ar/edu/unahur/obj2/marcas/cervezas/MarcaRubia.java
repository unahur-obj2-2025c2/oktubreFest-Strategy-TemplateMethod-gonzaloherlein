package ar.edu.unahur.obj2.marcas.cervezas;

import ar.edu.unahur.obj2.marcas.pais.Pais;

public class MarcaRubia extends Marca{
    private Double graduacion;

    public MarcaRubia(Double gramosDeLupulo, Pais pais,Double graduacion) {
        super(gramosDeLupulo, pais);
        this.graduacion = graduacion;
    }

    @Override
    public Double getGraduacion() {
        return graduacion;
    }

}
