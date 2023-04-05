/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.

 */
package ejercicio_1_pdf;

import Entidad.Fraccion;
import Servicio.ServicioFraccion;
import java.util.Scanner;


public class Ejercicio_1_pdf {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioFraccion frac = new ServicioFraccion();
        Fraccion mat = frac.crear();
        int opc;
        do {
            System.out.println("");
            System.out.println("*** MENU ***");
            System.out.println("1 - Sumar \n"
                    + "2 - Restar \n"
                    + "3 - Dividir \n"
                    + "4 - Multiplicar \n"
                    + "5 - Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    frac.Sumar(mat);
                    break;
                case 2:
                    frac.Restar(mat);
                    break;
                case 3:
                    frac.Dividir(mat);
                    break;
                case 4 :
                    frac.Multiplicar(mat);
                    break;
                case 5:
                    System.out.println("Hasta luego...");
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
            System.out.println("");
        } while (opc!=5);
    }
}
