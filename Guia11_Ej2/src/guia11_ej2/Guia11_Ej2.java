/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package guia11_ej2;

import java.util.ArrayList;


public class Guia11_Ej2 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
   
        try {
            System.out.println("Muestro el Array actual: ");
            for (Integer aux : numeros) {
            System.out.print(aux + " / ");
        }
            System.out.println("");
            System.out.println("Pido una posicion del Array no existente: ");
            System.out.println(numeros.get(6));
            /*
            Al ser un ArrayList en el tipo de expecion utilizamos: IndexOutOfBoundsException
            Si es un Array (vector) podemos utilizar el mismo o: ArrayIndexOutOfBoundsException
            */
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("El Array no tiene la posicion solicitada");
        }
        
    }
    
}
