package Entidades;

/**
 * Hijo de Hotel y nieto de Edificio
 */
public class Hotel4e extends Hotel {

    protected String gym, nomRestaurant;
    protected int capacidadRest;

    public Hotel4e() {
    }

    public Hotel4e(String gym, String nomRestaurant, int capacidadRest, int habitaciones, int pisos, int camas, int precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(habitaciones, pisos, camas, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.gym = gym;
        this.nomRestaurant = nomRestaurant;
        this.capacidadRest = capacidadRest;
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public String getNomRestaurant() {
        return nomRestaurant;
    }

    public void setNomRestaurant(String nomRestaurant) {
        this.nomRestaurant = nomRestaurant;
    }

    public int getCapacidadRest() {
        return capacidadRest;
    }

    public void setCapacidadRest(int capacidadRest) {
        this.capacidadRest = capacidadRest;
    }

    @Override
    public void crearHotel() {
        super.crearHotel();
        do {
            System.out.println("El Gimnacio es Tipo (A) o Tipo (B)");
            this.gym = leer.next();
        } while (!"A".equalsIgnoreCase(this.gym) && !"B".equalsIgnoreCase(this.gym));
        System.out.println("Ingrese el Nombre del Restaurant:");
        this.nomRestaurant = leer.next();
        System.out.println("Ingrese la Capacidad del Restaurant:");
        this.capacidadRest = leer.nextInt();
        precioHabitacion();
    }

    @Override
    public void precioHabitacion() {
        super.precioHabitacion();
        this.precioHabitaciones = this.precioHabitaciones + valorRestaurant() + valorGym();
    }

    public int valorRestaurant() {
        int x = 0;
        if (this.capacidadRest < 30) {
            x = 10;
        }
        if (this.capacidadRest >= 30 && this.capacidadRest <= 50) {
            x = 30;
        }
        if (this.capacidadRest > 50) {
            x = 50;
        }
        return x;
    }

    public int valorGym() {
        int x = 0;
        if ("a".equalsIgnoreCase(this.gym)) {
            x = 50;
        }
        if ("b".equalsIgnoreCase(this.gym)) {
            x = 30;
        }
        return x;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("");
        super.mostrarDatos();
        System.out.println("Tipo de Gimnacio: " + this.gym);
        System.out.println("Nombre de Restaurant: " + this.nomRestaurant);
        System.out.println("Capacidad del Restaurant: " + this.capacidadRest);
        System.out.println("Precio por Habitacion: $" + this.precioHabitaciones);
        System.out.println("");
    }

}
