
package Entidades;

import java.util.ArrayList;

public class Equipo {
     private String nombre;
    private ArrayList<Jugador>plantel= new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPlantel(ArrayList<Jugador> plantel) {
        this.plantel = plantel;
    }

    public ArrayList<Jugador> getPlantel() {
        return plantel;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", plantel=" + plantel + '}';
    }
    
}
