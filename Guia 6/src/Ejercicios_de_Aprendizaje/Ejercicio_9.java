/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 */
package Ejercicios_de_Aprendizaje;

import java.util.Scanner;


public class Ejercicio_9 {


    public static void main(String[] args) {
        String frase; 
      Scanner leer=new Scanner(System.in);
      System.out.println("Ingrese una frase para validar si la primer eltra es una A:");
        frase=leer.nextLine();         
        
        System.out.println(frase.substring(2));
        
        
        if (frase.substring(0,1).equals("A")){
                System.out.println("CORRECTO");
            } else {
            System.out.println("INCORRECTO");
            }
        
        
        
        
        
    }    
}
