
package Entidades;

public class Jugador {
     private String nombre;
    private String num;
    private String pos;

    public Jugador() {
    }

    public Jugador(String nombre, String num, String pos) {
        this.nombre = nombre;
        this.num = num;
        this.pos = pos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNum() {
        return num;
    }

    public String getPos() {
        return pos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "Jugador{" + "Nombre=" + nombre + ", Numero=" + num + ", Posicion=" + pos + '}';
    }
}
