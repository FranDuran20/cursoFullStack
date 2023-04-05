/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package Ejercicios_Extras;

import java.util.Scanner;


public class Ejercicio_6 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int pers, cont=0;
        double altura,general=0, petisos=0, prom1, prom2;
        System.out.println("Ingrese la cantidad de personas: ");
        pers=leer.nextInt();
        
        for(int a=1;a<=pers;a++){
            System.out.println("Ingrese la altura de la persona: "+a);
            altura=leer.nextDouble();
            general=general+altura;
            if (altura<1.6){
                petisos=petisos+altura;
                cont++;
            }
        }
        
        prom1=general/pers;
        prom2=petisos/cont;
        
        System.out.println("El promedio de altura de las "+pers+" ingresadas es: "+prom1);
        System.out.println("El promedio de las "+cont+" persona/s inferiores a 1.6m es: "+prom2);
        
    }
    
}
