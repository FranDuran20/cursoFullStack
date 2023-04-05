/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package ejercicio_4_guia8;

import Entidad.Pelicula;
import Servicio.ServicioPelicula;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_4_Guia8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPelicula sp = new ServicioPelicula();
        ArrayList<Pelicula> cine = new ArrayList(sp.crearPeli());
        int opc;

        do {
            System.out.println("*** CARTELERA CINEPOLIS *** \n"
                    + "Ingrese la opcion deseada: \n"
                    + "1 - Ver peliculas en Cartelera \n"
                    + "2 - Ver peliculas con duracion mayor a una hora \n"
                    + "3 - Ver peliculas de mayor a menor duracion \n"
                    + "4 - Ver Peliculas de menor a mayor duracion \n"
                    + "5 - Ver peliculas ordenadas Alfabeticamente por Titulo \n"
                    + "6 - Ver peliculas ordenadas Alfabeticamente por Director \n"
                    + "7 - Agregar nuevas Peliculas \n"
                    + "8 - Retirarme del Cine");
            opc = leer.nextInt();
            if (opc <= 8) {
                switch (opc) {
                    case 1:
                        cine.forEach((aux) -> {
                            System.out.println(aux.toString());
                        });
                        break;
                    case 2:
                        sp.menor1hora(cine);
                        break;
                    case 3:
                        cine.sort(Pelicula.compararDurDes);
                        cine.forEach((aux) -> {
                            System.out.println(aux.toString());
                        });
                        break;
                    case 4:
                        cine.sort(Pelicula.compararDurAsen);
                        cine.forEach((aux) -> {
                            System.out.println(aux.toString());
                        });
                        break;
                    case 5:
                        cine.sort(Pelicula.compararTitulo);
                        cine.forEach((aux) -> {
                            System.out.println(aux.toString());
                        });
                        break;
                    case 6:
                        cine.sort(Pelicula.compararDirector);
                        cine.forEach((aux) -> {
                            System.out.println(aux.toString());
                        });
                        break;
                    case 7:
                        sp.agregarPeli(cine);
                        break;
                    case 8:
                        System.out.println("Vuelva prontos!");
                        break;
                }
            } else {
                System.out.println("La opcion seleccionada: " + opc + " es incorrecta, ingrese opcion valida (del 1 al 8");
            }
        } while (opc != 8);
    }

}
