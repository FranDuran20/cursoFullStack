
package Servicios;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumno> creaAlumno() {
        ArrayList<Alumno> lista = new ArrayList();

        String opc;
        leer = new Scanner(System.in).useDelimiter("\n");
        do {
            Alumno nuevoAlumno = new Alumno();
            System.out.println("Ingrese el nombre del alumno:");
            nuevoAlumno.setNombre(leer.next());
            System.out.println("Ingrese la nota 1:");
            nuevoAlumno.getNotas().add(leer.nextInt());
            System.out.println("Ingrese la nota 2:");
            nuevoAlumno.getNotas().add(leer.nextInt());
            System.out.println("Ingrese la nota 3:");
            nuevoAlumno.getNotas().add(leer.nextInt());
            lista.add(nuevoAlumno);
            System.out.println("¿Desea agregar otro alumno? (S/N)");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("s"));
        return lista;
    }

//    //Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
////Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
////final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
////del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
////promedio final, devuelto por el método y mostrado en el main.
////package Servicios;
/////
//    
    public double calcularNota(ArrayList<Alumno> Lista) {
        Double notaFinal = 0.0;
        Double sumaNotas = 0.0;
        Double cantNotas = 0.0;
        int auxi=1;
        System.out.println("CALCULO DE NOTA FINAL");
        System.out.println("Ingrese el nombre del alumno a calcular:");
        String alumno = leer.next();
        Iterator<Alumno> itA = Lista.iterator();
        while (itA.hasNext()) {
            if (itA.next().getNombre().equalsIgnoreCase(alumno)) {
                auxi=0;               
                Iterator<Integer> it2 = itA.next().getNotas().iterator();
                while (it2.hasNext()) {
                    sumaNotas = sumaNotas + it2.next();
                    cantNotas++;
                }
                notaFinal = sumaNotas / cantNotas;
            } 
        }
        if (auxi==1) {
            System.out.println("No se encuentra el alumno");
        }
        return notaFinal;
    }
}
    

