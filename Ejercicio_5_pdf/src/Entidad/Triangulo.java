
package Entidad;

public class Triangulo {
    
    private int ladoigual, lado;
    private double perimetro,superficie;

    public Triangulo() {
    }

    public Triangulo(int ladoigual, int lado, double perimetro, double superficie) {
        this.ladoigual = ladoigual;
        this.lado = lado;
        this.perimetro = perimetro;
        this.superficie = superficie;
    }

    public int getLadoigual() {
        return ladoigual;
    }

    public int getLado() {
        return lado;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setLadoigual(int ladoigual) {
        this.ladoigual = ladoigual;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
  
}
