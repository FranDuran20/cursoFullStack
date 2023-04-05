/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package guia10_ej2extra;

import Entidades.EdOficinas;
import Entidades.Edificio;
import Entidades.Polideportivo;
import java.util.ArrayList;

public class Guia10_Ej2Extra {

    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList();
        for (int i = 0; i < 4; i++) {
            if (i == 0 || i == 1) {
                Polideportivo pol = new Polideportivo();
                edificios.add(pol.crearPolideportivo());
            } else {
                EdOficinas eo = new EdOficinas();
                edificios.add(eo.crearEdificioOficina());
            }
            System.out.println("");
        }

        for (Edificio aux : edificios) {
            if (aux instanceof EdOficinas) {
                EdOficinas ofi = (EdOficinas) aux;
                ofi.cantidadPersonas();
            }
            System.out.println("");
        }

        for (Edificio aux : edificios) {
            if (aux instanceof Polideportivo) {
                Polideportivo pol = (Polideportivo) aux;
                System.out.println("Polideportivo: " + pol.getNombre());
                pol.calcularSuperficie();
                pol.calcularVolumen();
                continue;
            }
            if (aux instanceof EdOficinas) {
                EdOficinas ofi = (EdOficinas) aux;
                System.out.println("Edificio: " + ofi.getNombre());
                ofi.calcularSuperficie();
                ofi.calcularVolumen();
            }
            System.out.println("");
        }

        int abierto = 0;
        int cerrado = 0;

        for (Edificio aux : edificios) {
            if (aux instanceof Polideportivo) {
                Polideportivo pol = (Polideportivo) aux;
                if ("Abierto".equals(pol.getTipo())) {
                    abierto++;
                } else {
                    cerrado++;
                }
            }
        }
        System.out.println("");
        System.out.println("Cantidad de Polideportivos Abiertos: " + abierto);
        System.out.println("Cantidad de Polideportivos Cerrados: " + cerrado);

    }
}
