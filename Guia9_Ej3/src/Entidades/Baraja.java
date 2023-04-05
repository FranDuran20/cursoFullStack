
package Entidades;

import Enumeradores.Numeros;
import java.util.ArrayList;

public class Baraja {
    private ArrayList <Carta> mazo;
    private ArrayList <Carta> descarte;

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> mazo, ArrayList<Carta> descarte) {
        this.mazo = mazo;
        this.descarte = descarte;
    }

    public ArrayList<Carta> getDescarte() {
        return descarte;
    }

    public void setDescarte(ArrayList<Carta> descarte) {
        this.descarte = descarte;
    }

   

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    @Override
    public String toString() {
        return   mazo.iterator().next().getNum() + " de " + mazo.iterator().next().getPalo();
    }
    
}
