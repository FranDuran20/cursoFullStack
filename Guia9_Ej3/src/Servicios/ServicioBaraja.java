package Servicios;

import Entidades.Baraja;
import Entidades.Carta;
import Enumeradores.Numeros;
import Enumeradores.Palos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioBaraja {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Baraja crearBaraja() {
        Baraja mazo = new Baraja();
        ArrayList<Carta> mazoAux = new ArrayList();


        System.out.println("Baraja de cartas españolas :  ");
        System.out.println("");
        for (Palos auxP : Palos.values()) {
            for (Numeros auxN : Numeros.values()) {
                Carta c = new Carta();
                c.setNum(auxN.toString());
                c.setPalo(auxP.toString());
                mazoAux.add(c);
                System.out.println(c.toString());
            }
            System.out.println("");
        }
        mazo.setMazo(mazoAux);
        mazo.setDescarte(new ArrayList());
        return mazo;
    }

    public Baraja crearBarajaAux() {
        Baraja mazo = new Baraja();
        return mazo;
    }

    public Baraja mezclar(Baraja bar) {
        Collections.shuffle(bar.getMazo());
        System.out.println("");
        System.out.println("Se ah barajado el mazo: ");
        System.out.println("");
        bar.getMazo().forEach((aux) -> {
            System.out.println(aux.toString());
        });
        return bar;
    }

    public void sgteCarta(Baraja bar) {
        System.out.println("");
        if (bar.getMazo().iterator().hasNext()) {
            System.out.println("La siguiente carta de la baraja es: ");
            System.out.println(bar.getMazo().iterator().next().toString());
        } else {
            System.out.println("No hay mas cartas en la baraja");
        }
    }

    public void cartasDisponibles(Baraja bar) {
        System.out.println("");
        System.out.println("La cantidad de cartas disponibles para repartir aun es: " + bar.getMazo().size());
    }

    public Baraja darCarta(Baraja bar) {
        System.out.println("");
        System.out.println("¿Cuantas cartas desea recibir?");
        int cant = leer.nextInt();
        if (cant <= bar.getMazo().size()) {
            System.out.println("");
            System.out.println("Se le entrega la/s siguiente/s cartas: ");
            for (int i = 0; i < cant; i++) {
                System.out.println(bar.getMazo().iterator().next().toString());
                bar.getDescarte().add(bar.getMazo().iterator().next());
                bar.getMazo().remove(0);
            }
        } else {
            System.out.println("No podemos entragarle " + cant + " cartas, ya que en el mazo quedan: " + bar.getMazo().size());
        }
        return bar;
    }

    public void cartasMonton(Baraja bar) {
        System.out.println("");
        if (bar.getDescarte().isEmpty()) {
            System.out.println("Aun no se ah entregado ninguna carta");
        } else {
            System.out.println("Las cartas que han sido entregadas son: ");
            bar.getDescarte().forEach((aux) -> {
                System.out.println(aux.toString());
            });
        }
    }

    public void mostrarBaraja(Baraja bar) {
        System.out.println("");
        System.out.println("Las cartas restantes en el mazo son: ");
        bar.getMazo().forEach((aux) -> {
            System.out.println(aux.toString());            
        });
    }
}
