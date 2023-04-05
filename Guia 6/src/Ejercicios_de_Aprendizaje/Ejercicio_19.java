/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

En este caso la matriz es anti simétrica.
 */
package Ejercicios_de_Aprendizaje;

import java.util.Scanner;


public class Ejercicio_19 {

 
    public static void main(String[] args) {
             Scanner leer = new Scanner (System.in);
        int matriz1[][]= new int[3][3], matriz2[][]=new int [3][3];
        
        for (int f = 0;f<3;f++){
        for(int c=0;c<3;c++){
            System.out.println("Ingrese el valor de la posicion ["+f+"],["+c+"]: ");
            matriz1[f][c]=leer.nextInt();            
        }        
        } 
        System.out.println("Su Matriz 1 es: ");
        System.out.println(" ");
        
        for (int f = 0;f<3;f++){
        for(int c=0;c<3;c++){
            System.out.print(matriz1[f][c] + "  /  ");           
        } 
        System.out.println("");
        } 
        
        for (int f = 0;f<3;f++){
        for(int c=0;c<3;c++){
            matriz2[f][c]=matriz1[c][f];            
        }        
        } 
        System.out.println("Su Matriz 2 TRANSPUESTA es: ");
        System.out.println(" ");
        
        for (int f = 0;f<3;f++){
        for(int c=0;c<3;c++){
            System.out.print(matriz2[f][c] + " / ");           
        } 
        System.out.println("");
        } 
        
        int res, cont=0;
        for (int f = 0;f<3;f++){
        for(int c=0;c<3;c++){
            res=matriz1[f][c]+matriz2[f][c];
            if (res==0) {
                cont++;
            }            
        }         
        } 
        
        if (cont==9) {
            System.out.println("Su Matriz transpuesta es ANTI-SIMETRICA");            
        }else{
            System.out.println("Su Matriz transpuesta NO es ANTI-SIMETRICA");   
        }
    }
    
}
