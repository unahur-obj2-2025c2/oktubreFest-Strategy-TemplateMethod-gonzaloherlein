package ar.edu.unahur.obj2.marcas.cervezas;

public class MarcaNegra extends Marca{



    public MarcaNegra(Double gramosDeLupulo, String pais) {
        super(gramosDeLupulo, pais);
    }

    @Override
    public Double getGraduacion() {
        return Math.min(GraduacionReglamentaria.getInstance().getGraduacion(), getGramosDeLupulo() * 2);
    }

}
