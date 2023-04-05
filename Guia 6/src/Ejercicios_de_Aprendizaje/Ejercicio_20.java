/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package Ejercicios_de_Aprendizaje;

import java.util.Scanner;


public class Ejercicio_20 {

 
    public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
        int matriz[][]= new int[3][3];
        
        for (int f = 0;f<3;f++){
        for(int c=0;c<3;c++){
            System.out.println("Ingrese el valor de la posicion ["+f+"],["+c+"]: ");
            matriz[f][c]=leer.nextInt();            
        }        
        } 
        System.out.println("Su Matriz es: ");
        System.out.println(" ");
        
        for (int f = 0;f<3;f++){
        for(int c=0;c<3;c++){
            System.out.print(matriz[f][c] + "  /  ");           
        } 
        System.out.println("");
        } 
        
        for (int f = 0;f<3;f++){
        for(int c=0;c<3;c++){
                
        }        
        } 
        
        
        
    }
    
}
