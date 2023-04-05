
package Servicio;

import Entidad.Matematica;

public class ServicioMatematica {
    
    public Matematica crearNumeros(){
        Matematica numeros=new Matematica();
        double n,nn;
        n=Math.random()*10;
        nn=Math.random()*10;
        numeros.setNum1(n);
        numeros.setNum2(nn);
        System.out.println("Numeros 1: "+numeros.getNum1());
        System.out.println("Numero 2: "+numeros.getNum2());        
        return numeros;
    }
    
    public void devolverMayor(Matematica numeros){   
        if (numeros.getNum1()>numeros.getNum2()) {
            System.out.println("De ambos numeros el mayor es el uno: "+numeros.getNum1());
        } else {
            System.out.println("De ambos numeros el mayor es el dos: "+numeros.getNum2());
        }     
    }
    
      public void calcularPotencia(Matematica numeros){
         int mayor, menor,pot;    
          if (numeros.getNum1()>numeros.getNum2()) {
            mayor=(int) numeros.getNum1();
            menor=(int) numeros.getNum2();
        } else {
            mayor=(int) numeros.getNum2();
            menor=(int) numeros.getNum1();
        }     
          pot=(int) Math.pow(mayor, menor);
          System.out.println("De sus numeros el mayor es: "+mayor);
          System.out.println("De sus numeros el menor es: "+menor);
          System.out.println("La potencia de "+ mayor+" elevado a "+menor+" es: "+pot);   
    }
     
      public void calcularRaiz(Matematica numeros){
         int mayor, menor,raiz;    
          if (numeros.getNum1()>numeros.getNum2()) {
            mayor=(int) numeros.getNum1();
            menor=(int) numeros.getNum2();
        } else {
            mayor=(int) numeros.getNum2();
            menor=(int) numeros.getNum1();
        }     
          raiz=(int) Math.sqrt(menor);
       System.out.println("La Raiz Cuadrada del numero menor:  "+ menor+"  es: "+raiz); 
    }
}
