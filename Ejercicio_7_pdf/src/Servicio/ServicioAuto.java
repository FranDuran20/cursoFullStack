
package Servicio;

import Entidad.Auto;
import java.util.Date;
import java.util.Scanner;

public class ServicioAuto {
     Scanner leer = new Scanner (System.in).useDelimiter("\n");
    public Auto crearFicha(){        
        Auto ficha = new Auto();
        System.out.print("Indique el Titular del vehiculo > ");
        ficha.setDueno(leer.next());
        System.out.print("Ingrese el Modelo del vehiculo > ");
        ficha.setModelo(leer.next());
        System.out.print("Ingrese el Color > ");
        ficha.setColor(leer.next());
        System.out.println("Ingrese la fecha de vencimineto del carnet de conducir");
        System.out.print("Año > ");
        ficha.setAnio(leer.nextInt());
        System.out.print("Mes > ");
        ficha.setMes(leer.nextInt());
        System.out.print("Dia > ");
        ficha.setDia(leer.nextInt());
        Date fecha = new Date(ficha.getAnio()-1900,ficha.getMes()-1,ficha.getDia());        
        ficha.setVencimiento(fecha);
        return ficha;
    }
    
    public void MostrarDatos(Auto ficha){
        System.out.println("Titular: "+ficha.getDueno());
        System.out.println("Modelo: "+ficha.getModelo());
        System.out.println("Color: "+ficha.getColor());
        System.out.println("Vencimiento Carnet: "+ficha.getVencimiento());
        System.out.println("Kilometraje: "+ficha.getKm());
    }
    
    public void cambiarDueño(Auto ficha){
        System.out.print("Indique el nombre del nuevo Titular > ");
        ficha.setDueno(leer.next());
        System.out.println("Cambio de titularidad realizado con exito!");        
    }
    
    public void sumarKm(Auto ficha){
        System.out.print("Km's recorridos en el ultimo trayecto > ");
        ficha.setKm(ficha.getKm()+leer.nextDouble());  
        System.out.println("");
        System.out.println("KM actualizado: "+ficha.getKm());
    }
    
    public void Service(Auto ficha){
        System.out.println("Se recomienda Service cada 10.000Km");
        System.out.println("");
        
        if (ficha.getKm()>10000) {
            System.out.println("Por su kilometraje actual: "+ficha.getKm()+ ", debe realizar Service a su vehiculo!");
        } else {
            System.out.println("Por su kilometraje actual: "+ficha.getKm()+ ", NO debe realizar Service a su vehiculo!");
        }
        
    }  
}
