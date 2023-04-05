
package Servicio;

import Entidad.Pass;
import java.util.Scanner;

public class ServicioPass {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pass crearPass() {
        Pass user = new Pass("Duran, Francisco", 37517900);
        System.out.println("Usuario: " + user.getNombre());
        System.out.println("DNI: " + user.getDni());
        System.out.println("Ingrese una nueva contraseña: ");
        user.setPass(leer.next());
        while (user.getPass().length() != 10) {
            System.out.println("La contraseña debe tener 10 caracteres, intente nuevamente");
            user.setPass(leer.next());
        }
        return user;
    }

    public void analizarPass(Pass user) {
        int z = 0, a = 0, tam;
        tam = user.getPass().length();
        for (int i = 0; i < tam; i++) {
            if ("z".equalsIgnoreCase(user.getPass().substring(i, i + 1))) {
                z++;
            }
            if ("a".equalsIgnoreCase(user.getPass().substring(i, i + 1))) {
                a++;
            }
        }
        if (z >= 1 && a >= 2) {
            System.out.println("Su contraseña es nivel ALTO");
        } else if (z >= 1 && a == 0) {
            System.out.println("Su contraseña es nivel MEDIO");
        } else {
            System.out.println("Su contraseña es nivel BAJO");
        }
        System.out.println("");
    }

    public void cambiarNombre(Pass user) {
        System.out.println("Ingrese nuevo nombre de usuario:");
        user.setNombre(leer.next());
        System.out.println("");
    }

    public void cambiarDNI(Pass user) {
        System.out.println("Ingrese nuevo DNI:");
        user.setDni(leer.nextInt());
        System.out.println("");
    }

    public void cambiarPass(Pass user) {
        System.out.println("Ingrese una nueva contraseña: ");
        user.setPass(leer.next());
        while (user.getPass().length() != 10) {
            System.out.println("La contraseña debe tener 10 caracteres, intente nuevamente");
            user.setPass(leer.next());
        }
        System.out.println("");
    }

    public void mostrarDatos(Pass user) {
        System.out.println("");
        System.out.println("Usuario: " + user.getNombre());
        System.out.println("DNI: " + user.getDni());
        System.out.println("");
    }

    public void Menu(Pass user) {
        int opc;
        String pass2;
        do {
            System.out.println("*** MENU  ***");
            System.out.println("");         
                System.out.println("1 - Analizar Contraseña \n"
                        + "2 - Modificar Contraseña \n"
                        + "3 - Modificar Usuario \n"
                        + "4 - Modificar DNI \n"
                        + "5 - Mostrar Datos \n"
                        + "6 - Salir"); 
          
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    analizarPass(user);
                    break;
                case 2:
                    System.out.println("Ingrese contraseña actual para proceder:");
                    pass2 = leer.next();
                    if (pass2.equals(user.getPass())) {
                        cambiarPass(user);
                    } else {
                        System.out.println("Contraseña incorrecta");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese contraseña actual para proceder:");
                    pass2 = leer.next();
                    if (pass2.equals(user.getPass())) {
                        cambiarNombre(user);
                    } else {
                        System.out.println("Contraseña incorrecta");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese contraseña actual para proceder:");
                    pass2 = leer.next();
                    if (pass2.equals(user.getPass())) {
                        cambiarDNI(user);
                    } else {
                        System.out.println("Contraseña incorrecta");
                    }
                    break;
                case 5:
                    mostrarDatos(user);
                    break;
                case 6:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opc != 6);
    }
}
