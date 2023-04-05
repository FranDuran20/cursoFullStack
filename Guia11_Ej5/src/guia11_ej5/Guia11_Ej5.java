/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package guia11_ej5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Guia11_Ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        int num = random.nextInt(500), cont=1, opc = 502;        
        System.out.println(num);
        
        System.out.println("Juego: ¡Adivinar el Numero!");
        do {            
            try {
               System.out.print("Ingrese un numero para intentar adivinarlo > ");
            opc= leer.nextInt();            
            if (opc==num) {
                System.out.println("Felicidades ah descubierto el numero oculto: "+num+", en "+cont+" intentos!");
                
            } else if(opc<num) {
                System.out.println("El numero oculto no es el "+opc+", es mayor!");
            }else{
                System.out.println("El numero oculto no es el "+opc+", es menor!");
            }             
            } catch (InputMismatchException e) {
                System.out.println("Ingreso incorrecto! Debe indicar un numero!");                
                            
                leer.next();
            }catch(Exception e){
                System.out.println("Error! Siga intentando!");
            }finally{
                cont++; 
            }               
        } while (opc!=num); 
    }
}
