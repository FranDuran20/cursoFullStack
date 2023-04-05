/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package Ejercicios_de_Aprendizaje;

import java.util.Scanner;


public class Ejercicio_13 {

    public static void main(String[] args) {
        int num; 
      
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese un numero: "); 
        num=teclado.nextInt();  
      
        for (int a=1; a<=num;a++) {
            for(int b=1;b<=num;b++){
                if ((a==1)||(a==num)||(b==1)||(b==num)) {
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
                }
            System.out.println("");
            }
        }
        
        
    }
    

