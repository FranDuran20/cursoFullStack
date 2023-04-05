
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

public class ServicioRaices {
    Scanner leer =new Scanner (System.in).useDelimiter("\n");
    public Raices crearNumeros(){
        Raices numeros=new Raices();
        System.out.println("Ingrese numero A > ");
        numeros.setA(leer.nextInt());
        System.out.println("Ingrese numero B > ");
        numeros.setB(leer.nextInt());
        System.out.println("Ingrese numero C > ");
        numeros.setC(leer.nextInt());
        return numeros;        
    }
    /**
     * devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
     * @param numeros 
     */
    public void getDiscriminante(Raices numeros){
        
        numeros.setDisc(Math.pow(numeros.getB(), 2)-(4*numeros.getA()*numeros.getC()));
        System.out.println("El valor Discriminante es: "+numeros.getDisc());  
        
    }
    
    /**
     * devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
     * @param numeros 
     */
     public void tieneRaices(Raices numeros){
        boolean raices;
         if (numeros.getDisc()>=0) {
             raices=true;
             System.out.println("Si tiene Raices");
         } else {
             raices=false;
             System.out.println("No tiene dos soluciones (raices)");
         }
        
    }
     
     /**
      *  devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
      * @param numeros 
      */
     public void tieneRaiz(Raices numeros){
        boolean raiz;
         if (numeros.getDisc()==0) {
             raiz=true;
             System.out.println("Tiene una unica Raiz (solucion)");
         } else {
             raiz=false;
             System.out.println("Tiene mas de una solucion");
         }
        
    }
      /**
       * llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
soluciones.
       * @param numeros 
       */
      public void obtenerRaices(Raices numeros){
        
        
    }
     
        public void obtenerRaiz(Raices numeros){
        
        
    }
     
     
     
       public void calcular(Raices numeros){
        
        
    }
}
