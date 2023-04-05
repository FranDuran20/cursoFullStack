
package Entidad;

public class Ahorcado {
    
    private int jugadas, letrasEncontradas, tam;
    private String palabra;
    private String[] vector=new String[tam];
    private String[] aux = new String[tam];

    public String[] getAux() {
        return aux;
    }

    public void setAux(String[] aux) {
        this.aux = aux;
    }
  
    public Ahorcado() {
    }

    public Ahorcado(int jugadas, int letrasEncontradas, int tam, String palabra) {
        this.jugadas = jugadas;
        this.letrasEncontradas = letrasEncontradas;
        this.tam = tam;
        this.palabra = palabra;
    }

    public int getJugadas() {
        return jugadas;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getTam() {
        return tam;
    }

    public String getPalabra() {
        return palabra;
    }

    public String[] getVector() {
        return vector;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

}
