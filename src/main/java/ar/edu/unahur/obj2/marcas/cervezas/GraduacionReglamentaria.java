package ar.edu.unahur.obj2.marcas.cervezas;

public final class GraduacionReglamentaria {
    private static GraduacionReglamentaria instance = new GraduacionReglamentaria();
    public Double graduacion = 1.00;

    private GraduacionReglamentaria(){

    }

    public static GraduacionReglamentaria getInstance(){
        return instance;
    }

    public Double getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(Double graduacion) {
        this.graduacion = graduacion;
    }

    
}
