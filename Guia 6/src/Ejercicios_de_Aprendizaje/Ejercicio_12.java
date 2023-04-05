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


public class Ejercicio_12 {


    public static void main(String[] args) {
        String cadena;
        int largo, bien=0, mal=0;
        boolean salida;
        Scanner leer=new Scanner(System.in);
        
        do {            
            System.out.println("Ingrese una cadena: "); 
            cadena=leer.nextLine();
            largo=cadena.length();
            if (cadena.equals("&&&&&")) {
               largo=-1;               
            }           
            
            switch(largo){
                case -1:
                    salida=true;
                    break;                
                case 5:
                    if (cadena.substring(0,1).equalsIgnoreCase("x") & cadena.substring(4,5).equalsIgnoreCase("o")) { //cadena.endsWith("LETRA") sirve tambien para buscar el ultimo caracter
                        bien++;
                        System.out.println("RS232 CORRECTO");
                    }else{
                    System.out.println("RS232 INCORRECTO");
                    mal++;
                    }
                    salida=false;
                    break;                
                default:
                    mal++;
                    System.out.println("Longitud Incorrecta"); 
                    salida=false;
                    break;                            
            }                        
        } while (salida==false);
        
        System.out.println("RS232 CORRECTOS: "+bien);
        System.out.println("RS232 INCORRECTOS: "+mal);
        
        
    }
    
}
