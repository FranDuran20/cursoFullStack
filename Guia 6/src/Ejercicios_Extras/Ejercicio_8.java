/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package Ejercicios_Extras;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int cont=0,num,par=0,impar=0,vector[];
         do {            
             System.out.println("Ingrese un numero: ");
             num=leer.nextInt();
             cont++;             
             if(num%2==0){
                 par++;
             }else{
                 impar++;
             }             
        } while ((num%5)!=0);         
         System.out.println("En total ingreso: "+cont+" numeros");
         System.out.println("De los cuales: "+par+" fueron PARES");
         System.out.println("Y de los cuales: "+impar+" fueron IMPARES");
    }    
}
