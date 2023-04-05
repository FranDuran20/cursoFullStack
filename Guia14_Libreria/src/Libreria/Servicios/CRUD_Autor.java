package Libreria.Servicios;

import Libreria.Entidades.Autor;
import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CRUD_Autor {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarAutor() {

        try {

            Autor aut = new Autor();
            System.out.print("Ingrese el nombre del Autor > ");
            String nombre = leer.next();
            Collection<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();
            if (autores.isEmpty()) {
                aut.setNombre(nombre);
                aut.setAlta(true);
                System.out.println("Autor: "+nombre+" cargado correctamente.");
                em.getTransaction().begin();
                em.persist(aut);
                em.getTransaction().commit();
            } else {
                System.out.println("El Autor ingresado: "+nombre+" ya se encuentra cargado en la Base de Datos");
            }
        } catch (Exception e) {
            System.out.println("Error de Sistema");
            System.out.println(e);
        }
    }

    public void eliminarAutor() {
        try {
            boolean flag = false;
            System.out.println("Listado de Autores dados de Baja: ");
            System.out.println("Si no encuentra el Autor que desea eliminar, posiblemente este dado de Alta, primero realice la Baja del mismo...");
            System.out.println("");
            Collection<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.alta = False").getResultList();
            for (Autor edit : autores) {
                System.out.println(edit.getId() + " - " + edit.getNombre());
            }

            do {
                System.out.println("¿Desea Eliminar un Autor de la Base de Datos? \n"
                        + "1. Si \n"
                        + "2. Volver al Menu anterior");
                int opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Seleccione el Autor a eliminar por ID: ");
                        String ID = leer.next();
                        Autor autorElejido = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id =:id")
                                .setParameter("id", ID)
                                .getSingleResult();
                        String eliminado = autorElejido.getNombre();
                        em.getTransaction().begin();
                        em.remove(autorElejido);
                        em.getTransaction().commit();
                        System.out.println("El Autor " + eliminado + "  ha sido removido de la base de datos.");
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
            System.out.println("El Autor seleccionado no se encuentra en la base de datos");
        }
    }

    public void modificarAutor() {

        boolean flag = false;
        try {
            System.out.println("Seleccione el ID del Autor que desea Modificar: ");
            Collection<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
            for (Autor edit : autores) {
                System.out.println(edit.getId() + " - " + edit.getNombre());
            }
            String ID = leer.next();
            Autor edit = (Autor) em.createQuery("SELECT a "
                    + "FROM Autor a "
                    + "WHERE a.id =:id")
                    .setParameter("id", ID)
                    .getSingleResult();
            do {
                System.out.println("¿Que desea Modificar del Autor: " + edit.getNombre() + " ? \n"
                        + "1. Nombre \n"
                        + "2. Estado \n"
                        + "3. Volver al Menu anterior");
                int opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        System.out.print("Ingrese el nuevo nombre >> ");
                        edit.setNombre(leer.next());
                        System.out.println("Se actualizo satisfactoriamente el nombre a: " + edit.getNombre());
                        em.getTransaction().begin();
                        em.merge(edit);
                        em.getTransaction().commit();
                        break;
                    case 2:
                        if (edit.isAlta() == false) {
                            System.out.println("El Autor se encontraba dada de Baja...");
                            edit.setAlta(true);
                            System.out.println("Se ha dado de ALTA el Autor: " + edit.getNombre());
                            em.getTransaction().begin();
                            em.merge(edit);
                            em.getTransaction().commit();
                        } else {
                            System.out.println("El Autor se encontraba dada de Alta...");
                            edit.setAlta(false);
                            System.out.println("Se ha dado de BAJA el Autor: " + edit.getNombre());
                            em.getTransaction().begin();
                            em.merge(edit);
                            em.getTransaction().commit();
                        }

                        break;
                    case 3:
                        System.out.println("Volviendo al menu anterior");
                        flag = true;
                        break;
                    default:
                        System.out.println("Opcion seleccionada incorrecta, seleccione 1, 2 o 3");
                }
            } while (flag != true);

        } catch (Exception e) {
            System.out.println("Error de Sistema");
        }
    }

    public void buscarAutor() {
        try {
            System.out.println("Ingrese un nombre de Autor para verificar si se encuentra en la Base de Datos");
            String nombre = leer.next();
            Collection<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre")
                    .setParameter("nombre", "%" + nombre + "%")
                    .getResultList();
            System.out.println("Se ah encontrado el siguiente resultado de su busqueda: '' " + nombre + " '' ");
            for (Autor edit : autores) {
                System.out.println(edit.getId() + " - " + edit.getNombre());
            }
        } catch (Exception e) {
            System.out.println("No se han encontrado coincidencias en su busqueda");
        }

    }
}
