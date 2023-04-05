package Servicios;

import Entidad.Tienda;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class ServicioTienda {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Integer> tienda = new HashMap();

    public void Menu() {
        int opc;
        do {
            System.out.println("");
            System.out.println("MENU TIENDA \n"
                    + "1 - Agregar Producto \n"
                    + "2 - Actualizar Costo \n"
                    + "3 - Eliminar Producto \n"
                    + "4 - Mostrar Productos en Tienda \n"
                    + "5 - Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    actualizarCosto();
                    break;
                case 3:
                    borrarProducto();
                    break;
                case 4:
                    mostrarTienda();
                    break;
                case 5:
                    System.out.println("Hasta la proxima!");
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (opc != 5);
    }

    public void agregarProducto() {
        String opc;
        do {
            Tienda producto = new Tienda();
            System.out.println("Ingrese el nombre del Producto:");
            producto.setProducto(leer.next());
            System.out.println("Ingrese el valor del mismo: ");
            producto.setValor(leer.nextInt());
            tienda.put(producto.getProducto(), producto.getValor());
            System.out.println("");
            System.out.println("¿Desea agregar otro Producto? (S)i o (N)o");
            opc = leer.next();
        } while (!"n".equalsIgnoreCase(opc));
    }

    public void actualizarCosto() {
        String aux;
        System.out.println("Que producto desea Actualizar su costo?");
        aux = leer.next();

        if (tienda.containsKey(aux)) {
            System.out.print("Ingrese el nuevo costo del producto: " + aux + " > ");
            tienda.replace(aux, leer.nextInt());
            System.out.println("");
            System.out.println("Costo actualizado exitosamente!");
            System.out.println("");
        } else {
            System.out.println("El producto: " + aux + " no se encuentra en su catalogo");
            System.out.println("");
        }
    }

    public void borrarProducto() {
        String aux;
        System.out.println("Que producto desea Eliminar del catalogo?");
        aux = leer.next();
        if (tienda.containsKey(aux)) {
            tienda.remove(aux);
            System.out.println("");
            System.out.println("Producto Eliminado exitosamente!");
        } else {
            System.out.println("El producto: " + aux + " no se encuentra en su catalogo");
            System.out.println("");
        }
    }

    public void mostrarTienda() {
        // Convierto mi Mapa en TreeMap para que se ordenen alfabeticamente en este caso
        TreeMap<String, Integer> listadoTree = new TreeMap(tienda);
        System.out.println(listadoTree.toString());
    }
}
