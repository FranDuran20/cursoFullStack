/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package Ejercicios_Extras;

import java.util.Scanner;

public class Ejercicio_19 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int tam;
        boolean verif=true;
        System.out.println("Ingrese el tamaño de los vectores a rellenar:");
        tam=leer.nextInt();
        int vector1[]=new int [tam], vector2[]=new int [tam];
        
        for(int j=0;j<vector1.length;j++){
            System.out.println("Ingrese el valor del vector 1 en la poscion ["+j+"]");
            vector1[j]=leer.nextInt();
             System.out.println("Ingrese el valor del vector 2 en la poscion ["+j+"]");
            vector2[j]=leer.nextInt();
        }
        
         for(int j=0;j<vector1.length;j++){
            if(vector1[j]!=vector2[j]){               
                System.out.println("Sus vectores no son iguales ya que en la posicion: ["+j+"]");
                System.out.println("El valor del vector 1 es: "+vector1[j]);
                System.out.println("Y el valor del vector 2 es: "+vector2[j]);
                verif=false;
                 j=(vector1.length)-1;
            }
        }
        if(verif==true){
            System.out.println("Todos los valores de sus dos vectores son iguales");
        }
    } 
}
