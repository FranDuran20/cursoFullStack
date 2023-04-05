
package Constructor;

public class Cuenta {
    
    private int numcuent;
    private long dni;
    private double saldoactua;

    public Cuenta() {
    }

    public Cuenta(int numcuent, long dni, double saldoactua) {
        this.numcuent = numcuent;
        this.dni = dni;
        this.saldoactua = saldoactua;
    }

    public int getNumcuent() {
        return numcuent;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldoactua() {
        return saldoactua;
    }

    public void setNumcuent(int numcuent) {
        this.numcuent = numcuent;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoactua(double saldoactua) {
        this.saldoactua = saldoactua;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numcuent=" + numcuent + ", dni=" + dni + ", saldoactua=" + saldoactua + '}';
    }

}
