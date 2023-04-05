/*
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño;
*/
package Entidades;

public class Perro {
    private String nomP;
    private String raza;
    private Integer edadP;
    private String tam;

    public Perro() {
    }

    public Perro(String nomP, String raza, Integer edadP, String tam) {
        this.nomP = nomP;
        this.raza = raza;
        this.edadP = edadP;
        this.tam = tam;
    }

    public String getNomP() {
        return nomP;
    }

    public String getRaza() {
        return raza;
    }

    public Integer getEdadP() {
        return edadP;
    }

    public String getTam() {
        return tam;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdadP(Integer edadP) {
        this.edadP = edadP;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    @Override
    public String toString() {
        return "Perro{" + "nomP=" + nomP + ", raza=" + raza + ", edadP=" + edadP + ", tam=" + tam + '}';
    }
    
}
