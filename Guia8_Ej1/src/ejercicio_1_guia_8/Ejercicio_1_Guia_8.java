/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ejercicio_1_guia_8;

import Entidad.Perro;
import Servicio.ServPerros;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_1_Guia_8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServPerros dogs = new ServPerros();
        ArrayList<Perro> listaPerros = new ArrayList();
        int opc;
        String busqueda;
        boolean flag = false;
         Iterator<Perro> it2 = listaPerros.iterator();
        do {
            System.out.println("MENU");
            System.out.println("Ingrese la opcion deseada: \n"
                    + "1 - Agregar Perro \n"
                    + "2 - Borrar Perro \n"
                    + "3 - Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    Perro dog = dogs.crearPerro();
                    listaPerros.add(dog);
                    break;
                case 2:                   
                    System.out.println("Ingrese el nombre de perro que desea borrar: ");
                    busqueda = leer.next();
                    while (it2.hasNext()) {
                        if (it2.next().getNombre().equalsIgnoreCase(busqueda)) {
                            it2.remove();
                            flag = true;
                        }
                    }
                    if (flag == true) {
                        System.out.println("El perro fue eliminado");
                    } else {
                        System.out.println("El perro no esta en la lista");
                    }
                    break;
                case 3:

                    listaPerros.sort(Perro.compararNombre);
                    System.out.println("");
                    System.out.println("Ordenado por Nombre: ");
                    listaPerros.forEach((aux) -> {
                        System.out.println(aux.toString());
                    });
                    System.out.println("");
                    System.out.println("Ordenado por Raza:");
                    listaPerros.sort(Perro.compararRaza);
                    listaPerros.forEach((aux) -> {
                        System.out.println(aux.toString());
                    });
                    System.out.println("");
                    System.out.println("Ordenado por Edad:");
                    listaPerros.sort(Perro.compararEdad);
                    listaPerros.forEach((aux) -> {
                        System.out.println(aux.toString());
                    });
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opc != 3);
    }
}
