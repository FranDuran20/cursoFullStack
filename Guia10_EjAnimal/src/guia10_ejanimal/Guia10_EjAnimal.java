/*
Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
 */
package guia10_ejanimal;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class Guia10_EjAnimal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList <Animal> animales = new ArrayList();
        int veces;
     //   Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
     //   animales.add(a);
        animales.add(b);
        animales.add(c);
//         for (Animal aux : animales) {
//            aux.Saludo();
//        }
        animales.forEach((aux) -> {
            aux.Saludo();
        });

        System.out.println("Ingrese cuantas veces se alimenta el: " + b.toString());
        veces = leer.nextInt();
        System.out.println("Indique el alimento de " + b.toString());
        String alimento = leer.next();
        b.comer(veces, alimento);       

        System.out.println("Ingrese cuantas veces se alimenta: " + c.toString());
        veces = leer.nextInt();
        System.out.println("Indique el alimento de " + c.toString());
        alimento = leer.next();
        c.comer(veces, alimento);
    }
}
