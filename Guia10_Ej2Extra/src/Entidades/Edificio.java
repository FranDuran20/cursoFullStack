
package Entidades;

import java.util.Scanner;

public abstract class Edificio {
    
    protected int ancho;
    protected int largo;
    protected int alto;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Edificio() {
    }

    public Edificio(int ancho, int largo, int alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void crearEdificio(){
        System.out.print("Indique el Ancho del Edificio > ");
        this.ancho=leer.nextInt();
        System.out.print("Indique el Largo del Edificio > ");
        this.largo=leer.nextInt();
        System.out.print("Indique el Alto del Edificio > ");
        this.alto=leer.nextInt();
    }

    public abstract void calcularSuperficie();

    public abstract void calcularVolumen();

  public void mostrarDatos(){
      System.out.println("Ancho: "+this.ancho);
      System.out.println("Largo: "+this.largo);
      System.out.println("Alto: "+this.alto);    
  }
    
    
}
