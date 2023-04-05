/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package guia9_ej3;

import Entidades.Baraja;
import Servicios.ServicioBaraja;
import java.util.Random;
import java.util.Scanner;

public class Guia9_Ej3 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int ej = aleatorio.nextInt(10);
        System.out.println(ej);
    }
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        int opc;
//        ServicioBaraja sb = new ServicioBaraja();
//        Baraja mazo = new Baraja(); 
//        mazo = sb.crearBaraja();
//        do {  
//            System.out.println("");
//            System.out.println("Seleccione la opcion deseada: \n"
//                    + "1 - Barajar Mazo \n"
//                    + "2 - Mostrar primera carta del Mazo \n"
//                    + "3 - Cantidad de cartas en el Mazo disponibles \n"
//                    + "4 - Pedir cartas \n"
//                    + "5 - Ver cartas que han sido entregadas \n"
//                    + "6 - Mostrar cartas disponibles \n"
//                    + "7 - Salir");
//            opc=leer.nextInt();
//            switch (opc) {
//                case 1:
//                    sb.mezclar(mazo);
//                    break;
//                    case 2:
//                     sb.sgteCarta(mazo);
//                    break;
//                    case 3:
//                    sb.cartasDisponibles(mazo);
//                    break;
//                    case 4:
//                    sb.darCarta(mazo);
//                    break;
//                    case 5:
//                    sb.cartasMonton(mazo);
//                    break;
//                    case 6:
//                    sb.mostrarBaraja(mazo);
//                    break;
//                    case 7:
//                        System.out.println("Hasta luego! :)");
//                    break;
//                default:
//                    System.out.println("Opcion incorrecta");;
//            }
//        } while (opc!=7);
//    }

}
