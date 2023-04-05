/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
package Ejercicios_Extras;

import java.util.Scanner;

public class Ejercicio_22 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int fila,col,suma=0;
        System.out.println("Ingrese la cantidad de Filas de la matriz a rellenar:");
        fila=leer.nextInt();
       System.out.println("Ingrese la cantidad de Columnas de la matriz a rellenar:");
        col=leer.nextInt();

        int matriz[][]=new int [fila][col];
        
        for(int f=0;f<fila;f++){
            for(int c=0;c<col;c++){
            System.out.println("Ingrese un valor para la posicion: ["+f+","+c+"]");
            matriz[f][c]=leer.nextInt();
            suma=suma+matriz[f][c]; 
            }                      
        }
        System.out.println("");
        System.out.println("La suma de todos los valores de su Matriz es: "+suma); 
    }
}
