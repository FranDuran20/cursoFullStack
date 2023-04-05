package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Pelicula> crearPeli() {
        ArrayList<Pelicula> cartelera = new ArrayList();
        String opc;
        System.out.println("Menu - Crear Cartelera de CINE");
        do {
            System.out.println("¿Desea ingresar una nueva pelicular a cartelera? (S)i o (N)o");
            opc = leer.next();
            if ("s".equalsIgnoreCase(opc)) {
                Pelicula peli = new Pelicula();
                System.out.println("Ingrese el nombre de la Pelicula: ");
                peli.setTitulo(leer.next());
                System.out.println("Ingrese el Director: ");
                peli.setDir(leer.next());
                System.out.println("Ingrese la duracion (en horas) de la pelicula: ");
                peli.setTime(leer.nextInt());
                cartelera.add(peli);
            } else {
                System.out.println("La opcion seleccionada: " + opc + " es incorrecta, ingrese S o N");
            }
        } while (!"n".equalsIgnoreCase(opc));
        return cartelera;
    }

    public ArrayList<Pelicula> agregarPeli(ArrayList cartelera) {

        String opc;
        System.out.println("Menu - Agregar Pelicula");
        do {
            System.out.println("¿Desea ingresar una nueva pelicular a cartelera? (S)i o (N)o");
            opc = leer.next();
            if ("s".equalsIgnoreCase(opc)) {
                Pelicula peli = new Pelicula();
                System.out.println("Ingrese el nombre de la Pelicula: ");
                peli.setTitulo(leer.next());
                System.out.println("Ingrese el Director: ");
                peli.setDir(leer.next());
                System.out.println("Ingrese la duracion (en horas) de la pelicula: ");
                peli.setTime(leer.nextInt());
                cartelera.add(peli);
            } else {
                System.out.println("La opcion seleccionada: " + opc + " es incorrecta, ingrese S o N");
            }
        } while (!"n".equalsIgnoreCase(opc));
        return cartelera;
    }

    public void menor1hora(ArrayList<Pelicula> cartelera) {

        cartelera.sort(Pelicula.compararDurAsen);
        System.out.println("Pelis de mas de 1 hora! ");
        System.out.println("");
        cartelera.forEach((pelicula) -> {
            if (pelicula.getTime() > 1) {
                System.out.println(pelicula.toString());
            }
        });

    }

}
