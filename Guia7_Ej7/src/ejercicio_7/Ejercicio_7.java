/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package ejercicio_7;

import Contructor.Persona;
import Servicio.ServicioPersona;

public class Ejercicio_7 {

    public static void main(String[] args) throws Exception {
        ServicioPersona sp= new ServicioPersona() ;       
        int dp=0,pi=0,ep=0,menor=0,mayor=0;
        Persona p1 = new Persona("Pepe", 5, "H", 80, 190);
        Persona p2= null;       
        
        try {
            sp.esMayorDeEdad(p1);
            sp.esMayorDeEdad(p2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        /**
         * Creo un vector de tipo de variable "Persona" es decir que el vector contendra "Objetos", luego recorro el bucle for donde voy creando los objetos
         * personas y se van guardando en cada posicion del vector, por ende luego puedo solicitar cualquier parametro de dicho objeto.
         */
//        Persona personas[]=new Persona[4];
//        for (int i = 0; i < 4; i++) {
//            personas[i]=sp.CrearPersona();
//            nuevo.CalcularMC(personas[i]);
//             switch (personas[i].getMc()) {
//                case -1:
//                    dp++;
//                    break;
//                case 0:
//                    pi++;
//                    break;
//                case 1:
//                    ep++;
//                    break;
//            }
//            sp.esMayorDeEdad(personas[i]);
//             if (personas[i].isMom()== true) {
//                menor++;
//            }else{
//                mayor++;
//            }
//        }
//             System.out.println("Porcentaje de personas Debajo de su peso: "+(dp*100)/4);   
//             System.out.println("Porcentaje de personas en su peso ideal: "+(pi*100)/4);
//             System.out.println("Porcentaje de personas son sobrepeso: "+(ep*100)/4);   
//             System.out.println("");
//             System.out.println("De las 4 personas son MENORES: "+menor);
//             System.out.println("De las 4 personas son MAYORES: "+mayor);    
    }    
}
