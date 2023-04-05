/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package Ejercicios_de_Aprendizaje;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        int num1,num2,suma=0; 
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese un numero limite positivo: "); 
        num1=teclado.nextInt();        
      
        while (suma<num1) {        
            System.out.println("Ingrese numeros para sumar: "); 
            num2=teclado.nextInt(); 
            suma=suma+num2;
        }
        
        System.out.println("Ah alcanzado el numero limite, sumando en total "+suma);
    }
    
}
