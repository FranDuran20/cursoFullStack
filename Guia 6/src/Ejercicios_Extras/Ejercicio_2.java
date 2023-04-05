/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package Ejercicios_Extras;

import java.util.Scanner;


public class Ejercicio_2 {

 
    public static void main(String[] args) {
        int A,B,C,D,aux;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor para A:");
        A=leer.nextInt();
        
        do {            
            System.out.println("Ingrese el valor de B (diferente al anterior):");
            B=leer.nextInt();            
        } while (B==A);
        
         do {            
            System.out.println("Ingrese el valor de C (diferente al anterior):");
            C=leer.nextInt();            
        } while (C==B||C==A);
         
          do {            
            System.out.println("Ingrese el valor de D (diferente al anterior):");
            D=leer.nextInt();            
        } while (D==C||D==A||D==B);
        
          System.out.println("Actualmente sus valores son: ");
          System.out.println("A: "+ A);
          System.out.println("B: "+ B);
          System.out.println("C: "+ C);
          System.out.println("D: "+ D);               
         aux=B;
         B=C;
         C=A;
         A=D;
         D=aux;          
         System.out.println("Ahora sus valores intercambiados son: ");
          System.out.println("A: "+ A);
          System.out.println("B: "+ B);
          System.out.println("C: "+ C);
          System.out.println("D: "+ D);
          
       
          
    }
    
}
