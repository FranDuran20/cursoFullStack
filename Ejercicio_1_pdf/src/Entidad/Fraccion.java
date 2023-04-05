
package Entidad;

public class Fraccion {
    private int num1,num2,den1,den2;
    private float suma, resta, mult, div;

    public Fraccion() {
    }

    public Fraccion(int num1, int num2, int den1, int den2, float suma, float resta, float mult, float div) {
        this.num1 = num1;
        this.num2 = num2;
        this.den1 = den1;
        this.den2 = den2;
        this.suma = suma;
        this.resta = resta;
        this.mult = mult;
        this.div = div;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getDen1() {
        return den1;
    }

    public int getDen2() {
        return den2;
    }

    public double getSuma() {
        return suma;
    }

    public double getResta() {
        return resta;
    }

    public double getMult() {
        return mult;
    }

    public double getDiv() {
        return div;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setDen1(int den1) {
        this.den1 = den1;
    }

    public void setDen2(int den2) {
        this.den2 = den2;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public void setResta(float resta) {
        this.resta = resta;
    }

    public void setMult(float mult) {
        this.mult = mult;
    }

    public void setDiv(float div) {
        this.div = div;
    }
    
}
