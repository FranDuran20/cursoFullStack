/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import Entidad.Persona;
import java.util.Scanner;


public class ServicioPersona {
     private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){

        System.out.println("Ingrese el nombre:");
        String nombre = leer.next();
        System.out.println("Ingrese el Apodo:");
        String apodo = leer.next();
        System.out.println("Ingrese la edad:");
        int edad = leer.nextInt();
        System.out.println("Ingrese la cantidad de rutinas a realizar:");
        int rutinas=leer.nextInt();
       int energia=100;
        
       return new Persona(nombre, apodo, edad, energia, rutinas);
       
        
    }
    
    
}
