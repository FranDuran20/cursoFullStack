/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package Ejercicios_de_Aprendizaje;


import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
       String frase; 
      Scanner leer=new Scanner(System.in);
      System.out.print("Ingrese una palabra:");
        frase=leer.nextLine();      
        if (frase.equalsIgnoreCase("eureka")){
                System.out.println("Su palabra es EUREKA ");
            } else {
            System.out.println("Su palabra no es Eureka");
            }
    }   
}
