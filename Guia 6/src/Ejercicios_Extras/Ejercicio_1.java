/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package Ejercicios_Extras;

import java.util.Scanner;


public class Ejercicio_1 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int min;
        System.out.println("Ingrese los minutos a convertir: ");
        min = leer.nextInt();
        calcular(min);

    }

    public static void calcular(int m) {
        int horas, dias, extra;
        horas = m / 60;
        if (horas > 24) {
            dias = horas / 24;            
                horas=horas-(24*dias);            
        } else {
            dias = 0;
        }
        extra = m % 60;
        System.out.println(dias+" Dias, "  +horas + " horas, "  +extra+ " minutos");
    }
    

    
}
