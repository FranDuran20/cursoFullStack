package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.Iterator;

public class ServicioJuego {

    public Juego llenarJuego(Revolver r, ArrayList<Jugador> part) {
        Juego jueg = new Juego();
        jueg.setPistol(r);
        jueg.setParticipantes(part);
        return jueg;
    }

    public void ronda(Juego play) {
        ServicioRevolver sr = new ServicioRevolver();
        System.out.println("Comienza el juego!");
        int cont = 0;
        sr.mostrarRevolver(play.getPistol());
        do {
            Iterator<Jugador> it = play.getParticipantes().iterator();
            for (int i = 0; i < play.getParticipantes().size(); i++) {
                if (it.hasNext()) {
                    Jugador participante = it.next();
                    System.out.println("");
                    System.out.println("El participante que disparara la pistola es: " + participante.getNom());
                    if (sr.mojar(play.getPistol()) == true) {
                        System.out.println(participante.getNom() + " ha sido mojado y queda eliminado!");
                        play.setPistol(sr.siguienteChorro(play.getPistol()));
                        play.setPistol(sr.recargarRevolver(play.getPistol()));
                        //  System.out.println("Recarga de pistola: ");
                        //   sr.mostrarRevolver(play.getPistol());
                        it.remove();
                    } else {
                        System.out.println("No estaba la bala con agua, " + participante.getNom() + " sigue en juego!");
                        play.setPistol(sr.siguienteChorro(play.getPistol()));
                    }
                }
                cont++;
            }
        } while (play.getParticipantes().size() > 1);
        System.out.println("FELCIDADES, el ganador del juego es: " + play.getParticipantes().toString());
    }
}
