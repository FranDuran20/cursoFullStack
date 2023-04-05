
package Constructor;

public class Cafetera {
    private double capMax;
    private double capActu;

    public Cafetera() {
    }

    public Cafetera(double capMax, double capActu) {
        this.capMax = capMax;
        this.capActu = capActu;
    }

    public double getCapMax() {
        return capMax;
    }

    public double getCapActu() {
        return capActu;
    }

    public void setCapMax(double capMax) {
        this.capMax = capMax;
    }

    public void setCapActu(double capActu) {
        this.capActu = capActu;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capMax=" + capMax + ", capActu=" + capActu + '}';
    }

}
