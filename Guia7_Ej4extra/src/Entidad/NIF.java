
package Entidad;

public class NIF {
    private int DNI;
    private String letra;
    private int resto;

    public int getResto() {
        return resto;
    }

    public void setResto(int resto) {
        this.resto = resto;
    }
    
    public NIF() {
    }

    public NIF(int DNI, String letra, int resto) {
        this.DNI = DNI;
        this.letra = letra;
        this.resto = resto;
    }

    public int getDNI() {
        return DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
        
}
