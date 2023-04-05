/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package Ejercicios_Extras;

import java.util.Scanner;


public class Ejercicio_9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dividendo,divisor,num1;
        do {
            System.out.println("Ingrese el DIVIDENDO: ");
            dividendo=leer.nextInt();
        } while (dividendo<1);
        System.out.println("");
        do {            
            System.out.println("Ingrese el DIVISOR: ");
            System.out.println("(Debe ser mayor a 1 y menor que el dividendo ingresado");
            divisor=leer.nextInt();
        } while (divisor<1||divisor>dividendo);
        num1=dividendo;
        int resto;
        int cont = 0;
        do {            
            resto = num1-divisor;
            num1=resto;       
            cont++;
        } while (resto>divisor);
        System.out.println("El residuo de su division es: "+resto+", y el cociente es: "+cont);
    }
}
