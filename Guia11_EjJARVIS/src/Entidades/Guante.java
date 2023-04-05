package Entidades;

public class Guante {

    private final int consumoAtaque = 5000;
    private final int consumoVuela = 3500;
    private int resistencia = 100;
    private boolean dano = false;

    public Guante() {
    }

    public int getConsumoAtaque() {
        return consumoAtaque;
    }

    public int getConsumoVuela() {
        return consumoVuela;
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
