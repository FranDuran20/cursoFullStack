
package Entidad;

import java.util.Comparator;

public class Pelicula {
    private String titulo, dir;
    private Integer time;

    public Pelicula() {
    }

    public Pelicula(String titulo, String dir, Integer time) {
        this.titulo = titulo;
        this.dir = dir;
        this.time = time;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDir() {
        return dir;
    }

    public Integer getTime() {
        return time;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "*** Peliculas en Cartelera: *** \n"
                + "Titulo: " + titulo + "\n"
                + "Director: " + dir + "\n"
                + "Duracion: " + time + "\n"
                + "\n"
                + "";
    }
    
    public static Comparator<Pelicula> compararTitulo = (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareTo(p2.getTitulo());
    public static Comparator<Pelicula> compararDirector = (Pelicula p1, Pelicula p2) -> p1.getDir().compareTo(p2.getDir());
    public static Comparator<Pelicula> compararDurDes = (Pelicula p1, Pelicula p2) -> p2.getTime().compareTo(p1.getTime());
    public static Comparator<Pelicula> compararDurAsen = (Pelicula p1, Pelicula p2) -> p1.getTime().compareTo(p2.getTime());
}
