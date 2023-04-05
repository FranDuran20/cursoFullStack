
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

public class ServicioNIF {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public NIF crearNIF() {
        String vector[] = new String[23];
        String palabras = "TRWAGMYFPDXBNJZSQVHLCKE";
        NIF nuevo = new NIF();
        System.out.println("Ingrese el DNI");
        nuevo.setDNI(leer.nextInt());
        nuevo.setResto(nuevo.getDNI() % 23);
        System.out.println("resto: " + nuevo.getResto());
        for (int i = 0; i < 23; i++) {
            vector[i] = palabras.substring(i, i + 1);
        }       
        nuevo.setLetra(vector[nuevo.getResto()]);
        return nuevo;
    }

    public void mostrarNIF(NIF nuevo) {
        System.out.println(nuevo.getDNI() + "-"+nuevo.getLetra());
    }

}
