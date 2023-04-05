/*
Es tu turno, crea tu propio proyecto con la clase Persona.
 */
package guia7_mo_1;

import Entidad.Persona;
import java.util.Scanner;
import persona.ServicioPersona;

public class Guia7_MO_1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        ServicioPersona sp = new ServicioPersona();        
        Persona persona1 = sp.crearPersona();       
        System.out.println(persona1.toString());      
        persona1.Ejercicio(10, leer.nextInt());
        System.out.println(persona1.toString());
        
        
        /*
        Scanner leer = new Scanner(System.in);
        Persona primera = new Persona("", "", 0,0);
        System.out.println("Ingrese nombre: ");
        primera.setNombre(leer.next());
        System.out.println("Ingrese apodo: ");
        primera.setApodo(leer.next());
        System.out.println("Ingrese edad: ");
        primera.setEdad(leer.nextInt());
        System.out.println("Ingrese la cantidad de rutinas a realizar:");
        primera.Ejercicio(10, leer.nextInt());
        System.out.println("Nombre: " + primera.getNombre());
        System.out.println("Apodo: " + primera.getApodo());
        System.out.println("Edad: " + primera.getEdad());
        System.out.println("Energia: " + primera.getEnergia());
*/
    }

}
