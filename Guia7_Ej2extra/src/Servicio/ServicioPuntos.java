
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

public class ServicioPuntos {
    Scanner leer =new Scanner (System.in).useDelimiter("\n");
    public Puntos crearPuntos(){        
        Puntos coord=new Puntos();
        System.out.println("Ingrese X1:");
        coord.setX1(leer.nextInt());
        System.out.println("Ingrese X2:");
        coord.setX2(leer.nextInt());
        System.out.println("Ingrese Y1:");
        coord.setY1(leer.nextInt());
        System.out.println("Ingrese Y2:");
        coord.setY2(leer.nextInt());
        return coord;
    }
    
    public void calcularDistancia(Puntos coord){
        int aux1,aux2,pot1,pot2;
        float dist;
        aux1=coord.getX2()-coord.getX1();
        aux2=coord.getY2()-coord.getY1();
        pot1=(int) Math.pow(aux1, 2);
        pot2=(int) Math.pow(aux2, 2);
        dist=(float) Math.sqrt(pot1+pot2);
        
        System.out.println("La distancia entre los dos puntos es: "+dist);
    }
}
