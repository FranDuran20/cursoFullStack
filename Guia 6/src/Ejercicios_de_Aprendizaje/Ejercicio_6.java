/*
Crear un programa que dado un numero determine si es par o impar.
 */
package Ejercicios_de_Aprendizaje;

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        int num; //int palabra reservada para NUMERO ENTERO //      
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese un numero: "); //println es un "Escribir sin saltar"// 
        num=teclado.nextInt();   
        
        if(num%2==0){
            System.out.println("Su numero es PAR");
        }
        else{
            System.out.println("Su numero es IMPAR");
        }               
    }    
}
