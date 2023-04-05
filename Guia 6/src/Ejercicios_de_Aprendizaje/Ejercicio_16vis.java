/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package Ejercicios_de_Aprendizaje;

import java.util.Scanner;


public class Ejercicio_16vis {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector a rellenar: ");
        int tamaño = leer.nextInt();
        int vector[]= new int [tamaño];
        int cont=0;
   
        for(int i=0; i<tamaño;i++){            
            vector[i]= (int)(Math.random()*10);          
        }
        
        
        System.out.println("Ingrese un numero a buscar en el vector: ");
        int num = leer.nextInt();
        
        for(int i=0; i<tamaño;i++){            
            if(vector[i]==num){                
                System.out.println("Su numero "+num+" esta en la posicion: ["+(i+1)+"]");
                cont++;
            }          
        }
        
        
        if(cont>0){
            System.out.println("Su numero se repite: "+cont+" veces");
        }else{
            System.out.println("Su numero no fue encontrado");
        }
        
        
        
        System.out.println("Su vector es: ");
        for(int i=0; i<tamaño;i++){            
            System.out.print(vector[i]+" - ");          
        }
    }
    
}
