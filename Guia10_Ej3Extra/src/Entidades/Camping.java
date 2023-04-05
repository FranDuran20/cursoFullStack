package Entidades;

/**
 * Hijo de alojamiento
 */
final public class Camping extends Alojamiento {

    private int capacidad, baños;
    private boolean rest = false;

    public Camping() {
    }

    public Camping(int capacidad, int baños, boolean privado, int m2, String nombre) {
        super(privado, m2, nombre);
        this.capacidad = capacidad;
        this.baños = baños;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public boolean isRest() {
        return rest;
    }

    public void setRest(boolean rest) {
        this.rest = rest;
    }

    public void crearCamping() {
        System.out.println("Cargar nuevo Camping");
        super.crearAlojamiento();
        System.out.print("Indique la capacidad maxima de carpas > ");
        this.capacidad = leer.nextInt();
        System.out.print("Indique cantidad maximas de baños disponibles > ");
        this.baños = leer.nextInt();
        String opc;
        do {
            System.out.println("¿El camping posee Restaurant / Proveeduria? (S)i / (N)o");
            opc = leer.next();
        } while (!"s".equalsIgnoreCase(opc) && !"n".equalsIgnoreCase(opc));
        if ("s".equalsIgnoreCase(opc)) {
            this.rest = true;
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("");
        System.out.println("Camping:");
        super.mostrarDatos();
        System.out.println("Capacidad maxima de carpas: " + this.capacidad);
        if (this.rest == true) {
            System.out.println("El alojamiento posee Restaurant / Proveeduria: SI");
        } else {
            System.out.println("El alojamiento posee Restaurant / Proveeduria: NO");
        }
        System.out.println("Baños disponibles en el camping: " + this.baños);
        System.out.println("");
    }

}
