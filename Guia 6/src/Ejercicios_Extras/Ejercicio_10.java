/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package Ejercicios_Extras;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1,num2,buscar,mult;
       num1=(int)((Math.random()*10)+1);
       num2=(int)((Math.random()*10)+1);
       mult=num1*num2;
       
        do {            
            System.out.println("Ingrese un numero para adivinar la multiplicacion:");
            buscar=leer.nextInt();
            
            if(buscar==mult){
                System.out.println("Bravo! A encontrado el resultado de la multiplicacion: "+buscar);
                System.out.println("Ya que el numero 1 era: "+num1+" y el 2: "+num2);
            }else{
                System.out.println("El numero: "+buscar+" no es el resultado de la multiplicacion...");
            }              
        } while (buscar!=mult);

    }
    
}
