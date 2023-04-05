/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.

En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package guia10_ej3extra;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Edificio;
import Entidades.Hotel4e;
import Entidades.Hotel5e;
import Entidades.Residencia;
import java.util.ArrayList;
import java.util.Scanner;

public class Guia10_Ej3Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Edificio> hoteles = new ArrayList();
        ArrayList<Alojamiento> alojamiento = new ArrayList();
        int opc, opc2, opc3;
        do {
            System.out.println("MENU INFORMACION TURISITICA MENDOZA \n"
                    + "Seleccione la opcion deseada.. \n"
                    + "1 - Ingresar nuevo Hotel \n"
                    + "2 - Ingresar nuevo Alojamiento \n"
                    + "3 - Salir \n");
            opc = leer.nextInt();
            System.out.println("");
            switch (opc) {
                case 1:
                    do {
                        System.out.println("Que tipo de Hotel desea cargar: \n"
                                + "1 - Cuatro Estrellas **** \n"
                                + "2 - Cinco Estrellas ***** \n");
                        opc2 = leer.nextInt();
                        switch (opc2) {
                            case 1:
                                Hotel4e cuatro = new Hotel4e();
                                System.out.println("Hotel 4 Estrellas");
                                System.out.println("");
                                cuatro.crearHotel();
                                System.out.println("");
                                System.out.println("Hotel 4 Estrellas");
                                cuatro.mostrarDatos();
                                hoteles.add(cuatro);
                                break;
                            case 2:

                                Hotel5e cinco = new Hotel5e();
                                cinco.crearHotel();
                                cinco.mostrarDatos();
                                hoteles.add(cinco);
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                                System.out.println("");
                        }
                    } while (opc2 != 1 && opc2 != 2);
                    break;
                case 2:
                    do {
                        System.out.println("Que tipo de Alojamiento desea cargar: \n"
                                + "1 - Camping\n"
                                + "2 - Residencia\n");
                        opc3 = leer.nextInt();
                        switch (opc3) {
                            case 1:
                                System.out.println("Camping");
                                Camping camp = new Camping();
                                camp.crearCamping();
                                camp.mostrarDatos();
                                alojamiento.add(camp);
                                break;
                            case 2:
                                System.out.println("Residencia");
                                Residencia res = new Residencia();
                                res.crearResidencia();
                                res.mostrarDatos();
                                alojamiento.add(res);
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                                System.out.println("");
                        }
                    } while (opc3 != 1 && opc3 != 2);
                    break;

                case 3:
                    System.out.println("Saliendo del Sistema...");
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
                    System.out.println("");
            }
        } while (opc != 3);

        /*
        Aca voy a crear el menu de usuario para ver alojamientos y demas
         */
        do {
            System.out.println("INFORMACION TURISTICA DE MENDOZA\n"
                    + "1 - Mostrar alojamientos Disponibles \n"
                    + "2 - Mostrar Hoteles disponibles \n"
                    + "3 - Campings con Proveeduria \n"
                    + "4 - Residencias con Descuento para Gremios \n"
                    + "5 - Salir");
            opc = leer.nextInt();
            System.out.println("");
            switch (opc) {
                case 1:
                    System.out.println("\n"
                            + "Alojamientos Disponibles: \n"
                            + "\n");
                    for (Alojamiento aux : alojamiento) {
                        if (aux instanceof Camping) {
                            Camping camp = (Camping) aux;
                            camp.mostrarDatos();
                        }
                        if (aux instanceof Residencia) {
                            Residencia res = (Residencia) aux;
                            res.mostrarDatos();
                        }
                    }
                    break;

                case 2:
                    
                    /*
                    Falta ordenar Array por precio para mostrar en pantalla luego                    
                    */
                    
                    System.out.println("\n"
                            + "Hoteles Disponibles: \n"
                            + "\n");
                    for (Edificio aux : hoteles) {
                        aux.mostrarDatos();
                    }
                    break;

                case 3:
                    System.out.println("\n"
                            + "Campings con Proveeduria disponibles:"
                            + "\n");
                    for (Alojamiento aux : alojamiento) {
                        if (aux instanceof Camping) {
                            Camping camp = (Camping) aux;
                            if (camp.isRest() == true) {
                                camp.mostrarDatos();
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n"
                            + "Residencias con descuento para Gremios disponibles\n"
                            + "\n");
                    for (Alojamiento aux : alojamiento) {
                        if (aux instanceof Residencia) {
                            Residencia res = (Residencia) aux;
                            if (res.isGremios() == true) {
                                res.mostrarDatos();
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("Hasta la proxima! Que siga disfrutando de Mendoza :D");
                    break;
                default:
                    System.out.println("Opcion seleccionada incorrecta!");
            }
            System.out.println("");
        } while (opc != 5);

    }

}
