/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package guia11_ej3;

import Servicio.DivisionNumero;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class Guia11_Ej3 {

    public static void main(String[] args) {
        String num1, num2;
        DivisionNumero div = new DivisionNumero();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer numero:");
        num1 = leer.next();
        System.out.println("Ingrese el segundo numero:");
        num2 = leer.next();

        int n1 = parseInt(num1), n2 = parseInt(num2);

        try {
            div.division(n1, n2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("No se puede dividir por 0");
        }

    }

}
