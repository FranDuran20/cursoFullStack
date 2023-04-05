
package Servicio;

import Entidad.Perro;
import java.util.Scanner;

public class ServPerros {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {
              
        Perro dog = new Perro();
        System.out.print("Ingrese el Nombre del Perro: ");
        dog.setNombre(leer.next());
        System.out.print("Ingrese la Raza del Perro: ");
        dog.setRaza(leer.next());
        System.out.print("Ingrese la Edad del Perro: ");
        dog.setEdad(leer.nextInt());        
        return dog;
        
    }

}
