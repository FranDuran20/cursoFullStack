/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package Ejercicios_de_Aprendizaje;

import java.util.Scanner;


public class Ejercicio_21 {


    public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
         int [] [] matrizM = new int [10][10];
         int [][] matrizP = new int [3][3];         
         llenar(matrizM);         
         mostrar(matrizM);         
       
         System.out.println("Ingrese numeros de dos digitos para llenar su matriz P: ");
         for (int f=0; f<matrizP.length; f++){
            for(int c=0;c<matrizP.length;c++){
                matrizP[f][c]=leer.nextInt();
            }            
        }            
         mostrar(matrizP);
         
         verificar(matrizM,matrizP);
         
         
    }
    
    public static void llenar (int [][] matriz){        
        for (int f=0; f<matriz.length; f++){
            for(int c=0;c<matriz.length;c++){
                matriz[f][c]=(int)(Math.random()*10);                        
            }            
        }        
    }
    
     public static void mostrar (int [][] matriz){        
        for (int f=0; f<matriz.length; f++){
            for(int c=0;c<matriz.length;c++){
                System.out.print(matriz[f][c]+" - ");                       
            } 
            System.out.println(" ");
        }        
    }
    
          public static void verificar (int [][] matriz1, int [][] matriz2){        
        int fila=0,col=0, coincid=0;
              
                          
        for (int f=0; f<10; f++){
        for(int c=0;c<10;c++){
           
            if(matriz1[f][c]==matriz2[0][0]&& f<=7 && c<=7){
                       
                for(int i=0; i<3;i++){
                         for(int j=0; j<3;j++){
                                 if(matriz1[i+f][j+c]==matriz2[i][j]){
                                     coincid=coincid+1;
                                     fila=f;
                                     col=c;                               
                                 }else{
                                     coincid=0;
                                     fila=0;
                                     col=0;  
                                     i=2;
                                     j=2;
                                 }  
                             }
                         }          
                  }   
               if (coincid == 9) {
                    f = 9;
                    c = 9;
                }        
            }            
        }  
        
         if(coincid==9){   
            for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                System.out.print("["+(i+fila)+";"+(j+col)+"] ");
            }
            System.out.println("");
        }
            }else{
                System.out.println("No se a encontrado la matriz ingresada dentro de la mas grande");
            }
    }
     
}
