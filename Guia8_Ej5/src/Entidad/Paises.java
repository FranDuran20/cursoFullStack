
package Entidad;

import java.util.Comparator;

public class Paises {
    private String nompais;

    public Paises() {
    }

    public Paises(String nompais) {
        this.nompais = nompais;
    }

    public String getNompais() {
        return nompais;
    }

    public void setNompais(String nompais) {
        this.nompais = nompais;
    }

    @Override
    public String toString() {
        return " \n"
                + "** " + nompais + " **" +'}';
    }
    
     public static Comparator<Paises> compararNombre = (Paises p1, Paises p2) -> p1.getNompais().compareTo(p2.getNompais()) ;
}
