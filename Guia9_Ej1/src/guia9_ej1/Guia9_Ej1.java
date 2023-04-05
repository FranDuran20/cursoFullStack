/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package guia9_ej1;

import Entidades.Perro;
import Entidades.Persona;
import Servicios.ServicioPerro;
import Servicios.ServicioPersona;

public class Guia9_Ej1 {

    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();
        ServicioPerro sdog = new ServicioPerro();
        Perro dog1 = new Perro();
        Perro dog2 = new Perro();
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        dog1=sdog.crearPerro();
        dog2=sdog.crearPerro();
        p1=sp.crearPersona();
        p2=sp.crearPersona();        
        sp.adoptarPerro(p1, dog1, dog2, p2);  
        
        System.out.println(p1.toString());
        System.out.println("");
        System.out.println(p2.toString());
    }

}
