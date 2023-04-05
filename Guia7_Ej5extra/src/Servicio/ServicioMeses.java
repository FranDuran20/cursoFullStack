
package Servicio;

import Entidad.Meses;
import java.util.Scanner;

public class ServicioMeses {
    Scanner leer = new Scanner (System.in);
    String aux[]=new String[12];
    public Meses crearJuego(){
        Meses bm=new Meses();        
        aux[0]="Enero";
        aux[1]="Febrero";
        aux[2]="Marzo";
        aux[3]="Abril";
        aux[4]="Mayo";
        aux[5]="Junio";
        aux[6]="Julio";
        aux[7]="Agosto";
        aux[8]="Septiembre";
        aux[9]="Octubre";
        aux[10]="Noviembre";
        aux[11]="Diciembre";        
        bm.setVectorMeses(aux);
        bm.setMesSecreto(aux[(int)(Math.random()*10)]);        
        System.out.println("Mes secreto: "+bm.getMesSecreto());
        return bm;
    }
    
    public void Jugar(Meses bm){
        boolean encontrado=false;  
        do {            
            System.out.println("Debe descubrir el mes secreto, ingrese alguno: ");
        bm.setBuscar(leer.next());
        if (bm.getBuscar().equalsIgnoreCase(bm.getMesSecreto())) {
            System.out.println("Felicitaciones ah descubierto el mes secreto!");
            encontrado=true;
        } else {
            System.out.println("El mes secreto NO es: "+bm.getBuscar());
        }
        } while (encontrado==false);
    }
}
