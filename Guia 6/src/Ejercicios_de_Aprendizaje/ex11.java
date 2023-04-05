/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
 */
package Ejercicios_de_Aprendizaje;

import java.util.Scanner;

/**
import java.nio.charset.StandardCharsets;

 */
public class ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        cambioValor(frase);
        cambioValor(leer.nextLine());

    }

    public static void cambioValor(String frase) {
        
       /* [Funcion concatenar] cadenaFinal = concatenar(cadenafinal, letra) */

       String nuevafrase=frase.replace("a", "@").replace("e","#").replace("i","$").replace("o","%").replace("u","*");
        System.out.println(nuevafrase);
      
        /*  String cadenanueva = cadenafinal.concat(letra);  */
      
    }
}

 