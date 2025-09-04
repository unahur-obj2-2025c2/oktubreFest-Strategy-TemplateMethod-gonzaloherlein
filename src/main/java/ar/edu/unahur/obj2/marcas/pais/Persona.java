package ar.edu.unahur.obj2.marcas.pais;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.marcas.Carpa;
import ar.edu.unahur.obj2.marcas.Jarra;
import ar.edu.unahur.obj2.marcas.cervezas.Marca;

public class Persona {
    private Double peso;
    private List<Jarra> jarrasCompradas;
    private Boolean leGustaMusicaTradicional;
    private Integer aguante;
    private Pais pais;

    public Persona(Double peso, Boolean leGustaMusicaTradicional, Integer aguante, Pais pais) {
        this.peso = peso;
        this.leGustaMusicaTradicional = leGustaMusicaTradicional;
        this.aguante = aguante;
        this.pais = pais;
        this.jarrasCompradas = new ArrayList<Jarra>();
    }

    public Boolean estaEbria(){
        return (cantidadDeAlcoholConsumida() * peso > aguante) ? true : false;
    }

    public Double cantidadDeAlcoholConsumida(){
        return jarrasCompradas.stream().mapToDouble(j -> j.contenidoDeAlcohol()).sum();
    }

    public Boolean leGusta_(Marca marca){
        return pais.leGusta_(marca);
    }

    public void beber(Jarra jarra){
        if(leGusta_(jarra.getMarca())){
            jarrasCompradas.add(jarra);
        }
    }

    public List<Jarra> getJarrasCompradas() {
        return jarrasCompradas;
    }

    public void setJarrasCompradas(List<Jarra> jarrasCompradas) {
        this.jarrasCompradas = jarrasCompradas;
    }

    public Boolean quiereEntrar(Carpa carpa){
        return leGusta_(carpa.getMarcaDeCerveza()) && leGustaMusicaTradicional == carpa.getTieneBandaTradicional() && pais.quiereEntrar(carpa);
    }

    public Boolean puedeEntrar(Carpa carpa){
        return carpa.dejarIngresar(this) && quiereEntrar(carpa);
    }

    public Boolean todasLasCervezasSonDe_(Double litros){
        return jarrasCompradas.stream().allMatch(j -> j.getCapacidadEnLitros() >= litros);
    }

    public Boolean esPatriota(){
        return jarrasCompradas.stream().allMatch(j -> j.getMarca().getPais().equals(pais));
    }
}
