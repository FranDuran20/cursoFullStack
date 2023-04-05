
package Entidades;

public class EdOficinas extends Edificio {
    private int cantOfi;
    private int persXof;
    private int cantPisos;
    private String nombre;
    
    public EdOficinas() {
    }

    public EdOficinas(int cantOfi, int persXof, int cantPisos, String nombre, int ancho, int largo, int alto) {
        super(ancho, largo, alto);
        this.cantOfi = cantOfi;
        this.persXof = persXof;
        this.cantPisos = cantPisos;
        this.nombre = nombre;
    }

    public int getCantOfi() {
        return cantOfi;
    }

    public void setCantOfi(int cantOfi) {
        this.cantOfi = cantOfi;
    }

    public int getPersXof() {
        return persXof;
    }

    public void setPersXof(int persXof) {
        this.persXof = persXof;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EdOficinas crearEdificioOficina(){
        EdOficinas eo = new EdOficinas();
        System.out.println("Nuevo Edificio de Oficinas");
        System.out.print("Ingrese el Nombre del mismo > ");
        eo.setNombre(leer.next());
        System.out.println("¿Cuantas Personas ingresan por oficina en el Edificio" + this.nombre + " ?");
        eo.setPersXof(leer.nextInt());
        // this.persXof = leer.nextInt();
        System.out.println("¿Cuantos Pisos tiene el Edificio?");
        eo.setCantPisos(leer.nextInt());
        // this.cantPisos = leer.nextInt();
        eo.crearEdificio();  
        //eo.cantidadPersonas();
        return eo;
    }

    public void cantidadPersonas() {
        int emplPiso;
        int emplTotal = 0;        
        System.out.println("EDIFICIO: "+this.nombre);
        for (int i = 1; i <= this.cantPisos; i++) {
            System.out.print("Cuantas Oficinas tiene el Piso N°" + i + " > " );
            this.cantOfi = leer.nextInt();
            emplPiso = this.cantOfi * this.persXof;
            emplTotal = emplTotal + emplPiso;
            System.out.println("");
            System.out.println("El Piso N°" + i + " tiene " + this.cantOfi + " oficinas, y un total de " + emplPiso + " empleados");
            System.out.println("");
        }
        System.out.println("");
        System.out.println("El Edificio de Oficinas: " + this.nombre + " tiene en Total:");
        System.out.println(this.cantPisos + " Pisos");
        System.out.println("Y un total de: " + emplTotal + " Empleados trabajando");

    }

    @Override
    public void mostrarDatos() {
        System.out.println("");
        System.out.println("Nombre Edificio de Oficinas: "+this.nombre);
        super.mostrarDatos(); 
        System.out.println("");
    }    
    
    @Override
    public void calcularSuperficie() {
         System.out.println("La Superficie del Edificio de Oficinas: "+this.nombre +" es : "+this.ancho*this.largo+" m2"); 
    }

    @Override
    public void calcularVolumen() {
       System.out.println("El volumen del Edificio de Oficinas: "+this.nombre +" es : "+this.ancho*this.largo*this.alto+" m3"); 
    }
}
