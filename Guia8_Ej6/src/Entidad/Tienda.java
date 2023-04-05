
package Entidad;

import java.util.Comparator;

public class Tienda {
    private String producto;
    private Integer valor;

    public Tienda() {
    }

    public Tienda(String producto, Integer valor) {
        this.producto = producto;
        this.valor = valor;
    }

    public String getProducto() {
        return producto;
    }

    public Integer getValor() {
        return valor;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Producto: " + producto + "\n"
                + "Valor: $" + valor + "\n"
                + "";
    }
    //No hace falta el Comparator, ya que los TreeMap se ordenan por si solos
    // public static Comparator<Tienda> compararProducto = (Tienda p1, Tienda p2) -> p1.getProducto().compareTo(p2.getProducto());
}
