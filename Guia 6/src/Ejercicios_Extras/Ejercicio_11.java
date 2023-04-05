/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
package Ejercicios_Extras;

import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, cont=0,aux;
        System.out.println("Ingrese un numero entero: ");
        num=leer.nextInt();
        aux=num;        
        do {        
            aux=(int)Math.floor(aux/10);           
            cont++;
            
        } while (aux!=0);        
        System.out.println("Su numero ingresado tiene: "+cont+" digitos!");
    }
}


