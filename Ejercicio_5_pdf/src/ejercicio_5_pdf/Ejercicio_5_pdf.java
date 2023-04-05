/*
Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
package ejercicio_5_pdf;

import Entidad.Triangulo;
import Servicio.ServicioTriangulo;

public class Ejercicio_5_pdf {

    public static void main(String[] args) {
        ServicioTriangulo isos=new ServicioTriangulo();
        Triangulo vector[]=new Triangulo [4];
        double mayor=0;
        int aux = 0;
        for (int i = 0; i < 4; i++) {
             System.out.println("");
            System.out.println("Datos de su triangulo numero: "+(i+1));
            vector[i]=isos.crear();
            isos.calcularArea(vector[i]);
            isos.calcularPerimetro(vector[i]);
            if (vector[i].getSuperficie()>mayor) {                    
                mayor=vector[i].getSuperficie();
                aux=i+1;
            }          
        }    
            System.out.println("");
            System.out.println("Mostraremos los DATOS del triangulo de mayor Area ingresado de los 4");
            System.out.println("El mismo es el triangulo numero: "+aux);
            isos.Mostrar(vector[aux]);
    }    
}
