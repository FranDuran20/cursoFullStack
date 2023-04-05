package Libreria.Servicios;

import Libreria.Entidades.Autor;
import Libreria.Entidades.Editorial;
import Libreria.Entidades.Libro;
import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CRUD_Libro {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarLibro() {

        try {

            Libro lib = new Libro();
            System.out.print("Ingrese el titulo del libro > "); 
            String nombre = leer.next();
            Collection<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();
            if (libros.isEmpty()) {
                lib.setTitulo(nombre);
                lib.setAlta(true);
                System.out.print("Ingrese el ISBN del libro > ");
                lib.setISBN(leer.nextLong());
                System.out.print("Ingrese año de publicacion > ");
                lib.setAnio(leer.nextInt());
                System.out.print("Ingrese cantidad de ejemplares disponibles > ");
                lib.setEjemplares(leer.nextInt());
                lib.setEjemplaresPrestados(0);
                lib.setEjemplaresRestantes(lib.getEjemplares());
                lib.setAlta(true);
                System.out.println("El libro: " + nombre + " se ha cargado correctamente.");
            } else {
                System.out.println("El Libro ingresado: " + nombre + " ya se encuentra cargado en la Base de Datos");
            }
            //cargar autor
            System.out.println("");
            System.out.println("Elija el autor por su ID:");
            System.out.println("");
            Collection<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.alta = True").getResultList();
            for (Autor autor : autores) {
                System.out.println(autor.getId() + " - " + autor.getNombre());
            }
            System.out.println("");
            String ID = leer.next();
            Autor autorElejido = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id =:id")
                    .setParameter("id", ID)
                    .getSingleResult();
            lib.setAutor(autorElejido);

            //Cargar Editorial
            System.out.println("");
            System.out.println("Elija la Editorial por su ID:");
            System.out.println("");
            Collection<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e WHERE e.alta = True").getResultList();
            for (Editorial edit : editoriales) {
                System.out.println(edit.getId() + " - " + edit.getNombre());
            }
            System.out.println("");
            ID = leer.next();
            Editorial editElegida = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.id =:id")
                    .setParameter("id", ID)
                    .getSingleResult();
            lib.setEditorial(editElegida);

            em.getTransaction().begin();
            em.persist(lib);
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error de Sistema");
            System.out.println(e);
        }
    }

    public void eliminarLibro() {
        try {
            boolean flag = false;
            System.out.println("Listado de Libros dados de Baja: ");
            System.out.println("Si no encuentra el Libro que desea eliminar, posiblemente esta dado de Alta, primero realice la Baja del mismo...");
            System.out.println("");
            Collection<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.alta = False").getResultList();
            for (Libro edit : libros) {
                System.out.println(edit.getId() + " - " + edit.getTitulo());
            }
            do {
                System.out.println("¿Desea Eliminar un libro de la Base de Datos? \n"
                        + "1. Si \n"
                        + "2. Volver al Menu anterior");
                int opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Ingrese el ID del libro a eliminar de la base de datos:");
                        String ID = leer.next();
                        Libro libro1 = (Libro) em.createQuery("SELECT l "
                                + "FROM Libro l "
                                + "WHERE l.id =:id")
                                .setParameter("id", ID)
                                .getSingleResult();
                        String eliminado = libro1.getTitulo();
                        em.getTransaction().begin();
                        em.remove(libro1);
                        em.getTransaction().commit();
                        System.out.println("El libro " + eliminado + "  ha sido removida de la base de datos.");
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

    public void modificarLibro() {

        boolean flag = false;
        try {
            System.out.println("Seleccione el ID del Libro que desea Modificar: ");
            Collection<Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();
            for (Libro edit : libros) {
                System.out.println(edit.getId() + " - " + edit.getTitulo());
            }
            String ID = leer.next();
            Libro edit = (Libro) em.createQuery("SELECT l "
                    + "FROM Libro l "
                    + "WHERE l.id =:id")
                    .setParameter("id", ID)
                    .getSingleResult();
            do {
                System.out.println("¿Que desea Modificar del Libro: " + edit.getTitulo() + " ? \n"
                        + "1. Nombre \n"
                        + "2. Estado \n"
                        + "3. ISBN \n"
                        + "4. Año de Publicacion \n"
                        + "5. Autor \n"
                        + "6. Editorial \n"
                        + "7. Volver al Menu anterior");
                int opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        System.out.print("Ingrese el nuevo nombre >> ");
                        edit.setTitulo(leer.next());
                        System.out.println("Se actualizo satisfactoriamente el nombre a: " + edit.getTitulo());
                        em.getTransaction().begin();
                        em.merge(edit);
                        em.getTransaction().commit();
                        break;
                    case 2:
                        if (edit.isAlta() == false) {
                            System.out.println("El Libro se encontraba dada de Baja...");
                            edit.setAlta(true);
                            System.out.println("Se ah dado de ALTA el Libro: " + edit.getTitulo());
                            em.getTransaction().begin();
                            em.merge(edit);
                            em.getTransaction().commit();
                        } else {
                            System.out.println("El Libro se encontraba dada de Alta...");
                            edit.setAlta(false);
                            System.out.println("Se ah dado de BAJA el Libro: " + edit.getTitulo());
                            em.getTransaction().begin();
                            em.merge(edit);
                            em.getTransaction().commit();
                        }
                        break;
                    case 3:
                        System.out.println("ISBN actual: " + edit.getISBN());
                        System.out.print("Ingrese el nuevo ISBN >> ");
                        edit.setISBN(leer.nextLong());
                        System.out.println("");
                        System.out.println("ISBN actualizado correctamente a: " + edit.getISBN());
                        em.getTransaction().begin();
                        em.merge(edit);
                        em.getTransaction().commit();
                        break;
                    case 4:
                        System.out.println("Año de publicacion actual: " + edit.getAnio());
                        System.out.print("Ingrese el año de publicacion correcto >> ");
                        edit.setAnio(leer.nextInt());
                        System.out.println("");
                        System.out.println("Año de publicacion actualizado: " + edit.getAnio());
                        em.getTransaction().begin();
                        em.merge(edit);
                        em.getTransaction().commit();
                        break;
                    case 5:
                        System.out.println("El Autor actual es: " + edit.getAutor().getNombre());
                        System.out.println("");
                        System.out.println("Elija el nuevo autor por su ID:");
                        System.out.println("");
                        Collection<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.alta = True").getResultList();
                        for (Autor autor : autores) {
                            System.out.println(autor.getId() + " - " + autor.getNombre());
                        }
                        System.out.print(">> ");
                        ID = leer.next();
                        Autor autorElejido = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id =:id")
                                .setParameter("id", ID)
                                .getSingleResult();
                        edit.setAutor(autorElejido);

                        System.out.println("Se a actualizado satisfactoriamente el Autor del libro por: " + edit.getAutor().getNombre());
                        System.out.println("");

                        em.getTransaction().begin();
                        em.merge(edit);
                        em.getTransaction().commit();

                        break;
                    case 6:
                        System.out.println("La Editorial actual es: " + edit.getEditorial().getNombre());

                        System.out.println("");
                        System.out.println("Elija la nueva Editorial por su ID:");
                        System.out.println("");
                        Collection<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e WHERE e.alta = True").getResultList();

                        for (Editorial aux : editoriales) {
                            System.out.println(aux.getId() + " - " + aux.getNombre());
                        }

                        System.out.println("");
                        ID = leer.next();
                        Editorial editElegida = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.id =:id")
                                .setParameter("id", ID)
                                .getSingleResult();
                        edit.setEditorial(editElegida);

                        System.out.println("Se a actualizado satisfactoriamente la Editorial por: " + edit.getEditorial().getNombre());
                        System.out.println("");

                        em.getTransaction().begin();
                        em.persist(edit);
                        em.getTransaction().commit();

                        break;
                    case 7:
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

    public void buscarISBN() {

        try {
            System.out.println("Ingrese el ISBN del libro a buscar:");
            Long busqueda = leer.nextLong();
            Collection<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.ISBN = :isbn")
                    .setParameter("isbn", busqueda)
                    .getResultList();
            if (libros.isEmpty()) {
                System.out.println("No se han encontrado coincidencias en su busqueda");
            } else {
                System.out.println("Se ah encontrado el siguiente resultado de su busqueda: '' " + busqueda + " '' ");
                for (Libro aux : libros) {
                    System.out.println(aux.getISBN() + " - " + aux.getTitulo());
                }
            }
        } catch (Exception e) {
            System.out.println("Error de Sistema");
        }
    }

    public void buscarPorTitulo() {

        try {
            System.out.println("Ingrese el nombre del Titulo (o partes del mismo) para buscar libros:");
            String busqueda = leer.next();
            Collection<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo")
                    .setParameter("titulo", "%" + busqueda + "%")
                    .getResultList();

            if (libros.isEmpty()) {
                System.out.println("No se han encontrado coincidencias en su busqueda");
            } else {
                System.out.println("Se ah encontrado el siguiente resultado de su busqueda: '' " + busqueda + " '' ");
                for (Libro aux : libros) {
                    System.out.println("Titulo del Libro: " + aux.getTitulo());
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error de Sistema");
        }
    }

    public void buscarPorAutor() {

        try {
            System.out.println("Ingrese el nombre del Autor (o partes del mismo) para buscar libros:");
            String busqueda = leer.next();

//            Collection<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.autor = (SELECT a.id FROM Autor a WHERE a.nombre LIKE :nombre)")
//                    .setParameter("nombre", "%" + busqueda + "%")
//                    .getResultList();

            Collection<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre LIKE :nombre")
                    .setParameter("nombre", "%" + busqueda + "%")
                    .getResultList();

            if (libros.isEmpty()) {
                System.out.println("No se han encontrado coincidencias en su busqueda");
            } else {
                System.out.println("Se ah encontrado el siguiente resultado de su busqueda: '' " + busqueda + " '' ");
                for (Libro aux : libros) {
                    System.out.println(aux.getAutor().getNombre() + " - " + aux.getTitulo());
                }
            }
        } catch (Exception e) {
            System.out.println("Error de Sistema");
        }
    }

    public void buscarPorEditorial() {

        try {
            System.out.println("Ingrese el nombre de la Editorial (o partes del mismo) para buscar libros:");
            String busqueda = leer.next();
            Collection<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.editorial.nombre LIKE :nombre")
                    .setParameter("nombre", "%" + busqueda + "%")
                    .getResultList();

            if (libros.isEmpty()) {
                System.out.println("No se han encontrado coincidencias en su busqueda");
            } else {
                System.out.println("Se ah encontrado el siguiente resultado de su busqueda: '' " + busqueda + " '' ");
                for (Libro aux : libros) {
                    System.out.println(aux.getEditorial().getNombre() + " - " + aux.getTitulo());
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error de Sistema");
        }

    }
}
