/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package guia10_ej4;

import Entidades.Circulo;
import Entidades.Rectangulo;

public class Guia10_Ej4 {

    public static void main(String[] args) {

        Rectangulo r = new Rectangulo();
        r = r.crearRectangulo();
        System.out.println("El Area del Rectangulo es: " + r.calcularArea());
        System.out.println("El Perimetro del Rectangulo es: " + r.calcularPerimetro());
        System.out.println("");
        Circulo c = new Circulo();
        c = c.crearCirculo();
        System.out.println("El Area del Circulo es: " + c.calcularArea());
        System.out.println("El Perimetro del Ciruclo es: " + c.calcularPerimetro());
    }

}
