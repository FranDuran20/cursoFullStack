/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicio_4;

import Constructor.Rectangulo;
import Servicios.ServicioRectangulo;

public class Ejercicio_4 {

    public static void main(String[] args) {
        ServicioRectangulo rec = new ServicioRectangulo();
        Rectangulo uno=rec.CrearRectangulo();
        System.out.println(uno.toString());
        System.out.println("");
        rec.Perimetro(uno);
        rec.Superficie(uno);
        rec.Dibujar(uno);
    }
    
}
