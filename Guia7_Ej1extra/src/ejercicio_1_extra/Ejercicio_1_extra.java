/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.
 */
package ejercicio_1_extra;

import Entidad.Cancion;
import Servicio.ServicioCancion;

public class Ejercicio_1_extra {

    public static void main(String[] args) {
        ServicioCancion nueva=new ServicioCancion();
        Cancion c1=nueva.crearCancion();
        nueva.Mostrar(c1);
    } 
}
