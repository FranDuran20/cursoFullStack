package Entidades;

public class Jugador {

    private int id;
    private String nom;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String nom, boolean mojado) {
        this.id = id;
        this.nom = nom;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nom=" + nom + ", mojado=" + mojado + '}';
    }

}
