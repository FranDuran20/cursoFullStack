package guia9_jugadores;

import Entidades.Equipo;
import Servicios.ServicioJugador;

public class Guia9_Jugadores {

    public static void main(String[] args) {
        ServicioJugador sj = new ServicioJugador();
        Equipo team = new Equipo();
        team = sj.crearEquipo();
        System.out.println(team.toString());
    }

}
