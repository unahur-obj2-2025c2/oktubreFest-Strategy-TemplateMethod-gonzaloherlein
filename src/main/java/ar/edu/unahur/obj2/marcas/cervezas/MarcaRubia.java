package ar.edu.unahur.obj2.marcas.cervezas;

public class MarcaRubia extends Marca{
    private Double graduacion;

    public MarcaRubia(Double gramosDeLupulo, String pais,Double graduacion) {
        super(gramosDeLupulo, pais);
        this.graduacion = graduacion;
    }

    @Override
    public Double getGraduacion() {
        return graduacion;
    }

}
