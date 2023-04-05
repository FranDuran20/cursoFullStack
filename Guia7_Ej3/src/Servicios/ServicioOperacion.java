
package Servicios;

import Constructores.Operacion;
import java.util.Scanner;

public class ServicioOperacion {

    public Operacion crearOperacion() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Operacion num = new Operacion();
        System.out.println("Ingrese el numero 1: ");
        num.setNum1(leer.nextInt());
        System.out.println("Ingrese el numero 2: ");
        num.setNum2(leer.nextInt());
        return num;
    }

    public void sumar(Operacion num) {
        System.out.println("La suma de sus numeros es: " + (num.getNum1() + num.getNum2()));
    }

    public void multiplicar(Operacion num) {
        if (num.getNum2() == 0) {
            System.out.println("Multiplicacion por 0, el resultado es 0");
        } else {
            System.out.println("La Multiplicacion de sus numeros es: " + (num.getNum1() * num.getNum2()));
        }
    }

    public void restar(Operacion num) {
        System.out.println("La resta de sus numeros es: " + (num.getNum1() - num.getNum2()));
    }

    public void dividir(Operacion num) {

        if (num.getNum2() == 0) {
            System.out.println("ERROR: Division por 0");
        } else {
            System.out.println("La Division de sus numeros es: " + (num.getNum1() / num.getNum2()));
        }

    }

}
