/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package Ejercicios_Extras;

public class Ejercicio_20 {

    public static void main(String[] args) {     
      int vector[]=new int [5];  
      rellenar(vector);
      mostrar(vector);
    }

    private static void rellenar(int vector[]) {        
        for(int a=0; a<=4;a++){
            vector[a]=(int)(Math.random()*10);
        }        
    }
    
    private static void mostrar(int vector[]) {        
        for(int a=0; a<=4;a++){
            System.out.print(vector[a]+" ");
        }        
    }
}
