package Entidades;

public class Casco {

    private final int consumoLeer = 500;
    private final int consumoEscribir = 250;
    private int resistencia = 100;
    private boolean dano = false;

    public Casco() {
    }

    public int getConsumoLeer() {
        return consumoLeer;
    }

    public int getConsumoEscribir() {
        return consumoEscribir;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public boolean isDano() {
        return dano;
    }

    public void setDano(boolean dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        String d;
        if (dano==true) {
            d = "Dañado";
        } else {
            d = "Sin daños";
        }
        return "" + " Resistencia : " + resistencia + " / Daño : " + d;
    }

}
