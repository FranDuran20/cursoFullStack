
package Entidades;

import Enumeradores.Numeros;
import Enumeradores.Palos;

public class Carta {
    private String num;
    private String palo;

    public Carta() {
    }

    public Carta(String num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return num+" de "+ palo ;
    }

}
