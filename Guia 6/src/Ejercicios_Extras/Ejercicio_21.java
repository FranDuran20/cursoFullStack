/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package Ejercicios_Extras;

import java.util.Scanner;

public class Ejercicio_21 {

    public static void main(String[] args) {
           Scanner leer=new Scanner(System.in);
           int tp1,tp2,int1,int2,aprob=0,desaprob=0;
           double notas[]=new double [10];   
           for(int a=0;a<=9;a++){               
               tp1=0;
               tp2=0;
               int1=0;
               int2=0;
               System.out.println("Ingrese la nota del ALUMNO "+(a+1)+" del TP1:");
               tp1=leer.nextInt();
               System.out.println("Ingrese la nota del ALUMNO "+(a+1)+" del TP2:");
               tp2=leer.nextInt();
               System.out.println("Ingrese la nota del ALUMNO "+(a+1)+" del PRIMER INTEGRADOR:");
               int1=leer.nextInt();
               System.out.println("Ingrese la nota del ALUMNO "+(a+1)+" del SEGUNDO INTEGRADOR:");
               int2=leer.nextInt();
               notas[a]=(tp1*0.1)+(tp2*0.15) +(int1*0.25  )+ (int2*0.5);
           }
           System.out.println("");
             for(int a=0;a<=9;a++){               
                if(notas[a]>=7){
                    aprob++;
                }else{
                    desaprob++;
                }
           }
             System.out.println("La cantidad de alumnos APROBADOS ES: "+aprob);
             System.out.println("La cantidad de alumnos DESAPROBADOS ES: "+desaprob);
             System.out.println("");
           for(int a=0;a<=9;a++){               
                System.out.println("Promedio del alumno: "+(a+1)+" es: "+notas[a]);
           }
    }
}
