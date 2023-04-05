
package Servicio;

import Entidad.Cancion;
import java.util.Scanner;

public class ServicioCancion {
    Scanner leer =new Scanner (System.in).useDelimiter("\n");
    
    public Cancion crearCancion(){            
    Cancion c1=new Cancion();
    System.out.println("Ingrese el titulo de la cancion: ");
    c1.setTitulo(leer.nextLine());
            System.out.println("Ingrese el autor: ");
            c1.setAutor(leer.nextLine());
    return c1;
}
    public void Mostrar(Cancion c1){
        System.out.println("Su cancion creada es: ");
        System.out.println("Titulo: "+c1.getTitulo());
        System.out.println("Autor: "+c1.getAutor());
    }
}
