package Entidades;

public class Revolver {

    private int posAct;
    private int posAgu;

    public Revolver() {
    }

    public Revolver(int posAct, int posAgu) {
        this.posAct = posAct;
        this.posAgu = posAgu;
    }

    public int getPosAct() {
        return posAct;
    }

    public int getPosAgu() {
        return posAgu;
    }

    public void setPosAct(int posAct) {
        this.posAct = posAct;
    }

    public void setPosAgu(int posAgu) {
        this.posAgu = posAgu;
    }

}
