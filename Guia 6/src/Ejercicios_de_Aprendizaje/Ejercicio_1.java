/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package Ejercicios_de_Aprendizaje;

import java.util.Scanner;


public class Ejercicio_1 {   
    public static void main(String[]args) {
         int num1, num2, suma; //int palabra reservada para NUMERO ENTERO //
        Scanner teclado=new Scanner(System.in);
        System.out.print("Ingrese el primer numero:"); //println es un "Escribir sin saltar"// 
        num1=teclado.nextInt();
        System.out.print("Ingrese el segundo numero:");
        num2=teclado.nextInt();       
        suma=num1+num2;        
        System.out.println("La suma de ambos numeros es: "+suma);  // al colocar la suma concatenamos datos//      
    }
}

