package Entidades;

import java.util.Scanner;

/**
 * Sera padre
 */
abstract public class Alojamiento {

    protected boolean privado = false;
    protected int m2;
    protected String nombre;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alojamiento() {
    }

    public Alojamiento(boolean privado, int m2, String nombre) {
        this.privado = privado;
        this.m2 = m2;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public void crearAlojamiento() {
        String opc;
        System.out.println("Ingrese el nombre: ");
        this.nombre = leer.next();
        do {
            System.out.println("¿El alojamiento es privado? (S)i / (N)o");
            opc = leer.next();
        } while (!"s".equalsIgnoreCase(opc) && !"n".equalsIgnoreCase(opc));
        if ("s".equalsIgnoreCase(opc)) {
            this.privado = true;
        }
        System.out.println("Indique el tamaño del mismo (en m2): ");
        this.m2 = leer.nextInt();
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        if (this.privado == true) {
            System.out.println("El alojamiento es Privado.");
        } else {
            System.out.println("El alojamiento es Publico.");
        }
        System.out.println("El tamaño del mismo es: " + this.m2 + " m2");
    }
}
