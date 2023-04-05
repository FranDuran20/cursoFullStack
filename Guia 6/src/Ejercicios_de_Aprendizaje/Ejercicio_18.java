/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package Ejercicios_de_Aprendizaje;

import java.util.Scanner;


public class Ejercicio_18 {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int matriz1[][]= new int[4][4], matriz2[][]=new int [4][4];
        
        for (int f = 0;f<4;f++){
        for(int c=0;c<4;c++){
            matriz1[f][c]=(int)(Math.random()*10);            
        }        
        } 
        System.out.println("Su Matriz 1 es: ");
        System.out.println(" ");
        
        for (int f = 0;f<4;f++){
        for(int c=0;c<4;c++){
            System.out.print(matriz1[f][c] + "   ");           
        } 
        System.out.println("");
        } 
        
        for (int c = 0;c<4;c++){
        for(int f=0;f<4;f++){
            matriz2[f][c]=matriz1[c][f];            
        }        
        } 
        System.out.println("Su Matriz 2 TRANSPUESTA es: ");
        System.out.println(" ");
        
        for (int f = 0;f<4;f++){
        for(int c=0;c<4;c++){
            System.out.print(matriz2[f][c] + " - ");           
        } 
        System.out.println("");
        } 
        }        
    }
    

