
package Servicio;

import Entidad.Arreglo;
import java.util.Arrays;

public class ServicioArreglo {
    double aux[]=new double[50];
    double aux2[]=new double[20];
    public Arreglo crearArreglo(){
        Arreglo arr = new Arreglo();
        System.out.println("Vector aleatorio de 50 numeros:");
        for (int i = 0; i < arr.getVector50().length; i++) { 
            
            aux[i]=(Math.round(Math.random()*50));  
            System.out.print("["+aux[i]+"] ");
        } 
        System.out.println("");
        arr.setVector50(aux);
        Arrays.sort(arr.getVector50()); 
        System.out.println(Arrays.toString(arr.getVector50()));
        System.out.println("");
        System.out.println("Vector 2, los primeros 10 numeros son del vector 1:");
        Arrays.fill(aux2, 10, 20, 0.5);
         for (int i = 0; i < 10; i++) {
           Arrays.fill(aux2, i, i+1, arr.getVector50()[i]);
        }     
        arr.setVector20(aux2);
        System.out.println(Arrays.toString(arr.getVector20()));        
     return arr;   
    }   
}
