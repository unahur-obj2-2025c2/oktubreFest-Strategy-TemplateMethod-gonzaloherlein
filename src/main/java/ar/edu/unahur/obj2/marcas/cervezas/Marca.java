package ar.edu.unahur.obj2.marcas.cervezas;

public abstract class Marca {
    private Double gramosDeLupulo;
    private String pais;

    public Marca(Double gramosDeLupulo, String pais) {
        this.gramosDeLupulo = gramosDeLupulo;
        this.pais = pais;
    }

    public abstract Double getGraduacion();
}