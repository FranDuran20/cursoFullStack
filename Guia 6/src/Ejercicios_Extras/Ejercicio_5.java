/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package Ejercicios_Extras;

import java.util.Scanner;


public class Ejercicio_5 {

    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          String tipoSocio;  
          double costo, abonar = 0;
          do {            
              System.out.println("Ingrese el tipo de socio que es usted (A,B o C): ");
              tipoSocio=leer.nextLine();              
        } while (!"a".equalsIgnoreCase(tipoSocio)&&!"b".equalsIgnoreCase(tipoSocio)&&!"c".equalsIgnoreCase(tipoSocio));
          
          System.out.println("Ingrese el costo del tratamiento para calcular cuanto debe abonar: ");
          costo=leer.nextInt();
          
          switch(tipoSocio){
              case "a":                  
                  abonar=costo*0.5;                  
                  break;
              case "b":
                  abonar=costo*0.65;   
                  break;
              case "c":
                  abonar=costo;   
                  break;
          }
          System.out.println("Por ser socio tipo: "+tipoSocio+" debe abonar: $"+abonar);
    }
    
}
