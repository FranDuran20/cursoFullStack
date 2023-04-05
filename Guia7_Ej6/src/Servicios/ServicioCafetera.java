
package Servicios;

import Constructor.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public Cafetera CrearCafetera(){
        Cafetera caf = new Cafetera();
        
        System.out.println("Ingrese la capacidad Maxima de su Cafetera Nespreso:");
        caf.setCapMax(leer.nextDouble());
                 
        System.out.println("Ingrese la capacidad Actual de su Cafetera:");
        caf.setCapActu(leer.nextDouble());
        
        if (caf.getCapActu()>caf.getCapMax()) {
            do {                
                System.out.println("La capacidad ACTUAL no puede exceder la capacidad Maxima de la cafetera");
                System.out.println("Ingrese nuevamente la capacidad actual de cafe:");
                caf.setCapActu(leer.nextDouble());
            } while (caf.getCapActu()>caf.getCapMax());            
        }

        return caf;
    }
    
    public void LlenarCafetera (Cafetera caf){
        caf.setCapActu(caf.getCapMax());
        System.out.println("Se a llenado la cafetera, capacidad actual: "+caf.getCapActu());
    }
    
    public void ServirTaza (Cafetera caf){
        System.out.println("Ingrese la capacidad de su taza a llenar: ");
        double taza = leer.nextDouble();
        
        if (taza<=caf.getCapActu()) {
            System.out.println("Que disfrute su cafe!");
            caf.setCapActu(caf.getCapActu()-taza);
        }else{
            System.out.println("La maquina no tiene suficiente cafe para llenar una taza de: "+taza);
            double resto=taza-caf.getCapActu();
            System.out.println("Pudimos llenar su taza con la capacidad que quedaba en la maquina: "+ resto);
            caf.setCapActu(0);
        }         
    }
    
    public void VaciarCafetera (Cafetera caf){
        caf.setCapActu(0);
        System.out.println("Se a vaciado la Cafetera, capacidad: "+caf.getCapActu());
    }
    
    public void AgregarCafe (Cafetera caf){
        
        System.out.println("Ingrese la cantidad de cafe a rellenar");
        double relleno=leer.nextDouble();
        if (relleno<=(caf.getCapMax()-caf.getCapActu())) {
            caf.setCapActu(relleno+caf.getCapActu());
            System.out.println("Se a rellenado la maquina, capacidad actual: "+caf.getCapActu());
        }else{
            System.out.println("Ah tenido un excedente, la maquina a quedado cargada al maximo y el sobrante lo guardamos");            
            caf.setCapActu(caf.getCapMax());
            System.out.println("Capacidad actual: "+caf.getCapActu());
        }
    }
    
    public void DatosCafetera (Cafetera caf){
        System.out.println("La capacidad Maxima de su Cafetera es: "+caf.getCapMax());
        System.out.println("La capacidad Actual de su Cafetera es: "+caf.getCapActu());
    }
    
    public void MenuCafe(Cafetera caf){
        
        ServicioCafetera nespresso=new ServicioCafetera();
        int opc;
        do {            
        System.out.println("MENU\n"
                + " Seleccione la opcion deseada: \n"
                + " 1 - Llenar Cafetera \n"
                + " 2 - Servir Taza \n"
                + " 3 - Vaciar Cafetera \n"
                + " 4 - Agregar Cafe \n"
                + " 5 - Consultar Datos \n"
                + " 6 - SALIR");
      
        opc=leer.nextInt();
        switch(opc){
            case 1:
               nespresso.LlenarCafetera(caf);
                break;
            case 2:
                nespresso.ServirTaza(caf);
                break;
            case 3:
                nespresso.VaciarCafetera(caf);
                break;
            case 4:
                nespresso.AgregarCafe(caf);
                break;
            case 5:
                nespresso.DatosCafetera(caf);
                break;
            case 6:
                System.out.println("Hasta la proxima");
                break;
            default:
                System.out.println("Opcion Incorrecta");
                break;            
        }      
        } while (opc!=6);
        
        
    }
}
