package Entidades;

import java.util.ArrayList;

public class Juego {

    private Revolver pistol;
    private ArrayList<Jugador> participantes;

    public Juego() {
    }

    public Juego(Revolver pistol, ArrayList<Jugador> participantes) {
        this.pistol = pistol;
        this.participantes = participantes;
    }

    public Revolver getPistol() {
        return pistol;
    }

    public ArrayList<Jugador> getParticipantes() {
        return participantes;
    }

    public void setPistol(Revolver pistol) {
        this.pistol = pistol;
    }

    public void setParticipantes(ArrayList<Jugador> participantes) {
        this.participantes = participantes;
    }

    @Override
    public String toString() {
        return "Juego{" + "pistol=" + pistol + ", participantes=" + participantes + '}';
    }

}
