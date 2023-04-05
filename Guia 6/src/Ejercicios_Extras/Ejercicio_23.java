/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package Ejercicios_Extras;

import java.util.Scanner;

public class Ejercicio_23 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String sopa[][]=new String [20][20];
        String palabras[]=new String[5];
        int num;

        for(int a=0;a<5;a++){
            System.out.println("Ingrese la palabra "+(a+1)+" para rellenar la sopa de letras: ");
            palabras[a]=leer.nextLine();
        }
      
         for(int f=0;f<20;f++){
            for(int c=0;c<20;c++){
                if(sopa[f][c]=="null"){
                num=(int)(Math.random()*10);
                String numStr=String.valueOf(num);
                sopa[f][c]=numStr;  
                }           
            }
        }
        System.out.println("");
        System.out.println("**** SOPA DE LETRAS ****");
        for(int f=0;f<20;f++){
            for(int c=0;c<20;c++){
                System.out.print(sopa[f][c]+" ");              
            }
            System.out.println("");
        }
    }
}
