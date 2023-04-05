package Principal;

import Entidades.Fabricante;
import Entidades.Producto;
import java.util.Collection;
import java.util.Random;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Guia14_tiendaPU");
        EntityManager em = emf.createEntityManager();
        /*
        try {
            
            //Creo Fabricantes:
            
            Fabricante fab1 = new Fabricante();
            fab1.setId(UUID.randomUUID().toString());
            fab1.setCodigo(random.nextInt(100));
            fab1.setNombre("Samsung");
            
            em.getTransaction().begin();
            em.persist(fab1);
            em.getTransaction().commit();
            
            Fabricante fab2 = new Fabricante();
            fab2.setId(UUID.randomUUID().toString());
            fab2.setCodigo(random.nextInt(100));
            fab2.setNombre("Lenovo");
            
            em.getTransaction().begin();
            em.persist(fab2);
            em.getTransaction().commit();
            
            // Creo Productos
            
            Producto prod1 = new Producto();
            prod1.setId(UUID.randomUUID().toString());
            prod1.setCodigo(random.nextInt(100));
            prod1.setNombre("Monitor 24'' ");
            prod1.setPrecio(random.nextInt(8500));
            prod1.setFabricante(fab2);
            
            em.getTransaction().begin();
            em.persist(prod1);
            em.getTransaction().commit();
            
            Producto prod2 = new Producto();
            prod2.setId(UUID.randomUUID().toString());
            prod2.setCodigo(random.nextInt(100));
            prod2.setNombre("Teclado Gamer");
            prod2.setPrecio(random.nextInt(8500));
            prod2.setFabricante(fab2);
            
            em.getTransaction().begin();
            em.persist(prod2);
            em.getTransaction().commit();
            
            Producto prod3 = new Producto();
            prod3.setId(UUID.randomUUID().toString());
            prod3.setCodigo(random.nextInt(100));
            prod3.setNombre("Smartphone S23 Plus");
            prod3.setPrecio(random.nextInt(8500));
            prod3.setFabricante(fab1);
            
            em.getTransaction().begin();
            em.persist(prod3);
            em.getTransaction().commit();
            
            Producto prod4 = new Producto();
            prod4.setId(UUID.randomUUID().toString());
            prod4.setCodigo(random.nextInt(100));
            prod4.setNombre("TV 55'' Full HD");
            prod4.setPrecio(random.nextInt(8500));
            prod4.setFabricante(fab1);
            
            em.getTransaction().begin();
            em.persist(prod4);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println("Error de Sistema");
            System.out.println(e);
        }
        
         */

        //  ******* BUSQUEDAS *********
        //Buscar Fabricante por criterio (Codigo)
        int codigo = 22;
        Fabricante fab1 = (Fabricante) em.createQuery("SELECT f "
                + "FROM Fabricante f "
                + "WHERE f.codigo = :codigo")
                .setParameter("codigo", codigo)
                .getSingleResult();

        System.out.println(fab1.getNombre());

        //Buascar por ID
        Fabricante fab2 = em.find(Fabricante.class, fab1.getId());
        System.out.println(fab2.getNombre());

        //Listar todos los fabricantes
        System.out.println("");
        System.out.println("Listamos todos los Fabricantes:");
        Collection<Fabricante> listado = em.createQuery("SELECT f "
                + "FROM Fabricante f ")
                .getResultList();

        System.out.println("Codigo" + "\t" + "Nombre");
        listado.forEach((f) -> {
            System.out.println(f.getCodigo() + "\t" + f.getNombre());
        });

        //Buscamos un producto
        System.out.println("");
        System.out.println("Busqueda por producto: ");
        Producto prod = (Producto) em.createQuery("SELECT p "
                + "FROM Producto p "
                + "WHERE p.codigo = :codigo")
                .setParameter("codigo", 47)
                .getSingleResult();

        System.out.println("Codigo: " + prod.getCodigo());
        System.out.println("Nombre: " + prod.getNombre());
        System.out.println("Precio: $" + prod.getPrecio());
        System.out.println("Fabricante: " + prod.getFabricante().getNombre());

        //Busqueda de producto innexistente
        System.out.println("");
        System.out.println("Producto innexistente: ");
        try {
            Producto prod2 = (Producto) em.createQuery("SELECT p "
                    + "FROM Producto p "
                    + "WHERE p.codigo = :codigo")
                    .setParameter("codigo", 526)
                    .getSingleResult();
        } catch (NoResultException e) {
            //System.out.println(e);
            System.out.println("No se encontro el producto en la Base de Datos");
        }

        //  ******* MODIFICAR *********
        try {
            //Primero busco el codigo del fabricante que quiera modificar
            int coodigo = 83;
            Fabricante fabaux = (Fabricante) em.createQuery("SELECT f "
                    + "FROM Fabricante f "
                    + "WHERE f.codigo = :codigo")
                    .setParameter("codigo", coodigo)
                    .getSingleResult();
            //Ahora modifico el nombre
            fabaux.setNombre("XIAOMI");

            em.getTransaction().begin();
            em.merge(fabaux);
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error de Sistema");

        }

        // ********* ELIMINAR ********
        try {
            //Primero busco el elemento que quiera eliminar
            System.out.println("");
            System.out.println("Eliminar Fabricante");
            Fabricante fabaux2 = (Fabricante) em.createQuery("SELECT f "
                    + "FROM Fabricante f "
                    + "WHERE f.codigo = :codigo")
                    .setParameter("codigo", 9)
                    .getSingleResult();

            //Ahora elimino el fabricante          
            em.getTransaction().begin();
            em.remove(fabaux2);
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("El fabricante buscado no esta en la BD");
        }

    }
}
