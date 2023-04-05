/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package Ejercicios_Extras;

import java.util.Scanner;

public class Ejercicio_18 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int tam,suma=0;
        System.out.println("Ingrese el tamaño del vector a rellenar:");
        tam=leer.nextInt();
        int vector[]=new int [tam];
        
        for(int c=0;c<vector.length;c++){
            System.out.println("Ingrese un valor para la posicion: ["+c+"]");
            vector[c]=leer.nextInt();
            suma=suma+vector[c];           
        }
        System.out.println("");
        System.out.println("La suma de todos los valores de su vector es: "+suma);
        
    }
    
}
