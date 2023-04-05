/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package EjDeAprendizaje_Guia6;

import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class EjAp_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una palabra:");
        String palabra = leer.next();
        if(palabra.equalsIgnoreCase("eureka")){
        
            System.out.println("La frase es correcta.");
        
    }else{
            System.out.println("La frase es incorrecta.");
        }
  }  
}
