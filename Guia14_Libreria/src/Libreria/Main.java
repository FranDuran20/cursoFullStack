package Libreria;

import Libreria.Servicios.CRUD_Autor;
import Libreria.Servicios.CRUD_Cliente;
import Libreria.Servicios.CRUD_Editorial;
import Libreria.Servicios.CRUD_Libro;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = emf.createEntityManager();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean flag = false, flag2 = false, flag3 = false, flag4 = false, flag5 = false, flag6= false, flag7 = false;
        int resp;
        CRUD_Autor aut = new CRUD_Autor();
        CRUD_Libro lib = new CRUD_Libro();
        CRUD_Editorial edit = new CRUD_Editorial();
       CRUD_Cliente cli = new CRUD_Cliente();

        do {
            System.out.println("");
            System.out.println("Bienvenido a la Base de datos de la librería \n"
                    + "Por Favor Indique que operación desea realizar \n"
                    + "1. Seccion Editoriales \n"
                    + "2. Seccion Autores \n"
                    + "3. Seccion Libros \n"
                    + "4. Seccion Busqueas \n"
                    + "5. Seccion Clientes \n"
                    + "6. Seccion Prestamos \n"
                    + "7. Salir del sistema.");
            System.out.print(">>");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:
                    do {
                        System.out.println("");
                        System.out.println("SECCION EDITORIALES \n"
                                + "Por Favor Indique que operación desea realizar \n"
                                + "1. Agregar Editorial \n"
                                + "2. Eliminar Editorial \n"
                                + "3. Modificar Editorial \n"
                                + "4. Volver al menu anterior \n");
                        System.out.print(">>");
                        opc = leer.nextInt();
                        switch (opc) {
                            case 1:
                                do {
                                    edit.cargarEditorial();
                                    System.out.println("¿Desea cargar otra Editorial? \n"
                                            + "1-SI \n"
                                            + "2- NO");
                                    resp = leer.nextInt();
                                } while (resp != 2);
                                break;
                            case 2:
                                do {
                                    edit.eliminarEditorial();
                                    System.out.println("¿Desea eliminar otra Editorial? \n"
                                            + "1-SI \n"
                                            + "2- NO");
                                    resp = leer.nextInt();
                                } while (resp != 2);
                                break;
                            case 3:
                                do {
                                    edit.modificarEditorial();
                                    System.out.println("¿Desea modificar otra Editorial? \n"
                                            + "1-SI \n"
                                            + "2- NO");
                                    resp = leer.nextInt();
                                } while (resp != 2);
                                break;
                            case 4:
                                System.out.println("Volviendo al menu anterior");
                                flag2 = true;
                                break;
                            default:
                                System.out.println("Opcion ingresada incorrecta, ingrese una opcion del 1 al 4");
                        }
                    } while (flag2 != true);
                    break;
                case 2:
                    do {
                        System.out.println("");
                        System.out.println("SECCION AUTORES \n"
                                + "Por Favor Indique que operación desea realizar \n"
                                + "1. Agregar Autor \n"
                                + "2. Eliminar Autor \n"
                                + "3. Modificar Autor \n"
                                + "4. Volver al menu anterior \n");
                        System.out.print(">>");
                        opc = leer.nextInt();
                        switch (opc) {
                            case 1:
                                do {
                                    aut.cargarAutor();
                                    System.out.println("¿Desea cargar otro Autor? \n"
                                            + "1-SI \n"
                                            + "2- NO");
                                    resp = leer.nextInt();
                                } while (resp != 2);
                                break;
                            case 2:
                                do {
                                    aut.eliminarAutor();
                                    System.out.println("¿Desea eliminar otro Autor? \n"
                                            + "1-SI \n"
                                            + "2- NO");
                                    resp = leer.nextInt();
                                } while (resp != 2);
                                break;
                            case 3:
                                do {
                                    aut.modificarAutor();
                                    System.out.println("¿Desea modificar otro Autor? \n"
                                            + "1-SI \n"
                                            + "2- NO");
                                    resp = leer.nextInt();
                                } while (resp != 2);
                                break;
                            case 4:
                                System.out.println("Volviendo al menu anterior");
                                flag3 = true;
                                break;
                            default:
                                System.out.println("Opcion ingresada incorrecta, ingrese una opcion del 1 al 4");
                        }
                    } while (flag3 != true);
                            
                    break;
                case 3:

                    do {
                        System.out.println("");
                        System.out.println("SECCION LIBROS \n"
                                + "Por Favor Indique que operación desea realizar \n"
                                + "1. Agregar Libro \n"
                                + "2. Eliminar Libro \n"
                                + "3. Modificar Libro \n"
                                + "4. Volver al menu anterior \n");
                        System.out.print(">>");
                        opc = leer.nextInt();
                        switch (opc) {
                            case 1:
                                do {
                                    lib.cargarLibro();
                                    System.out.println("¿Desea cargar otro Libro? \n"
                                            + "1-SI \n"
                                            + "2- NO");
                                    resp = leer.nextInt();
                                } while (resp != 2);
                                break;
                            case 2:
                                do {
                                    lib.eliminarLibro();
                                    System.out.println("¿Desea eliminar otro Libro? \n"
                                            + "1-SI \n"
                                            + "2- NO");
                                    resp = leer.nextInt();
                                } while (resp != 2);
                                break;
                            case 3:
                                do {
                                    lib.modificarLibro();
                                    System.out.println("¿Desea modificar otro Libro? \n"
                                            + "1-SI \n"
                                            + "2- NO");
                                    resp = leer.nextInt();
                                } while (resp != 2);
                                break;
                            case 4:
                                System.out.println("Volviendo al menu anterior");
                                flag4 = true;
                                break;
                            default:
                                System.out.println("Opcion ingresada incorrecta, ingrese una opcion del 1 al 4");
                        }
                    } while (flag4 != true);

                    break;
                case 4:
                    do {
                        System.out.println("");
                        System.out.println("SECCION BUSQUEDAS \n"
                                + "Por Favor Indique que operación desea realizar \n"
                                + "1. Buscar Autor \n"
                                + "2. Buscar libro por ISBN \n"
                                + "3. Buscar libro por Titulo \n"
                                + "4. Buscar libro/s por Autor \n"
                                + "5. Buscar libro/s por Editorial \n"
                                + "6. Volver al menu anterior \n");
                        System.out.print(">>");
                        opc = leer.nextInt();
                        switch (opc) {
                            case 1:
                                aut.buscarAutor();
                                break;
                            case 2:
                                lib.buscarISBN();
                                break;
                            case 3:
                                lib.buscarPorTitulo();
                                break;
                            case 4:
                                lib.buscarPorAutor();
                                break;
                            case 5:
                                lib.buscarPorEditorial();
                                break;
                            case 6:
                                System.out.println("Volviendo al menu anterior");
                                flag5 = true;
                                break;
                            default:
                                System.out.println("Opcion ingresada incorrecta, ingrese una opcion del 1 al 6");
                        }
                    } while (flag5 != true);
                    break;
                case 5:
                    
                    do {
                        System.out.println("");
                         System.out.println("SECCION CLIENTES \n"
                                + "Por Favor Indique que operación desea realizar \n"
                                + "1. Agregar Cliente \n"
                                + "2. Eliminar Cliente \n"
                                + "3. Modificar Cliente \n"
                                + "4. Volver al menu anterior \n");
                        System.out.print(">>");
                        opc = leer.nextInt();
                        switch (opc) {
                            case 1:
                               cli.cargarCliente();
                                break;
                            case 2:
                                cli.eliminarCliente();
                                break;
                            case 3:
                                cli.modificarCliente();
                                break;
                            case 4:
                                System.out.println("Volviendo al menu anterior");
                                flag6 = true;
                                break;                        
                            default:
                                System.out.println("Opcion ingresada incorrecta, ingrese una opcion del 1 al 4");
                        }
                    } while (flag6 != true);
                    
                    
                    break;
                    
                case 6:
                      do {
                        System.out.println("");
                         System.out.println("SECCION PRESTAMOS \n"
                                + "Por Favor Indique que operación desea realizar \n"
                                + "1. Prestar Libro \n"
                                + "2. Devolver Libro\n"
                                + "3. Modificar Prestamo \n"
                                + "4. Volver al menu anterior \n");
                        System.out.print(">>");
                        opc = leer.nextInt();
                        switch (opc) {
                            case 1:
                              
                                break;
                            case 2:
                               
                                break;
                            case 3:
                                
                                break;
                            case 4:
                                System.out.println("Volviendo al menu anterior");
                                flag7 = true;
                                break;                        
                            default:
                                System.out.println("Opcion ingresada incorrecta, ingrese una opcion del 1 al 4");
                        }
                    } while (flag7 != true);
                    break;
                case 7:
                    System.out.println("Saliendo del sistema, que tenga buen día!");
                    flag = true;
                    break;
                default:
                    System.out.println("Opcion ingresada incorrecta, ingrese una opcion del 1 al 6");
            }

        } while (flag != true);
    }
}
