package Libreria.Servicios;

import Libreria.Entidades.Editorial;
import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CRUD_Editorial {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarEditorial() {

        try {

            Editorial edi = new Editorial();
            System.out.print("Ingrese el nombre de la Editorial > ");
            String nombre = leer.next();
            Collection<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();
            if (editoriales.isEmpty()) {
                edi.setNombre(nombre);
                edi.setAlta(true);
                System.out.println("Editorial: "+nombre+" cargada correctamente.");
                em.getTransaction().begin();
                em.persist(edi);
                em.getTransaction().commit();
            } else {
                System.out.println("La editorial ingresada: "+nombre+" ya se encuentra cargado en la Base de Datos");
            }           

        } catch (Exception e) {
            System.out.println("Error de Sistema");
            System.out.println(e);
        }
    }

    public void eliminarEditorial() {
        try {
            boolean flag = false;
            System.out.println("Listado de Editoriales dados de Baja: ");
            System.out.println("Si no encuentra la Editorial que desea eliminar, posiblemente este dado de Alta, primero realice la Baja del mismo...");
            System.out.println("");
            Collection<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e WHERE e.alta = False").getResultList();
            for (Editorial edit : editoriales) {
                System.out.println(edit.getId() + " - " + edit.getNombre());
            }
            do {
                System.out.println("¿Desea Eliminar una Editorial de la Base de Datos? \n"
                        + "1. Si \n"
                        + "2. Volver al Menu anterior");
                int opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Ingrese la Editorial a eliminar de la base de datos por ID:");
                        String ID = leer.next();
                        Editorial edit = (Editorial) em.createQuery("SELECT e "
                                + "FROM Editorial e "
                                + "WHERE e.id =:id")
                                .setParameter("id", ID)
                                .getSingleResult();
                        String eliminado = edit.getNombre();
                        em.getTransaction().begin();
                        em.remove(edit);
                        em.getTransaction().commit();
                        System.out.println("La editorial " + eliminado + "  ha sido removida de la base de datos.");
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
            System.out.println("La Editorial seleccionada no se encuentra en la base de datos");
        }
    }

    public void modificarEditorial() {

        boolean flag = false;
        try {
            System.out.println("Seleccione el ID de la Editorial que desea Modificar: ");
            Collection<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e").getResultList();
            for (Editorial edit : editoriales) {
                System.out.println(edit.getId() + " - " + edit.getNombre());
            }
            String ID = leer.next();
            Editorial edit = (Editorial) em.createQuery("SELECT e "
                    + "FROM Editorial e "
                    + "WHERE e.id =:id")
                    .setParameter("id", ID)
                    .getSingleResult();
            do {
                System.out.println("¿Que desea Modificar de la Editorial: " + edit.getNombre() + " ? \n"
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
                            System.out.println("La editorial se encontraba dada de Baja...");
                            edit.setAlta(true);
                            System.out.println("Se ah dado de ALTA la Editorial: " + edit.getNombre());
                            em.getTransaction().begin();
                            em.merge(edit);
                            em.getTransaction().commit();
                        } else {
                            System.out.println("La editorial se encontraba dada de Alta...");
                            edit.setAlta(false);
                            System.out.println("Se ah dado de BAJA la Editorial: " + edit.getNombre());
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
}
