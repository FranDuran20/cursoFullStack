/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package guia10_ej1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Guia10_Ej1 {

    public static void main(String[] args) {
       Animal a1 = new Perro("Loki", "Huesos", 5, "Callejero");
       a1.alimentarce();
       Animal a2 = new Gato("Mau", "Atun", 8, "Siames");
       a2.alimentarce();
       Animal a3 = new Caballo("Spirit", "Pasto", 12, "Pura Sangre");
       a3.alimentarce();      
    }    
}
