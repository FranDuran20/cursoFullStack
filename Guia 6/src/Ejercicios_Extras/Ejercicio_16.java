/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package Ejercicios_Extras;

import java.util.Scanner;

public class Ejercicio_16 {
 
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int edad;
        String nombre,resp;
        do {            
            System.out.println("Ingrese el nombre: ");
        nombre=nombre();
        System.out.println("Ingrese la edad de "+nombre+" :");
        edad=leer.nextInt();
        if(edad>=18){
            System.out.println(nombre+" es mayor de edad");
        }else{
            System.out.println(nombre+" es menor de edad");
        }        
        System.out.println("¿Desea mostrar otra persona? (Escriba 'No' para detener la ejecucion)");
        resp=continuar();
        } while (!"No".equalsIgnoreCase(resp));
    }    

    private static String continuar() {
       Scanner leer=new Scanner(System.in);
        String continuar;
        continuar=leer.nextLine();
        return continuar;
    }
    
     private static String nombre() {
       Scanner leer=new Scanner(System.in);
        String nombre;
        nombre=leer.nextLine();
        return nombre;
    }
}
