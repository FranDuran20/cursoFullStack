/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package Ejercicios_Extras;


public class Ejercicio_12 {

    public static void main(String[] args) {

        for (int j = 0; j <= 9; j++) {
            for (int b = 0; b <= 9; b++) {
                for (int k = 0; k <= 9; k++) {
                String x = String.valueOf(j);
                String y = String.valueOf(b);
                String z = String.valueOf(k);   
                if("3".equalsIgnoreCase(x)){
                    x="E";
                }
                  if("3".equalsIgnoreCase(y)){
                    y="E";
                }
                    if("3".equalsIgnoreCase(z)){
                    z="E";
                }          
                    System.out.println(x+"-"+y+"-"+z);
                }                
            }
        }
    }
}
