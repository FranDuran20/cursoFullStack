
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class ServicioPersona {
    Scanner leer =new Scanner (System.in).useDelimiter("\n");
    public Persona crearPersona(){
    Persona nueva = new Persona();
        System.out.println("Ingrese el nombre de la persona: ");
        nueva.setNombre(leer.nextLine());
        System.out.print("Ingrese dia de nacimiento: > ");
        nueva.setDia(leer.nextInt());
        System.out.print("Ingrese mes de nacimiento: > ");
        nueva.setMes(leer.nextInt());
        System.out.print("Ingrese año de nacimiento: > ");
        nueva.setAnio(leer.nextInt());         
        Date fecha = new Date(nueva.getAnio()-1900,nueva.getMes()-1,nueva.getDia());   
        nueva.setFecha(fecha);
        System.out.println("");  
        return nueva;
}
   
    public void calcularEdad(Persona nueva){
         Date fechaActual=new Date();
         System.out.println("Usted tiene: "+(fechaActual.getYear()-nueva.getFecha().getYear())+" años");       
    }
    
    
     public void MenorQue(Persona nueva){
       int dia,mes,anio;
         Date fechaActual=new Date();
        System.out.print("Ingrese dia de nacimiento de la persona 2: > ");
        dia=leer.nextInt();
        System.out.print("Ingrese mes de nacimiento de la persona 2: > ");
        mes=leer.nextInt();
        System.out.print("Ingrese año de nacimiento de la persona 2: > ");
        anio=leer.nextInt();        
        Date fecha2=new Date (anio-1900,mes-1,dia);
        
         if ((fechaActual.getYear()-nueva.getFecha().getYear())>(fechaActual.getYear()-fecha2.getYear())) {
             System.out.println(nueva.getNombre()+" es mayor que la segunda edad ingresada");
         } else {
             System.out.println(nueva.getNombre()+" es menor que la segunda edad ingresada");
         }
    }
    
     
      public void MostrarPersona(Persona nueva){
          System.out.println("Nombre de la persona: "+nueva.getNombre());
          System.out.println("Fecha de nacimiento: "+nueva.getFecha());
    }
}
