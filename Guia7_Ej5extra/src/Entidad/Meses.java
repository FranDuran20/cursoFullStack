
package Entidad;

public class Meses {
    private String vectorMeses[]=new String [12];
    private String mesSecreto;
    private String buscar;

    public Meses() {
    }

    public Meses(String mesSecreto, String buscar) {
        this.mesSecreto = mesSecreto;
        this.buscar = buscar;
    }

    public String[] getVectorMeses() {
        return vectorMeses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public String getBuscar() {
        return buscar;
    }

    public void setVectorMeses(String[] vectorMeses) {
        this.vectorMeses = vectorMeses;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }

}
