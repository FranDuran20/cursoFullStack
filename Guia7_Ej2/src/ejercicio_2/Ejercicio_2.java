/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package ejercicio_2;

import Constructores.Circunsferencia;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Circunsferencia cir = new Circunsferencia();
        Circunsferencia r1 = cir.crearCircunsferencia();
        r1.Area(r1);
        r1.Perimetro(r1);
        System.out.println(r1.toString());
    }
    
}
