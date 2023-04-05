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

public class Ejercicio_14 {

    public static void main(String[] args) {
        double euro;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros a convertir: "); 
        euro=leer.nextDouble();          
        double retorno = cambio(euro);        
        System.out.println("La conversaion es: "+retorno);        
    }

    private static double cambio(double moneda) {
        double cambio = 0;
        String seleccion; 
        Scanner leer=new Scanner(System.in);        
        do {            
            System.out.println("A que moneda desea convertir? \n"
                    + "A -Dolares \n"
                    + "B -Yenes \n"
                    + "C -Libras \n");             
            seleccion=leer.nextLine();        
        } while (!"a".equalsIgnoreCase(seleccion)&!"b".equalsIgnoreCase(seleccion)&!"c".equalsIgnoreCase(seleccion));
        
        switch (seleccion){
            case "a":
                cambio=moneda*1.28611;
                break;
            case "b":
                cambio=moneda*129.852;
                break;
            case "c":
                cambio=moneda*0.86;
                break;            
        }        
        return cambio;
    }
    
}

