package ar.edu.unahur.obj2.marcas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.marcas.cervezas.Marca;

public class Persona {
    private Double peso;
    private List<Jarra> jarrasCompradas;
    private Boolean leGustaMusicaTradicional;
    private Integer aguante;

    public Persona(Double peso, Boolean leGustaMusicaTradicional, Integer aguante) {
        this.peso = peso;
        this.leGustaMusicaTradicional = leGustaMusicaTradicional;
        this.aguante = aguante;
        this.jarrasCompradas = new ArrayList<Jarra>();
    }

    public Boolean estaEbria(){
        return (cantidadDeAlcoholConsumida() * peso > aguante) ? true : false;
    }

    public Double cantidadDeAlcoholConsumida(){
        return jarrasCompradas.stream().mapToDouble(j -> j.contenidoDeAlcohol()).sum();
    }

    public Boolean leGusta_(Marca marca){
        switch (marca.getPais().toLowerCase()) {
        case "belgica":
            return marca.getGramosDeLupulo() > 4;
        case "república checa":
            return marca.getGraduacion() > 8;
        case "alemania":
            return true;
        default:
            return false;
        }
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

    
}
