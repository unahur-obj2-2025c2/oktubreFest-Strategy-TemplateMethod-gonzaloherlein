package ar.edu.unahur.obj2.marcas.cervezas;

import ar.edu.unahur.obj2.marcas.pais.Pais;

public abstract class Marca {
    private Double gramosDeLupulo;
    private Pais pais;

    public Marca(Double gramosDeLupulo, Pais pais) {
        this.gramosDeLupulo = gramosDeLupulo;
        this.pais = pais;
    }
    

    public Double getGramosDeLupulo() {
        return gramosDeLupulo;
    }


    public void setGramosDeLupulo(Double gramosDeLupulo) {
        this.gramosDeLupulo = gramosDeLupulo;
    }


    public Pais getPais() {
        return pais;
    }


    public void setPais(Pais pais) {
        this.pais = pais;
    }


    public abstract Double getGraduacion();
}