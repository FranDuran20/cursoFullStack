
package Servicios;

import Entidad.Paises;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPais {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet <Paises> listado=new HashSet();
    
    public void Menu() {
        int opc;
        do {
            System.out.println("MENU \n"
                    + "1 - Agregar Pais \n"
                    + "2 - Ver listado de Paises \n"
                    + "3 - Borrar Pais \n"
                    + "4 - Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    agregarPaises();
                    break;
                case 2:
                      ordenarPaises();
                    break;
                case 3:
                         borrarPaises();        
                    break;
                case 4:
                    System.out.println("Hasta la proxima!");
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (opc != 4);
    }

    public void agregarPaises(){
        String opc;
        do {
            Paises p=new Paises();
            System.out.println("Ingrese el nombre del Pais a agregar:");
            p.setNompais(leer.next());
            listado.add(p);            
            System.out.println("¿Desea agregar otro Pais? (S)i o (N)o");
            opc=leer.next();
        } while (!"n".equalsIgnoreCase(opc));
    }
    
    public void ordenarPaises(){
        ArrayList<Paises> listadoOrd=new ArrayList(listado);
        listadoOrd.sort(Paises.compararNombre);        
        listadoOrd.forEach((paises) -> {
            System.out.println(paises.toString());
        });        
    }

    public void borrarPaises() {
        Iterator<Paises> itP = listado.iterator();
        String busqueda;
        int flag = 0;
        System.out.println("Que Pais desea eliminar de la lista?");
        busqueda = leer.next();
        while (itP.hasNext()) {
            if (itP.next().getNompais().equalsIgnoreCase(busqueda)) {
                itP.remove();
               System.out.println("El Pais: " + busqueda + " ah sido eliminado del Listado");
               flag=1;
            } 
        }     
        if (flag==0) {
              System.out.println("El Pais: " + busqueda + " no se encuentra en el Listado");
        } 
    }
}
