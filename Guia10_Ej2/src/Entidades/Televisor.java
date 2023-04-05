package Entidades;

final public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean tdt;   

    public Televisor() {
    }

    public Televisor(int resolucion, boolean tdt, int precio, String color, char energ, int peso) {
        super(precio, color, energ, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public Televisor crearTelevisor() {
        Televisor tele = new Televisor();
        int opc;
        System.out.println("Crear Electrodomestico: Televisor");
        tele.crearElectrodomestico();
        System.out.print("Indica la resolucion (en pulgadas del TV > ");
        tele.setResolucion(leer.nextInt());

        do {
            System.out.println("El TV posee sintonizador TDT? 1 - SI // 2 - NO");
            opc = leer.nextInt();
        } while (opc != 1 && opc != 2);

        if (opc == 1) {
            tele.setTdt(true);
        } else {
            tele.setTdt(false);
        }
        return tele;
    }

    public Televisor precioFinal(Televisor e) {
        super.precioFinal(e);
        if (e.getResolucion() >= 40) {
            e.setPrecio(e.getPrecio() + ((30 * e.getPrecio()) / 100));
        }

        if (e.isTdt() == true) {
            e.setPrecio(e.getPrecio() + 500);
        }
        return e;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("");
        System.out.println("TELEVISOR");        
        System.out.println("Color: " + this.color);
        System.out.println("Peso: " + this.peso);
        System.out.println("Consumo Energetico: " + this.energ);
        System.out.println("Pulgadas: " + this.resolucion);
        if (this.tdt == true) {
            System.out.println("Sintonizador TDT: SI");
        }else{
           System.out.println("Sintonizador TDT: NO"); 
        }        
        System.out.println("PRECIO FINAL: " + this.preciofinal);
        System.out.println("");
    }
}
