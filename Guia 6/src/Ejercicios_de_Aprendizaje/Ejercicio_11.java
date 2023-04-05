/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package Ejercicios_de_Aprendizaje;

import java.util.Scanner;


public class Ejercicio_11 {

    public static void main(String[] args) {
        int num1,num2,selec; 
        double resultado=0;
        String resp="n";
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese un numero: "); 
        num1=teclado.nextInt();  
        System.out.println("Ingrese un segundo numero: "); 
        num2=teclado.nextInt();         
        
        do {
            System.out.println("**** MENU **** \n"
                    + "1- SUMAR \n"
                    + "2- RESTAR \n"
                    + "3- MULTIPLICAR \n"
                    + "4- DIVIDIR \n"
                    + "5- SALIR \n");                   
                       
            selec=teclado.nextInt(); 
            switch(selec) {
            case 1:
                resultado=num1 + num2;
                System.out.println("La suma es "+ resultado); 
                break;
            case 2:
                resultado=num1 - num2;
                System.out.println("La resta es "+ resultado); 
                break;
            case 3:
                resultado=num1 * num2;
                System.out.println("La multiplicacion es "+ resultado); 
                break;
            case 4:                
                try { 
                //try ejecuta la linea de codico, si da error va al CATCH
                resultado=num1 / num2;
                System.out.println("La division es "+ resultado); 
                }catch(Exception pepe){ 
                //CATCH muestra un mensaje de error en caso de no ser posible las de TRY
                    System.out.println(pepe.getMessage()); //ex.getMessage() informa el error que indica JAVA
                    System.out.println("Division por 0 - ERROR");
                }              
                
                
                break;  
            case 5:
                
                
                
                System.out.println("¿Esta seguro que desea Salir? S/N"); 
                resp=teclado.next();                     
                resp=resp.toLowerCase();
                switch(resp){
                    case "s":
                        
                    break;
                    case "n":
                        System.out.println("Volviendo al menu...");
                    break;
                    default:
                        System.out.println("Ingrese S o N");                                              
                        resp="n";
                }               
                      
                break;    
                default:
                    System.out.println("Opcion Incorrecta");                
                }        
        } while (resp.equalsIgnoreCase("n"));
    }
}
