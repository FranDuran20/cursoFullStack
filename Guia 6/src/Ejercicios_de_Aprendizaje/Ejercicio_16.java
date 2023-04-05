/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package Ejercicios_de_Aprendizaje;

import java.util.Scanner;


public class Ejercicio_16 {

 
    public static void main(String[] args) {
        int tamaño,num,cont=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector a rellenar: ");
        tamaño=leer.nextInt();
        int vector[]=new int [tamaño];
        
        for (int i=0;i<tamaño;i++){           
           vector[i]=(int)(Math.random()*10);
        }        
        
        System.out.println("Ingrese un numero para buscar en el vector(del 1 al 10): ");
        num=leer.nextInt();
        
        for (int i=0;i<tamaño;i++){
          if(num==vector[i]){
              System.out.println("Su numero: "+num+" se encuentra en la posicion: "+"["+(i+1)+"] del vector");              
              cont++;
          }
        }        
        
        if(cont>1){
           System.out.println("Su numero se repite "+cont+" veces"); 
        }else{
            System.out.println("No se encontro el numero en el vector");
        }
        
        System.out.println("El vector es: ");
        for (int i=0;i<tamaño;i++){           
           System.out.print(vector[i]+"-");
        }        
        }     
    }
    

