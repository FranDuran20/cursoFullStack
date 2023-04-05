package Entidades;

final public class Hotel5e extends Hotel4e {

    private int suit, salonconf, limosinas;

    public Hotel5e() {
    }

    public Hotel5e(int suit, int salonconf, int limosinas, String gym, String nomRestaurant, int capacidadRest, int habitaciones, int pisos, int camas, int precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(gym, nomRestaurant, capacidadRest, habitaciones, pisos, camas, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.suit = suit;
        this.salonconf = salonconf;
        this.limosinas = limosinas;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getSalonconf() {
        return salonconf;
    }

    public void setSalonconf(int salonconf) {
        this.salonconf = salonconf;
    }

    public int getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(int limosinas) {
        this.limosinas = limosinas;
    }

    @Override
    public void crearHotel() {
        System.out.println("HOTEL 5 ESTRELLAS ***** ");
        super.crearHotel();
        System.out.println("Indique la cantidad de Suits del Hotel: ");
        this.suit = leer.nextInt();
        System.out.println("Indique la cantidad de Salas de Conferencia del Hotel:");
        this.salonconf = leer.nextInt();
        System.out.println("Indique la cantidad de limosinas disponibles:");
        this.limosinas = leer.nextInt();
        precioHabitacion();
    }

    @Override
    public void precioHabitacion() {
        super.precioHabitacion();
        this.precioHabitaciones = this.precioHabitaciones + (15 * this.limosinas);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("");
        System.out.println("Hotel 5 estrellas ***** ");
        super.mostrarDatos();
        System.out.println("Cantidad de Suits disponibles: " + this.suit);
        System.out.println("Cantidad de Salas de Conferencia: " + this.salonconf);
        System.out.println("Cantidad de Limosinas disponibles: " + this.limosinas);
        System.out.println("Precio por Habitacion: $" + this.precioHabitaciones);
        System.out.println("");
    }

}
