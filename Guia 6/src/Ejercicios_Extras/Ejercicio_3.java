/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package Ejercicios_Extras;

import java.util.Scanner;

public class Ejercicio_3 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        int tam;
        do {            
               System.out.println("Ingrese un caracter: ");
        letra=leer.nextLine();
        tam=letra.length();
        } while (tam>1);
        if(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
            System.out.println("Su caracter es una vocal");  
        }else{
            System.out.println("Su caracter no es una vocal");
        }
    }
    
}
