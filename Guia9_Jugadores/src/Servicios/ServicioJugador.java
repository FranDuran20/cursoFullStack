
package Servicios;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioJugador {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Jugador crearJugador(){
        Jugador j1 = new Jugador();        
        System.out.println("Ingrese el nombre del jugador:");
        j1.setNombre(leer.next());
        System.out.print("Ingrese el numero del jugador: "+j1.getNombre()+" > ");
        j1.setNum(leer.next());
        System.out.print("Ingrese la posicion de: "+j1.getNombre()+" > ");
        j1.setPos(leer.next());
        return j1;
    }
    
    public Equipo crearEquipo(){
        Equipo e1 = new Equipo();
        int cont=0;
        ArrayList <Jugador> listado= new ArrayList();
        System.out.println("Ingrese el nombre del Equipo:");
        e1.setNombre(leer.next());
        System.out.println("Cuantos jugadores tiene el Equipo "+e1.getNombre()+ " ?");
        int cant=leer.nextInt();
        do {            
            listado.add(this.crearJugador());           
            cont++;
        } while (cont!=cant);
        e1.setPlantel(listado);        
        return e1;
    }
}
