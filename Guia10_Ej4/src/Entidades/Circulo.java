package Entidades;

import Interfaz.calculosFormas;
import java.util.Scanner;

public class Circulo implements calculosFormas {

    private int radio;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Circulo crearCirculo() {
        Circulo c = new Circulo();
        System.out.print("Indique el Radio del Circulo >");
        c.setRadio(leer.nextInt());
        return c;
    }

    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return PI * 2 * radio;
    }

}
