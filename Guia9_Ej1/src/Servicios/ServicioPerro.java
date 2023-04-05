
package Servicios;

import Entidades.Perro;
import java.util.Scanner;

public class ServicioPerro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Perro crearPerro(){
        Perro dog = new Perro();
        System.out.print("Ingrese el nombre del Perro > ");
        dog.setNomP(leer.next());
        System.out.print("Ingrese la EDAD de "+dog.getNomP()+" > ");
        dog.setEdadP(leer.nextInt());
        System.out.print("Ingrese la RAZA de "+dog.getNomP()+" > ");
        dog.setRaza(leer.next());
        System.out.print("Ingrese el TAMAÑO de "+dog.getNomP()+" > ");
        dog.setTam(leer.next());
        return dog;
    }   
    
}
