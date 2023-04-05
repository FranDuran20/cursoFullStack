/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package Ejercicios_de_Aprendizaje;

public class Ejercicio_15 {
 
    public static void main(String[] args) {
       int vector[]=new int[100];
       
        for (int i=0;i<100;i++) {
           vector[i]=i+1;            
        }       
        for (int b=99;b>=0;b--) {
            System.out.print(vector[b]+"-");           
        }        
    }    
}
