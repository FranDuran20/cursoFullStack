/*
Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.

 */
package ejercicio_7_pdf;

import Entidad.Auto;
import Servicio.ServicioAuto;

public class Ejercicio_7_pdf {

    public static void main(String[] args) {
       ServicioAuto crear = new ServicioAuto();
       Auto car=crear.crearFicha();
       crear.MostrarDatos(car);
       crear.cambiarDueño(car);
       crear.MostrarDatos(car);
       crear.sumarKm(car);
       crear.MostrarDatos(car);
       crear.Service(car);
    }
    
}
