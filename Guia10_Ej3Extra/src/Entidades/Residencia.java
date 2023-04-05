package Entidades;

/**
 * Hijo de alojamiento
 */
final public class Residencia extends Alojamiento {

    private int hab;
    private boolean gremios = false, campdeport = false;

    public Residencia() {
    }

    public Residencia(int hab, boolean gremios, boolean campdeport, boolean privado, int m2, String nombre) {
        super(privado, m2, nombre);
        this.hab = hab;
        this.gremios = gremios;
        this.campdeport = campdeport;
    }

    public int getHab() {
        return hab;
    }

    public void setHab(int hab) {
        this.hab = hab;
    }

    public boolean isGremios() {
        return gremios;
    }

    public void setGremios(boolean gremios) {
        this.gremios = gremios;
    }

    public boolean isCampdeport() {
        return campdeport;
    }

    public void setCampdeport(boolean campdeport) {
        this.campdeport = campdeport;
    }

    public void crearResidencia() {
        System.out.println("Cargar nueva Residencia");
        super.crearAlojamiento();
        System.out.print("Indique la cantidad maxima de habitaciones disponibles > ");
        this.hab = leer.nextInt();
        String opc;
        do {
            System.out.println("¿En la residencia " + this.nombre + " se aplica descuento a gremios? (S)i / (N)o");
            opc = leer.next();
        } while (!"s".equalsIgnoreCase(opc) && !"n".equalsIgnoreCase(opc));
        if ("s".equalsIgnoreCase(opc)) {
            this.gremios = true;
        }

        do {
            System.out.println("¿La residencia " + this.nombre + " posee Campo Deportivo? (S)i / (N)o");
            opc = leer.next();
        } while (!"s".equalsIgnoreCase(opc) && !"n".equalsIgnoreCase(opc));
        if ("s".equalsIgnoreCase(opc)) {
            this.campdeport = true;
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("");
        System.out.println("Residencia:");
        super.mostrarDatos();
        System.out.println("Cantidad maxima de habitaciones disponibles: " + this.hab);
        if (this.gremios == true) {
            System.out.println("Aplica descuento a los gremios: SI");
        } else {
            System.out.println("Aplica descuento a los gremios: NO");
        }

        if (this.campdeport == true) {
            System.out.println("Posee Campo Deportivo: SI");
        } else {
            System.out.println("Posee Campo Deportivo: NO");
        }
        System.out.println("");
    }

}
