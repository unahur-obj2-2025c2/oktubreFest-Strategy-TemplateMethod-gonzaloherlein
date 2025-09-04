package ar.edu.unahur.obj2.marcas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.marcas.cervezas.Marca;
import ar.edu.unahur.obj2.marcas.pais.Persona;

public class Carpa {
    private List<Persona> personasAdentro;
    private Integer limiteDeGente;
    private Boolean tieneBandaTradicional;
    private Marca marcaDeCerveza;

    public Carpa(Integer limiteDeGente, Boolean tieneBandaTradicional, Marca marcaDeCerveza) {
        this.limiteDeGente = limiteDeGente;
        this.tieneBandaTradicional = tieneBandaTradicional;
        this.marcaDeCerveza = marcaDeCerveza;
        this.personasAdentro = new ArrayList<Persona>();
    }

    public Integer getLimiteDeGente() {
        return limiteDeGente;
    }

    public void setLimiteDeGente(Integer limiteDeGente) {
        this.limiteDeGente = limiteDeGente;
    }

    public Boolean getTieneBandaTradicional() {
        return tieneBandaTradicional;
    }

    public void setTieneBandaTradicional(Boolean tieneBandaTradicional) {
        this.tieneBandaTradicional = tieneBandaTradicional;
    }

    public Marca getMarcaDeCerveza() {
        return marcaDeCerveza;
    }

    public void setMarcaDeCerveza(Marca marcaDeCerveza) {
        this.marcaDeCerveza = marcaDeCerveza;
    }

    public List<Persona> getPersonasAdentro() {
        return personasAdentro;
    }

    public void setPersonasAdentro(List<Persona> personasAdentro) {
        this.personasAdentro = personasAdentro;
    }

    public Boolean dejarIngresar(Persona persona){
        return (personasAdentro.size() + 1 <= limiteDeGente && !persona.estaEbria()) ? true : false;
    }

    public void ingresarA_(Persona persona){
        if(!persona.quiereEntrar(this)){
            throw new RuntimeException("La persona no quiere entrar a la carpa");
        }
        personasAdentro.add(persona);
    }

    public void servirJarraA_(Persona persona, Double litros){
        Jarra jarraAServir = new Jarra(litros, marcaDeCerveza);
        if(!persona.quiereEntrar(this)){
            throw new RuntimeException("La persona no esta en la carpa");
        }
        persona.beber(jarraAServir);
    }
}
