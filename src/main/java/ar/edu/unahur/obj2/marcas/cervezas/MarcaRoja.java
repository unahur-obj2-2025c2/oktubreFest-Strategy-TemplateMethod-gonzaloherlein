package ar.edu.unahur.obj2.marcas.cervezas;

public class MarcaRoja extends Marca{

    public MarcaRoja(Double gramosDeLupulo, String pais) {
        super(gramosDeLupulo, pais);
    }

    @Override
    public Double getGraduacion() {
        return Math.min(GraduacionReglamentaria.getInstance().getGraduacion(), getGramosDeLupulo() * 2) * 1.25;
    }

}
