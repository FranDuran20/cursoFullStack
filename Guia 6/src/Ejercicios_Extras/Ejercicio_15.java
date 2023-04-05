/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package Ejercicios_Extras;

import java.util.Scanner;


public class Ejercicio_15 {

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
                System.out.println("La suma es "+ sumar(num1,num2)); 
                break;
            case 2:                
                System.out.println("La resta es "+ resta(num1,num2)); 
                break;
            case 3:                
                System.out.println("La multiplicacion es "+ mult(num1,num2)); 
                break;
            case 4:                
               System.out.println("La division es "+ div(num1,num2)); 
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
    
    public static int sumar(int num1,int num2) {
    int suma;
    suma=num1+num2;
    return suma;
}
    
    public static int resta(int num1,int num2) {
    int resta;
   resta=num1-num2;
    return resta;
}
    
    public static int mult(int num1,int num2) {
    int mult;
    mult=num1*num2;
    return mult;
}
    
    public static double div(int num1,int num2) {
    double div = 0;
    try { 
                //try ejecuta la linea de codico, si da error va al CATCH
                div=num1 / num2;                
                }catch(Exception pepe){ 
                //CATCH muestra un mensaje de error en caso de no ser posible las de TRY
                    System.out.println(pepe.getMessage()); //ex.getMessage() informa el error que indica JAVA
                    System.out.println("Division por 0 - ERROR");
                }              
    return div;
}
  
}
