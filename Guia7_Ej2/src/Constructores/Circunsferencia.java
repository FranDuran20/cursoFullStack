/*
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package Constructores;

import java.util.Scanner;

public class Circunsferencia {
    private double radio;
    private double area;
    private double perimetro;
    
   public Circunsferencia(){        
    }
    
    public Circunsferencia(double radio){
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
    public Circunsferencia crearCircunsferencia(){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el radio del circulo:");
        Circunsferencia r1 = new Circunsferencia(leer.nextDouble());
          
        return r1;
    }
    
    public double Area(Circunsferencia r1){        
        
        area = Math.PI * (Math.pow(r1.getRadio(), 2));  
        System.out.println("El area de su circunsferencia es: "+area);
        return area;
    }
    
    public double Perimetro(Circunsferencia r1){
        
        perimetro = (2*Math.PI*r1.getRadio());   
        System.out.println("El Perimetro de su circunsferencia es: "+perimetro);    
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circunsferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

}
