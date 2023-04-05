/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package Ejercicios_de_Aprendizaje;

import java.util.Scanner;


public class Ejercicio_14vis {

    public static void main(String[] args) {
     
        double cantidad;
        String selec;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros a convertir: ");
        cantidad = leer.nextDouble();
        System.out.println("Ingrese a que moneda desea convertirlo: \n"
                + "A - Libras \n"
                + "B - Dolares \n"
                + "C - Yenes");
        selec=leer.next();                
        double retorno = cambio(cantidad,selec);        
        System.out.println("Su conversion a "+ selec+" es: "+retorno);
        
    }
  
private static double cambio(double cantidad, String selec){
        double cambio=0;
        switch(selec){
            case "A":
                cambio=cantidad*0.86;                       
                break;
            case "B":
                cambio=cantidad*1.28611;                
                break;
            case "C":                
                cambio=cantidad*129.852;
                break;            
            default:
                System.out.println("Opcion Incorrecta");      
        }       
        return cambio;
}
}
