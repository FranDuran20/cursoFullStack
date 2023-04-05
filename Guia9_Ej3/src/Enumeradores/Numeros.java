
package Enumeradores;

public enum Numeros {
    UNO(1, "Uno"), DOS(2,"Dos"), TRES(3,"Tres"), CUATRO(4,"Cuatro"), CINCO(5,"Cinco"), SEIS(6,"Seis"), SIETE(7,"Siete"), DIEZ(10,"Diez"), ONCE(11,"Once"), DOCE(12,"Doce)");
    public int valor;
    public String nombreOK;

    private Numeros() {
    }

    private Numeros(int valor, String nombreOK) {
        this.valor = valor;
        this.nombreOK = nombreOK;
    }

    public int getValor() {
        return valor;
    }

    public String getNombreOK() {
        return nombreOK;
    }
    
}
