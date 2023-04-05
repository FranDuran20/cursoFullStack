/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Ejercicios_de_Aprendizaje;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        float gc, far;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Ingrese la temperatura en Grados Centigrados: ");
        gc=teclado.nextFloat();
        far=32+(9*gc/5);
         System.out.println("Su temperatura en grados Fahrenheit es: "+far);        
    }    
}
