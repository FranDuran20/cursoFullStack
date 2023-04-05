/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
 */
package ejercicio_2_pdf;

import Entidad.Tiempo;

public class Ejercicio_2_pdf {
    public static void main(String[] args) {
        Tiempo reloj=new Tiempo();
        reloj.ingresarHora();
        reloj.mostrarHora();
        reloj.pasarTiempo();
    }    
}
