package Entidades;

public class Bota {

    private final int consumoCamina = 2000;
    private final int consumoCorre = 2500;
    private final int consumoVuela = 3000;
    private int resistencia = 100;
    private boolean dano = false;

    public Bota() {
    }

    public int getConsumoCamina() {
        return consumoCamina;
    }

    public int getConsumoVuela() {
        return consumoVuela;
    }

    public int getConsumoCorre() {
        return consumoCorre;
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
        return "" + " Resistencia : " + resistencia + " / Daño : " +  d;
    }

}
