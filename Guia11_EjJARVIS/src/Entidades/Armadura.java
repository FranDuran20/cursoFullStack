
package Entidades;



public class Armadura  {
    
    protected String colorPrimario;
    protected String colorSecundario;
    protected int energiaTotal;
    protected int resistencia;
    protected Bota b1;
    protected Bota b2;
    protected Guante g1;
    protected Guante g2;
    protected Casco c;
    protected int bateria;
    
    public Armadura()  {
        this.colorPrimario = "Rojo";
        this.colorSecundario = "Amarillo";
        this.energiaTotal =  1000000;
        this.resistencia = 100;
    }

    public Armadura(String colorPrimario, String colorSecundario, int energiaTotal, int resistencia, Bota b1, Bota b2, Guante g1, Guante g2, Casco c, int bateria) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.energiaTotal = energiaTotal;
        this.resistencia = resistencia;
        this.b1 = b1;
        this.b2 = b2;
        this.g1 = g1;
        this.g2 = g2;
        this.c = c;
        this.bateria = bateria;
    }

   

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getEnergiaTotal() {
        return energiaTotal;
    }

    public void setEnergiaTotal(int energiaTotal) {
        this.energiaTotal = energiaTotal;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public Bota getB1() {
        return b1;
    }

    public void setB1(Bota b1) {
        this.b1 = b1;
    }

    public Bota getB2() {
        return b2;
    }

    public void setB2(Bota b2) {
        this.b2 = b2;
    }

    public Guante getG1() {
        return g1;
    }

    public void setG1(Guante g1) {
        this.g1 = g1;
    }

    public Guante getG2() {
        return g2;
    }

    public void setG2(Guante g2) {
        this.g2 = g2;
    }

    public Casco getC() {
        return c;
    }

    public void setC(Casco c) {
        this.c = c;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return " Armadura: " + "Color Primario : " + colorPrimario + " / Color Secundario : " + colorSecundario + " / Energia Total : " + energiaTotal + " / Resistencia : " + resistencia + "\n"
                + "" + " BOTA 1=" + b1 + "\n"
                + "" + " BOTA 2=" + b2 + "\n"
                + "" + " GUANTE 1=" + g1 + "\n"
                + "" + " GUANTE 2=" + g2 + "\n"
                + "" + " CASCO=" + c + "\n"
                + " BATERIA Restante del traje: " + bateria + "%";
    }

}
