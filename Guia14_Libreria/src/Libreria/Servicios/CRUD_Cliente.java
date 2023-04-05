package Libreria.Servicios;

import Libreria.Entidades.Cliente;
import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CRUD_Cliente {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarCliente() {
        boolean flag = false;
        try {
            do {
                Cliente cli = new Cliente();
                System.out.print("Ingrese el DNI del Cliente > ");
                Long dni = leer.nextLong();
                Collection<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c WHERE c.dni LIKE :dni").setParameter("dni", dni).getResultList();
                if (clientes.isEmpty()) {
                    cli.setDni(dni);
                    System.out.print("Ingrese el numero de telefono del Cliente > ");
                    String tel = leer.next();
                    clientes = em.createQuery("SELECT c FROM Cliente c WHERE c.telefono LIKE :telefono").setParameter("telefono", tel).getResultList();
                    if (clientes.isEmpty()) {
                        cli.setTelefono(tel);
                        System.out.print("Ingrese el nombre del Cliente > ");
                        cli.setNombre(leer.next());
                        System.out.print("Ingrese el Apellido del Cliente > ");
                        cli.setApellido(leer.next());
                        System.out.println("Cliente: " + cli.getNombre() + " " + cli.getApellido() + " cargado correctamente.");
                        em.getTransaction().begin();
                        em.persist(cli);
                        em.getTransaction().commit();
                    } else {
                        System.out.println("ERROR: El numero de telefono ingresado ya se encuentra registrado en la Base de Datos");
                    }
                } else {
                    System.out.println("ERROR: El DNI ingresado ya esta registrado en la Base de Datos");
                }
                System.out.println("¿Desea agregar un nuevo Cliente? \n"
                        + "1. Si \n"
                        + "2. No, volver al Menu anterior");
                int opc = leer.nextInt();
                if (opc == 2) {
                    flag = true;
                }
            } while (flag != true);

        } catch (Exception e) {
            System.out.println("Error de Sistema");
            System.out.println(e);
        }
    }

    public void eliminarCliente() {
        try {
            boolean flag = false;
            System.out.println("Ingrese el nombre del Cliente (o partes del mismo) para buscar:");
            String busqueda = leer.next();
            Collection<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c WHERE c.nombre LIKE :nombre")
                    .setParameter("nombre", "%" + busqueda + "%")
                    .getResultList();

            if (clientes.isEmpty()) {
                System.out.println("No se han encontrado coincidencias en su busqueda");
            } else {
                System.out.println("Se ah encontrado el siguiente resultado de su busqueda: '' " + busqueda + " '' ");
                for (Cliente aux : clientes) {
                    System.out.println("ID: " + aux.getId() + " : " + aux.getNombre() + " " + aux.getApellido());
                }
            }
            do {
                System.out.println("¿Desea Eliminar un libro de la Base de Datos? \n"
                        + "1. Si \n"
                        + "2. Volver al Menu anterior");
                int opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Ingrese el ID del Cliente a eliminar de la base de datos:");
                        String ID = leer.next();
                        Cliente clienteEliminar = (Cliente) em.createQuery("SELECT c "
                                + "FROM Cliente c "
                                + "WHERE c.id =:id")
                                .setParameter("id", ID)
                                .getSingleResult();
                        String eliminado = clienteEliminar.getApellido();
                        em.getTransaction().begin();
                        em.remove(clienteEliminar);
                        em.getTransaction().commit();
                        System.out.println("El cliente " + eliminado + "  ha sido removida de la base de datos.");
                        break;
                    case 2:
                        System.out.println("Regresando al menu anterior ... ");
                        flag = true;
                        break;
                    default:
                        System.out.println("Opcion incorrecta, seleccione 1 o 2");
                }
            } while (flag != true);

        } catch (Exception e) {
            System.out.println("El libro seleccionado no se encuentra en la base de datos");
        }
    }

    public void modificarCliente() {

        boolean flag = false, flag2 = false;

        try {
            System.out.println("Ingrese el nombre del Cliente (o partes del mismo) para buscar:");
            String busqueda = leer.next();
            Collection<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c WHERE c.nombre LIKE :nombre")
                    .setParameter("nombre", "%" + busqueda + "%")
                    .getResultList();
            if (clientes.isEmpty()) {
                System.out.println("No se han encontrado coincidencias en su busqueda");
            } else {
                System.out.println("Se ah encontrado el siguiente resultado de su busqueda: '' " + busqueda + " '' ");
                for (Cliente aux : clientes) {
                    System.out.println("ID: " + aux.getId() + " : " + aux.getNombre() + " " + aux.getApellido());
                }
            }

            do {
                System.out.println("¿Desea Modificar un Cliente de la Base de Datos? \n"
                        + "1. Si \n"
                        + "2. Volver al Menu anterior");
                int opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Ingrese el ID del Cliente a Modificar de la base de datos:");
                        String ID = leer.next();
                        Cliente edit = (Cliente) em.createQuery("SELECT c "
                                + "FROM Cliente c "
                                + "WHERE c.id =:id")
                                .setParameter("id", ID)
                                .getSingleResult();

                        do {
                            System.out.println("Que desea modificar del cliente " + edit.getApellido() + " ?\n"
                                    + "1. Nombre \n"
                                    + "2. Apellido \n"
                                    + "3. DNI \n"
                                    + "4. Telefono \n"
                                    + "5. Salir");
                            int opc2 = leer.nextInt();
                            switch (opc2) {
                                case 1:
                                    System.out.print("Ingrese el nuevo nombre > ");
                                    edit.setNombre(leer.next());
                                    em.getTransaction().begin();
                                    em.persist(edit);
                                    em.getTransaction().commit();
                                    break;
                                case 2:
                                    System.out.print("Ingrese el nuevo apellido > ");
                                    edit.setApellido(leer.next());
                                    em.getTransaction().begin();
                                    em.persist(edit);
                                    em.getTransaction().commit();
                                    break;
                                case 3:
                                    System.out.print("Ingrese el DNI > ");
                                    Long dniaux = leer.nextLong();
                                    Collection<Cliente> clientess = em.createQuery("SELECT c FROM Cliente c WHERE c.dni LIKE :dni").setParameter("dni", dniaux).getResultList();
                                    if (clientess.isEmpty()) {
                                        edit.setDni(dniaux);
                                        em.getTransaction().begin();
                                        em.persist(edit);
                                        em.getTransaction().commit();
                                    } else {
                                        System.out.println("El DNI ingresado ya esta cargado en la Base de Datos");
                                    }
                                    break;
                                case 4:
                                    System.out.print("Ingrese le nuevo telefono > ");
                                    String telaux = leer.next();
                                    Collection<Cliente> clienteMod = em.createQuery("SELECT c FROM Cliente c WHERE c.telefono LIKE :telefono").setParameter("telefono", telaux).getResultList();
                                    if (clienteMod.isEmpty()) {
                                        edit.setTelefono(telaux);
                                        em.getTransaction().begin();
                                        em.persist(edit);
                                        em.getTransaction().commit();
                                    } else {
                                        System.out.println("El telefono ingresado ya esta cargado en la Base de Datos");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Regresando al menu anterior ... ");
                                    flag2 = true;
                                    break;
                                default:
                                    System.out.println("Opcion incorrecta, seleccione 1 o 5");
                            }

                        } while (flag2 != true);

                        break;
                    case 2:
                        System.out.println("Regresando al menu anterior ... ");
                        flag = true;
                        break;
                    default:
                        System.out.println("Opcion incorrecta, seleccione 1 o 2");
                }

            } while (flag != true);

        } catch (Exception e) {
            System.out.println("Error de Sistema");
        }
    }
}
