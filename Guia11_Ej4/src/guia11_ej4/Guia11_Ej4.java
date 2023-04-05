/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
package guia11_ej4;

import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Guia11_Ej4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String var1, var2;
        int num1;

        try {
            System.out.println("Ingrese un numero: ");
            num1 = leer.nextInt();

            System.out.println("Ingrese una palabra:");
            var1 = leer.next();

            System.out.println("Ingrese otro numero: ");
            var2 = leer.next();
            
            int num2 = parseInt(var2);
            int res = num1 / num2;
            
        } catch (NumberFormatException e) {
            System.out.println(e);
            System.out.println("No se pudo convertir la variable a entero");
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("No se puede hacer division por 0");
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("Tipo de variable mal ingresada");
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Error de sistema");
        }
    }
}
