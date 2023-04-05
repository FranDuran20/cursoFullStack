
package Servicio;

import Contructor.Persona;
import java.util.Scanner;

public class ServicioPersona {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    /**
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
     * @return una persona guardada en "crear"
     */
    
    public Persona CrearPersona(){
        Persona crear = new Persona();
     
        System.out.println("Ingrese el nombre: ");
        crear.setNombre(leer.next());
        System.out.println("Ingrese la edad:");
        crear.setEdad(leer.nextInt());
        
        System.out.println("Ingrese el peso: ");
        crear.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura:");
        crear.setAltura(leer.nextDouble());
       
        do {            
            System.out.println("Ingrese el sexo: (H)ombre - (M)ujer - (O)tro");
            crear.setSexo(leer.next());
        } while (!"h".equalsIgnoreCase(crear.getSexo())&&!"o".equalsIgnoreCase(crear.getSexo())&&!"m".equalsIgnoreCase(crear.getSexo()));
        return crear;
        
    }
    
/**
Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
     * @param crear 
 */
    
        public void CalcularMC(Persona crear){
           double imc=crear.getPeso()/(crear.getAltura()*crear.getAltura());
            
            if (imc<20) {
                System.out.println("Por su indice de MC: "+imc+", esta por debajo del peso ideal");
                crear.setMc(-1);
            }else if (imc>=20&&imc<=25) {
                System.out.println("Segun su indice de MC: "+imc+", esta en su peso ideal");
                crear.setMc(0);
            }else{
                System.out.println("Segun el indice de MC: "+imc+", tiene sobrepeso");
                crear.setMc(1);
            }  
    }
    
        
        /**
        Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
        un booleano.
        * 
        * Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
     * @param crear
     * @throws java.lang.Exception
         */
        public void esMayorDeEdad(Persona crear) throws Exception{           

            if (crear.getEdad()<18) {
                System.out.println("Usted al tener: "+crear.getEdad()+", es MENOR de edad");
                crear.setMom(true);
            }else{
                System.out.println("Usted al tener: "+crear.getEdad()+", es MAYOR de edad");
                crear.setMom(false);               
            }
            throw new Exception ("No esta inicializada la edad");
        }
    
}
