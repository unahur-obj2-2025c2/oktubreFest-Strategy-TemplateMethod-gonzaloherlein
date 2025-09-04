package ar.edu.unahur.obj2.marcas.cervezas;

public abstract class Marca {
    private Double gramosDeLupulo;
    private String pais;

    public Marca(Double gramosDeLupulo, String pais) {
        this.gramosDeLupulo = gramosDeLupulo;
        this.pais = pais;
    }
    

    public Double getGramosDeLupulo() {
        return gramosDeLupulo;
    }


    public void setGramosDeLupulo(Double gramosDeLupulo) {
        this.gramosDeLupulo = gramosDeLupulo;
    }


    public String getPais() {
        return pais;
    }


    public void setPais(String pais) {
        this.pais = pais;
    }


    public abstract Double getGraduacion();
}