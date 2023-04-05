/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package Ejercicios_Extras;

import java.util.Scanner;


public class Ejercicio_7 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num,max=0,min=0,suma=0,prom;
       System.out.println("Ingrese cuantos numeros ingresara en total: ");
       num=leer.nextInt();
       int vector[]=new int [num];       
       for(int c=0;c<num;c++){
           System.out.println("Ingrese el valor numero "+(c+1)+":");
           vector[c]=leer.nextInt();           
           suma=suma+vector[c];
           min=vector[c];
           if(vector[c]>max){
               max=vector[c];
           }            
       }       
        for(int c=0;c<num;c++){           
           if(vector[c]<min){
               min=vector[c];
           }            
       }
       prom=suma/num;   
        System.out.println("El numero MINIMO ingresado es: "+min);
        System.out.println("El numero MAXIMO ingresado es: "+max);
        System.out.println("El promedio de sus "+num+" numeros es: "+prom);
    }    
}
