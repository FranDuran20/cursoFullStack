
package Entidades;

public class Polideportivo extends Edificio {
    private String nombre;
    private String tipo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipo, int ancho, int largo, int alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Polideportivo crearPolideportivo(){
        Polideportivo poli = new Polideportivo();
        int opc;
        System.out.println("Nuevo Polideportivo");
        System.out.print("Ingrese el Nombre del mismo > ");
        poli.setNombre(leer.next());
        System.out.println("El Polideportivo: ''"+poli.getNombre()+"'' sera \n"
                + "1 - Techado \n"
                + "2 - Abierto" );        
        do {            
            opc=leer.nextInt();
            if (opc==1) {
                poli.setTipo("Techado");
            }else if(opc==2){
                poli.setTipo("Abierto");
            }else{
                System.out.println("Opcion incorrecta, seleccione: \n"
                        + "1 - Techado \n"
                        + "2 - Abierto");
            }
        } while (opc!=1 && opc !=2);
        poli.crearEdificio();        
        return poli;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("");
        System.out.println("Nombre Polideportivo: "+this.nombre);
        System.out.println("Tipo: "+this.tipo);
        super.mostrarDatos();
        System.out.println("");
    }    
    
    @Override
    public void calcularSuperficie() {
        System.out.println("La Superficie del Polideportivo: "+this.nombre +" es : "+this.ancho*this.largo+" m2");        
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del Polideportivo: "+this.nombre +" es : "+this.ancho*this.largo*this.alto+" m3"); 
    }
}
