/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package Ejercicios_de_Aprendizaje;

import java.util.Scanner;


public class Ejercicio_5 {


    public static void main(String[] args) {
        int num1; //int palabra reservada para NUMERO ENTERO //
        Scanner teclado=new Scanner(System.in);
        System.out.print("Ingrese un numero: "); //println es un "Escribir sin saltar"// 
        num1=teclado.nextInt();
        
        System.out.println("El Doble de su numero es: "+num1*2); //Math.pow(variable,numeroParaElevar)
        System.out.println("El Triple de su numero es: "+num1*3);
        System.out.println("La raiz cuadrada de su numero es: "+Math.sqrt(num1));        
    }    
}
