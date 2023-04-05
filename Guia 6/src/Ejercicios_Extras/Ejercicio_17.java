/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
¿Qué son los números primos?
Básicamente, un número primo es un número natural que tiene solo dos divisores o
factores: 1 y el mismo número. Es decir, es primo aquel número que se puede dividir por
uno y por el mismo número.
El primer número primo es 2, y hay 25 números primos entre 1 y 100, ellos son: 2, 3, 5, 7, 11,
13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97.
 */
package Ejercicios_Extras;

import java.util.Scanner;

public class Ejercicio_17 {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       int num;
        System.out.println("Ingrese un numero para verificar si es Primo o no:");
        num=leer.nextInt();
        verificar(num);
        
        if(verificar(num)==true){
            System.out.println("Su numero es Primo");
        }else{
            System.out.println("Su numero NO es Primo");
        }
        
    }

    private static boolean verificar(int num) {
       boolean val = false;
        double div,cont = 0;
        
        for(int a=1;a<=num;a++){
            div=num%a;
            if(div==0){
                cont++;
            }
            if(cont==2){
                val=true;
            }else{
                val=false;
            }
        }        
      return val;
    }
    
}
