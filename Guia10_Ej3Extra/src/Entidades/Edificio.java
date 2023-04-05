/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 * ESTE SERA EL PADRE DE TODOS
 *
 */
abstract public class Edificio {

    protected String nombre, direccion, localidad, gerente;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Edificio() {
    }

    public Edificio(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void crearEdificio() {
        System.out.println("Ingrese el nombre: ");
        this.nombre = leer.next();
        System.out.println("Ingrese la Direccion del establecimiento: ");
        this.direccion = leer.next();
        System.out.println("Ingrese la Localidad: ");
        this.localidad = leer.next();
        System.out.println("Ingrese el nombre del Gerente a cargo del establecimiento: ");
        this.gerente = leer.next();
    }

    public void mostrarDatos() {
        System.out.println("Nombre del Establecimiento: " + this.nombre);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Localidad: " + this.localidad);
        System.out.println("Gerente del Establecimiento: " + this.gerente);
    }

}
