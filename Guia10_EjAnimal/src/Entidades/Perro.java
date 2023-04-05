
package Entidades;

public class Perro extends Animal {

    public String nom="Perro";

    @Override
    public String toString() {
        return nom;
    }

   
    
    @Override
    public void Saludo() {
        System.out.println("Guau guau!");
    }    
    
}
