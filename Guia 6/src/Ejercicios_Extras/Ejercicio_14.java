/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package Ejercicios_Extras;

import java.util.Scanner;


public class Ejercicio_14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int familias,hijos,edad,suma,prom;
        System.out.println("Ingrese la cantidad de familias: ");
        familias=leer.nextInt();
        for(int a=1;a<=familias;a++){
            System.out.println("Cuantos hijos tiene la familia: "+a);
            hijos=leer.nextInt();
            suma=0;
            for(int b=1;b<=hijos;b++){
                System.out.println("Ingrese la edad del hijo: "+b);
                edad=leer.nextInt();
                suma=suma+edad;
            }
            prom=suma/hijos;
            System.out.println("El promedio de edad de sus "+hijos+" hijos es: "+prom);    
        }
    }    
}
