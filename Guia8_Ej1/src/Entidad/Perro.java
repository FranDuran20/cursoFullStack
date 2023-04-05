
package Entidad;

import java.util.Comparator;

public class Perro {
    private String nombre;
    private String raza;
    private Integer edad;

    public Perro(String nombre, String raza, Integer edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public Perro() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + "\n"
                + "raza=" + raza + "\n"
                + "edad=" + edad + '}';
    }    
  
    public static Comparator<Perro> compararNombre = (Perro p1, Perro p2) -> p1.getNombre().compareTo(p2.getNombre());    
    public static Comparator<Perro> compararRaza = (Perro p1, Perro p2) -> p1.getRaza().compareTo(p2.getRaza());
    public static Comparator<Perro> compararEdad = (Perro p1, Perro p2) -> p1.getEdad().compareTo(p2.getEdad());
}
