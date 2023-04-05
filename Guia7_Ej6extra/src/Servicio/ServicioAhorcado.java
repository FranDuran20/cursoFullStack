
package Servicio;

import Entidad.Ahorcado;

import java.util.Scanner;

public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in);
    String[] vector = new String[0];
    String[] vectorAux = new String[0];

    public Ahorcado crearAhorcado() {
        Ahorcado ja = new Ahorcado();
        System.out.println("--* JUEGO DEL AHORCADO *--");
        System.out.println("Ingrese la palabra oculta a buscar en el juego: ");
        ja.setPalabra(leer.next());
        ja.setTam(ja.getPalabra().length());
        vector = new String[ja.getTam()];
        vectorAux = new String[ja.getTam()];
        ja.setVector(new String[ja.getTam()]);
        for (int i = 0; i < ja.getTam(); i++) {
            vector[i] = ja.getPalabra().substring(i, i + 1);
        }
        System.out.println("Ingrese la cantidad de intentos para encontrar la palabra: ");
        ja.setJugadas(leer.nextInt());
        ja.setVector(vector);
        for (int i = 0; i < ja.getTam(); i++) {
            vectorAux[i] = " - ";
        }
        ja.setAux(vectorAux);
        System.out.println("tamaño: "+ja.getTam());
        limpiarPantalla();
        return ja;
    }

    public void longitud(Ahorcado ja) {
        System.out.println("Cantidad de Letras de la palabra: " + ja.getTam());
    }

    public void buscarLetra(Ahorcado ja) {
        String letra;

        System.out.println("Ingrese la letra a buscar en la palabra: ");
        letra = leer.next();
        int cont = 0;
        for (int i = 0; i < ja.getTam(); i++) {
            if (letra.equalsIgnoreCase(ja.getVector()[i])) {
                cont++;
                vectorAux[i] = letra;
                ja.setAux(vectorAux);
            }
        }
        if (cont == 0) {
            System.out.println("Su letra: " + letra + " no esta en la palabra");
            ja.setJugadas(ja.getJugadas() - 1);
        } else {
            System.out.println("Su letra: " + letra + " se encuentra " + cont + " veces");
            ja.setLetrasEncontradas(ja.getLetrasEncontradas() + cont);
        }
    }

    public void encontradas(Ahorcado ja) {
        System.out.println("Letras encontradas por el momento: " + ja.getLetrasEncontradas());
        System.out.println("Letras faltantes: " + (ja.getTam() - ja.getLetrasEncontradas()));
        System.out.println("Tamaño palabra: "+ja.getTam());
    }

    public void intentos(Ahorcado ja) {
        System.out.println("Intentos restantes: " + ja.getJugadas());
    }

    public void mostrar(Ahorcado ja) {
        for (int i = 0; i < ja.getTam(); i++) {
            System.out.print("[" + ja.getAux()[i] + "] ");
        }
    }
    
    public void limpiarPantalla(){
        for (int i = 0; i < 35; i++) {
            for (int j = 0; j < 1; j++) {                
            }
            System.out.println("");
        }
    }

    public void juego(Ahorcado ja) {

        int opc;
  
        do {
            System.out.println("*** MENU AHORCADO ***");
            mostrar(ja);
            System.out.println("");
           
            do {                
                 System.out.println("1 - Buscar Letra \n"
                    + "2 - Letras encontradas \n"
                    + "3 - Intentos restantes");
            opc = leer.nextInt();
            } while (opc!=1&&opc!=2&&opc!=3);
           
            switch (opc) {
                case 1:
                    buscarLetra(ja);
                    break;
                case 2:
                    encontradas(ja);
                    break;
                case 3:
                    intentos(ja);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
            
            if (ja.getLetrasEncontradas()==ja.getTam()) {
                System.out.println("Felicidades gano el juego del Ahorcado!!");
                System.out.println("La palabra fue: "+ja.getPalabra());
            } 
            
            if (ja.getJugadas()==0&&ja.getLetrasEncontradas()!=ja.getTam()) {
                System.out.println("No logro encontrar la palabra del Ahorcado, ah perdido!");
                System.out.println("La palabra era: "+ja.getPalabra());
                
            }
            
            
        } while ((ja.getJugadas() != 0) &&(ja.getLetrasEncontradas()!=ja.getTam() ));
    }
}
