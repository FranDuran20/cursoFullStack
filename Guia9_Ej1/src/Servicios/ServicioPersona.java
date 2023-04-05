
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        Persona p = new Persona();
        System.out.println("");
        System.out.print("Ingrese el nombre de la persona > ");
        p.setNom(leer.next());
        System.out.print("Ingrese el APELLIDO de "+p.getNom()+" > ");
        p.setApe(leer.next());
        System.out.print("Ingrese la EDAD de "+p.getNom()+" "+p.getApe()+" > ");
        p.setEdad(leer.nextInt());
        System.out.print("Ingrese el DNI de "+p.getNom()+" "+p.getApe()+" > ");
        p.setDni(leer.next());
        System.out.println("");
        return p;
    }
    
    public Persona adoptarPerro(Persona p1, Perro dog1, Perro dog2,Persona p2){
        Integer opc;      
        System.out.println("");
        do {            
            System.out.println("Que perro desea adoptar "+p1.getNom()+" ?");
        System.out.println("1 - "+dog1.getNomP());
        System.out.println("2 - "+dog2.getNomP());
        opc=leer.nextInt();
        } while (opc>2);        
       
        if (opc==1) {
            System.out.println("FELICIDADES!! "+p1.getNom()+" a adoptado a "+dog1.getNomP());
            p1.setDog(dog1);
            p2.setDog(dog2);
        }else{
            System.out.println("FELICIDADES!! "+p1.getNom()+" a adoptado a "+dog2.getNomP());
            p1.setDog(dog2);
            p2.setDog(dog1);
        }   
        return p1;       
    }
    
 
    
}
