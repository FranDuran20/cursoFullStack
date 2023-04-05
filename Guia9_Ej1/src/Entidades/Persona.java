/*
clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
*/
package Entidades;

public class Persona {
    private String nom;
    private String ape;
    private Integer edad;
    private String dni;
    private Perro dog;

    public Persona() {
    }

    public String getNom() {
        return nom;
    }

    public String getApe() {
        return ape;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public Perro getDog() {
        return dog;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDog(Perro dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Persona{" + "nom=" + nom + ", ape=" + ape + ", edad=" + edad + ", dni=" + dni + ", dog=" + dog + '}';
    }
    
}
