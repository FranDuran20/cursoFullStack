
package Entidades;

public class Gato extends Animal {

    public String nom="Gato";

    @Override
    public String toString() {
        return nom;
    }
    
    @Override
    public void Saludo() {
        System.out.println("Miaaaauuu");
    }
    
}
