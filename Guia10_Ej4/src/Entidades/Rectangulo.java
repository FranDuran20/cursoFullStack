package Entidades;

import Interfaz.calculosFormas;
import java.util.Scanner;

public class Rectangulo implements calculosFormas {
    
    private double base;
    private double altura;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Rectangulo() {
    }
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public Scanner getLeer() {
        return leer;
    }
    
    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    public Rectangulo crearRectangulo() {
        Rectangulo r = new Rectangulo();
        System.out.print("Indique la Base del Rectangulo >");
        r.setBase(leer.nextDouble());
        System.out.print("Indique la Altura del Rectangulo >");
        r.setAltura(leer.nextDouble());
        return r;
    }
    
    @Override
    public double calcularArea() {        
        return base * altura;
    }
    
    @Override
    public double calcularPerimetro() {
        return (base + altura) * 2;
    }
    
}
