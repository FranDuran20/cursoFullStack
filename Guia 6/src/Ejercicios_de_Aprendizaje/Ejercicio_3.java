/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package Ejercicios_de_Aprendizaje;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;



public class Ejercicio_3 {  
    public static void main(String[] args) {
      String frase; 
      Scanner teclado=new Scanner(System.in);
      System.out.print("Ingrese una frase:");
        frase=teclado.nextLine();        
      System.out.println("Su frase en Minusculas es: "+toLowerCase(frase));       
      System.out.println("Su frase en Mayusculas es: "+toUpperCase(frase)); 
      
      /*
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        
        String frase = leer.nextLine();
        
        String mayus = frase.toUpperCase();
        String minus = frase.toLowerCase();
        
        System.out.println("Frase en mayusculas: " + mayus);
        System.out.println("Frase en minusculas: " + minus);
    }
}
      */
      
      }    
}

