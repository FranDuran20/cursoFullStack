
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

public class ServicioCadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearFrase() {
        Cadena frase = new Cadena();
        System.out.println("Ingrese una frase: ");
        frase.setFrase(leer.next());
        frase.setLongitud(frase.getFrase().length());
        return frase;
    }

    /**
      Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
     * @param frase 
     */
    public void mostrarVocales(Cadena frase) {
         int vocal=0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            
            if ("a".equalsIgnoreCase(frase.getFrase().substring(i, i+1))||"e".equalsIgnoreCase(frase.getFrase().substring(i,i+1))||"i".equalsIgnoreCase(frase.getFrase().substring(i,i+1))||"o".equalsIgnoreCase(frase.getFrase().substring(i,i+1))||"u".equalsIgnoreCase(frase.getFrase().substring(i,i+1))) {
                vocal++;
            }
        }
        System.out.println("Su frase tiene: "+vocal+" vocales");
    }

    public void invertirFrase(Cadena frase) {

        System.out.println("Su frase invertida es: ");
        for (int i = (frase.getLongitud()-1); i >= 0; i--) {
            System.out.print(frase.getFrase().substring(i, i+1));
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena frase) {
        String carac;
         int cont=0;        
        do {            
            System.out.println("Que caracter desea buscar en su frase?");
        carac=leer.next();
        } while (carac.length()!=1);

         for (int i = 0; i < frase.getLongitud(); i++) {            
            if (carac.equalsIgnoreCase(frase.getFrase().substring(i, i+1))) {
                cont++;
            }
        }         
         System.out.println("FRASE: "+frase.getFrase());
         if (cont==0) {
             System.out.println("El caracter: "+carac+" no se encuentra en la frase");
        } else {
              System.out.println("El caracter: "+carac+" se encuentra: "+cont+" veces");
        }        
    }

    public void reemplazar(Cadena frase) {
            String carac,nuevafrase;           
        do {            
            System.out.println("Que caracter desea para reemplazar las letras 'a' de su frase?");
             carac=leer.next();
        } while (carac.length()!=1);    
        nuevafrase=frase.getFrase().replace("a", carac).replace("A", carac);     
        System.out.println("Su frase quedo de la siguiente manera:");
        System.out.println(nuevafrase);
    }

    public void contiene(Cadena frase) {
        String carac;
        boolean verif=false;    
        do {            
            System.out.println("Que caracter desea buscar en su frase?");
        carac=leer.next();
        } while (carac.length()!=1);

         for (int i = 0; i < frase.getLongitud(); i++) {            
            if (carac.equalsIgnoreCase(frase.getFrase().substring(i, i+1))) {
                verif=true;
            }
        }         
         System.out.println("FRASE: "+frase.getFrase());
         if (verif==false) {
             System.out.println("El caracter: "+carac+" no se encuentra en la frase");
        } else {
              System.out.println("El caracter: "+carac+" se encuentra en la frase");
        }        
    }
    
    public void compararLong(Cadena frase) {
        Scanner leer2 = new Scanner(System.in).useDelimiter("\n");
        String newFra;
        int long2;
        System.out.println("Ingrese una nueva Frase:");
        System.out.println("");
        newFra = leer2.nextLine();
        long2 = newFra.length();
        System.out.println("");
        if (long2 == frase.getLongitud()) {
            System.out.println("La longitud de ambas frases es igual: " + long2);
        } else {
            System.out.println("La longitud de ambas frases es diferente");
            System.out.println("Su frase originales es: " + frase.getFrase());
            System.out.println("Longitud frase original: " + frase.getLongitud());
            System.out.println("La longitud de su nueva frase es: " + long2);
        }
    }

     public void unirFrases(Cadena frase) {
         Scanner leer3 = new Scanner(System.in).useDelimiter("\n");
        String newFra;
        System.out.println("Ingrese una nueva Frase:");
        newFra = leer3.nextLine();
        System.out.println("");       
        String superFrase = newFra.concat(frase.getFrase());
         System.out.println("Frases unidas:");
         System.out.println(superFrase);
    }
}
