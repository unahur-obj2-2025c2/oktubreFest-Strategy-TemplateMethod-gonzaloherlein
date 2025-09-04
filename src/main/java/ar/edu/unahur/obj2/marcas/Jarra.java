package ar.edu.unahur.obj2.marcas;

import ar.edu.unahur.obj2.marcas.cervezas.Marca;

public class Jarra {
    private Double capacidadEnLitros;
    private Marca marca;

    public Jarra(Double capacidadEnLitros, Marca marca) {
        this.capacidadEnLitros = capacidadEnLitros;
        this.marca = marca;
    }

    public Double getCapacidadEnLitros() {
        return capacidadEnLitros;
    }

    public void setCapacidadEnLitros(Double capacidadEnLitros) {
        this.capacidadEnLitros = capacidadEnLitros;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Double contenidoDeAlcohol(){
        return capacidadEnLitros * marca.getGraduacion();
    }
}
