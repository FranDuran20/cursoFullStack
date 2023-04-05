package Entidades;

final public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, char energ, int peso) {
        super(precio, color, energ, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora() {
        Lavadora lav = new Lavadora();
        System.out.println("Crear Electrodomestico: Lavadora");
        lav.crearElectrodomestico();
        System.out.print("Indica la carga de la Lavadora > ");
        lav.setCarga(leer.nextInt());
        return lav;
    }

    public Lavadora precioFinal(Lavadora e) {
        super.precioFinal(e);
     
        if (e.getCarga() >= 30) {
            e.setPrecio(e.getPrecio() + 500);
        }
        return e;
    }

    @Override
    public void mostrarDatos() {
       System.out.println("");
        System.out.println("LAVADORA");
        System.out.println("Color: " + this.color);
        System.out.println("Peso: " + this.peso);
        System.out.println("Consumo Energetico: " + this.energ);
        System.out.println("Carga " + this.carga);        
        System.out.println("PRECIO FINAL: " + this.preciofinal);
        System.out.println("");
    }
}
