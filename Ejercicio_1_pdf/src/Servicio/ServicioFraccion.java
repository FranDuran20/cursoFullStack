
package Servicio;

import Entidad.Fraccion;
import java.util.Scanner;

public class ServicioFraccion {
    Scanner leer=new Scanner(System.in);
    
    public Fraccion crear(){
        Fraccion obj=new Fraccion();
         System.out.print("Ingrese el Numerador de su Fraccion 1 > ");
         obj.setNum1(leer.nextInt());
         System.out.print("Ingrese el Denominador de su Fraccion 1 > ");
         obj.setDen1(leer.nextInt());
         System.out.print("Ingrese el Numerador de su Fraccion 2 > ");
         obj.setNum2(leer.nextInt());
         System.out.print("Ingrese el Denominador de su Fraccion 2 > ");
        obj.setDen2(leer.nextInt());
        return obj;
    }
    
    public void Sumar(Fraccion obj){
        obj.setSuma(((obj.getDen2()*obj.getNum1())+ (obj.getDen1()*obj.getNum2()))/(obj.getDen1()*obj.getDen2()));
        System.out.println("La SUMA de sus fracciones es: "+obj.getSuma());
    }
    
     public void Restar(Fraccion obj){
        obj.setResta(((obj.getDen2()*obj.getNum1())-(obj.getDen1()*obj.getNum2()))/(obj.getDen1()*obj.getDen2()));
        System.out.println("La RESTA de sus fracciones es: "+obj.getResta());        
    }
     
      public void Multiplicar(Fraccion obj){
         obj.setMult((obj.getNum1()*obj.getNum2())/(obj.getDen1()*obj.getDen2()));
        System.out.println("La MULTIPLICACION de sus fracciones es: "+obj.getMult());         
    }
      
       public void Dividir(Fraccion obj){
        obj.setDiv( (obj.getNum1()*obj.getDen2())/(obj.getDen1()*obj.getNum2()) );
           System.out.println("La DIVISION de sus fracciones es: "+obj.getDiv());
    }
    
}
