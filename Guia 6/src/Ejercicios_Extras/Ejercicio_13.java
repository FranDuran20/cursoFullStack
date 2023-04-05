/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package Ejercicios_Extras;

import java.util.Scanner;

public class Ejercicio_13 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int altura;
        System.out.println("Ingrese un numero para dibujar la escalera:");
        altura=leer.nextInt();
        escalera(altura);
    }

    private static void escalera(int altura) {
        int cont=1,largo=1;
        
        for(int a=0;a<altura;a++){
            if(largo==cont){
                cont=1;
                largo++;
                System.out.println("");
            } 
            while (largo!=cont) {
                System.out.print(cont);
                cont++;
            }
        }
        System.out.println("");
    } 
}
