/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package Ejercicios_de_Aprendizaje;

import java.util.Scanner;


public class Ejercicio_12vis {

 
    public static void main(String[] args) {
        String cadena;
        int largo, bien=0, mal=0;
        boolean salida=false;
        Scanner leer=new Scanner(System.in);
        
        
        do {            
            System.out.println("Ingrese una cadena: "); 
            cadena=leer.nextLine();
            largo=cadena.length();
            
            
            
            
            
            
            
            
        } while (salida==false);
        
        
        
        
        System.out.println("RS232 CORRECTOS: "+bien);
        System.out.println("RS232 INCORRECTOS: "+mal);
        
        
        
        
        
        
        
    }
    
}
