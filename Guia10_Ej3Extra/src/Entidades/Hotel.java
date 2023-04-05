package Entidades;

/**
 * Sera hijo de Edificio
 *
 *  * El precio de una habitación debe calcularse de acuerdo con la siguiente
 * fórmula: PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor
 * agregado por restaurante) + (valor agregado por gimnasio) + (valor agregado
 * por limosinas). Donde: Valor agregado por el restaurante: • $10 si la
 * capacidad del restaurante es de menos de 30 personas. • $30 si está entre 30
 * y 50 personas. • $50 si es mayor de 50. Valor agregado por el gimnasio: • $50
 * si el tipo del gimnasio es A. • $30 si el tipo del gimnasio es B. Valor
 * agregado por las limosinas: • $15 por la cantidad de limosinas del hotel.
 */
abstract public class Hotel extends Edificio {

    protected int habitaciones, pisos, camas, precioHabitaciones;

    public Hotel() {
    }

    public Hotel(int habitaciones, int pisos, int camas, int precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.pisos = pisos;
        this.camas = camas;
        this.precioHabitaciones = precioHabitaciones;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(int precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    public void crearHotel() {
        crearEdificio();
        System.out.println("Cantidad de habitaciones disponibles: ");
        this.habitaciones = leer.nextInt();
        System.out.println("Cantidad de Pisos:");
        this.pisos = leer.nextInt();
        System.out.println("Cantidad de camas: ");
        this.camas = leer.nextInt();
    }

    public void precioHabitacion() {
        precioHabitaciones = 50 + this.habitaciones;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Habitaciones Disponibles: " + this.habitaciones);
        System.out.println("Camas Disponibles: " + this.camas);
        System.out.println("Total de Pisos: " + this.pisos);
    }

}
