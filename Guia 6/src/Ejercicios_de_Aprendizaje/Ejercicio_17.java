/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Ejercicios_de_Aprendizaje;
import java.util.Scanner;
public class Ejercicio_17 {
   
    public static void main(String[] args) {
        int tamaño,num,uno=0,dos=0,tres=0,cuatro=0,cinco=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector a rellenar: ");
        tamaño=leer.nextInt();
        int vector[]=new int [tamaño];        
        for (int i=0;i<tamaño;i++){           
           vector[i]=(int)(Math.random()*100000);
        }        
        System.out.println("El vector es: ");
        for (int i=0;i<tamaño;i++){           
           System.out.print(vector[i]+"-");
        }
         for (int i=0;i<tamaño;i++){          
           
             String str = String.valueOf(vector[i]);             
        int largo = str.length();
             switch (largo) {
                 case 1:
                     uno=uno+1;
                     break;
                 case 2:
                     dos=dos+1; 
                     break;
                 case 3:
                     tres++;
                     break;
                 case 4:
                     cuatro++;
                     break;
                 case 5:
                     cinco++;
                     break;               
             }                  
        }
        
        /*
         for (int i=0;i<tamaño;i++){           
          if (vector[i]<10){
          uno=uno+1;
          }else{
          }if(vector[i]>=10&&vector[i]<100){
              dos=dos+1;              
          }else{
          }if(vector[i]>=100&&vector[i]<1000){
              tres=tres+1;
          }else{
          }if(vector[i]>=1000&&vector[i]<10000){
              cuatro=cuatro+1;
          }else{          
          }if(vector[i]>=10000){
              cinco=cinco+1;}          
          }
*/
         System.out.println("");
        System.out.println("Numeros de un digito: "+uno);
        System.out.println("Numeros de dos digitos: "+dos);
        System.out.println("Numeros de tres digitos: "+tres);
        System.out.println("Numeros de cuatro digitos: "+cuatro);
        System.out.println("Numeros de cinco digitos: "+cinco);        
        
          }
          }
            
            
            
        
        
        
    
    

