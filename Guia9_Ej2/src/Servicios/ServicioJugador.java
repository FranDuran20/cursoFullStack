package Servicios;

import Entidades.Jugador;
import Entidades.Revolver;
import java.util.Scanner;

public class ServicioJugador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Jugador crearJugador() {
        Jugador j = new Jugador();
        //  System.out.print("Indique el numero de Jugador a sumar al juego > ");
        // j.setId(leer.nextInt());
        System.out.print("Indique el nombre del jugador " + j.getId() + " > ");
        j.setNom(leer.next());
        j.setMojado(false);
        return j;
    }

    public Revolver disparo(Revolver r) {
        ServicioRevolver sr = new ServicioRevolver();
        sr.mojar(r);
        sr.siguienteChorro(r);

        return r;
    }

}
