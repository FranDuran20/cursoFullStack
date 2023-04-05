/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ejercicio_10;

import java.util.Arrays;

public class Ejercicio_10 {

    public static void main(String[] args) {
        
        double vector50[]=new double [50];
        double vector20[]=new double [20];
        
        System.out.println("Vector aleatorio de 50 numeros:");
        for (int i = 0; i < vector50.length; i++) {
            vector50[i]=(Math.random()*10);  
            System.out.print("["+vector50[i]+"] ");
        } 
        System.out.println("");
        System.out.println("Vector aleatorio de 50 numeros ordenado de menor a mayor: ");
        Arrays.sort(vector50);       
         for (int i = 0; i < vector50.length; i++) {     
            System.out.print("["+vector50[i]+"] ");
        }  
         System.out.println("");
         System.out.println("Vector 2, los primeros 10 numeros son del vector 1:");
        Arrays.fill(vector20, 10, 20, 0.5);
        for (int i = 0; i < 10; i++) {
           Arrays.fill(vector20, i, i+1, vector50[i]);
        }     
        for (int i = 0; i < vector20.length; i++) {
            System.out.print("["+vector20[i]+"] ");
        }
    }  
}
