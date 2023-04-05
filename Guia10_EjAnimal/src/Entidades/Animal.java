
package Entidades;

import Interfaces.Alimentacion;

public abstract class Animal implements Alimentacion {
    
    public void Saludo(){
        System.out.println("Hola!");        
    }    

    @Override
    public void comer(int vecesDia, String alimento) {
        System.out.println("Se alimenta : "+vecesDia+" veces al dia");
        System.out.println("Se alimenta de: "+alimento);
    }

}
