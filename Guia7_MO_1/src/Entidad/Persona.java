/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

public class Persona {

    private String nombre;
    private String apodo;
    private int edad;
    private int energia;
    private int rutinas;

    public Persona(String nombre, String apodo, int edad,int energia,int rutinas) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;
        this.energia=100;
        this.rutinas=rutinas;
    }

    public int Ejercicio(int energiaRestar){
        energia-=energiaRestar;
        return energia;
    }
    
    public int Ejercicio(int energiaRestar, int rutinas) {

        if (rutinas <= 10) {
            for (int i = 0; i < rutinas; i++) {
                energia -= energiaRestar;
            }
        } else {
            System.out.println("El maximo de rutinas es 10");
        }
        return energia;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public int getEdad() {
        return edad;
    }

    public int getEnergia() {
        return energia;
    }
    
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apodo=" + apodo + ", edad=" + edad + ", energia=" + energia + '}';
    }

    

}
