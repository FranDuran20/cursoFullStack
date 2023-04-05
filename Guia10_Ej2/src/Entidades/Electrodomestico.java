/*


*/
package Entidades;

import java.util.Scanner;

public  class Electrodomestico {
    protected int preciofinal;
    protected String color;
    protected char energ;
    protected int peso;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char energ, int peso) {
        this.preciofinal = precio;
        this.color = color;
        this.energ = energ;
        this.peso = peso;
    }

    public int getPrecio() {
        return preciofinal;
    }

    public void setPrecio(int precio) {
        this.preciofinal = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getEnerg() {
        return energ;
    }

    public void setEnerg(char energ) {
        this.energ = energ;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

   
    
    public char comprobarConsumo(char energ){
      
        if (energ=='a'||energ=='A'||energ=='b'||energ=='B'||energ=='c'||energ=='C'||energ=='d'||energ=='D'||energ=='e'||energ=='E'||energ=='f'||energ=='F') {
            this.energ=energ;
        } else {
            this.energ='F';
            System.out.println("El consumo ingresado no esta disponible, por defecto el mismo es F");
            System.out.println("");
        }        
        return this.energ;
    };
    
      public String comprobarColor(String color){
      
        if ("blanco".equalsIgnoreCase(color) || "negro".equalsIgnoreCase(color) || "rojo".equalsIgnoreCase(color) || "azul".equalsIgnoreCase(color) || "gris".equalsIgnoreCase(color) ) {
          this.color=color;
        } else {
            this.color = "Blanco";
            System.out.println("El color ingresado no esta disponible, por defecto se le entregara un electrodomestico de color BLACO");
            System.out.println("");
        }        
        return this.color;
    };     
      
      public void crearElectrodomestico(){        
          
          this.preciofinal=1000;
          System.out.print("Indique el Color del electrodomestico > ");
          this.color=leer.next();
          comprobarColor(this.color);
          System.out.print("Indique el consumo energetico del mismo (A-B-C-D-E-F) > ");
          this.energ=leer.next().charAt(0);          
          comprobarConsumo(this.energ);
          System.out.print("Indique el Peso del electrodomestigo (en Kg) > ");
          this.peso=leer.nextInt();          
      }
      
    public Electrodomestico precioFinal(Electrodomestico e) {
        int preciofinal=e.preciofinal;
        char energia=e.getEnerg();
        int peso=e.getPeso();
        switch (energia) {
            case 'A':
            case 'a':
                preciofinal=preciofinal+1000;
                break;
            case 'B':
            case 'b':
                preciofinal=preciofinal+800;
                break;
            case 'C':
            case 'c':
                preciofinal=preciofinal+600;
                break;
            case 'D':
            case 'd':
                preciofinal=preciofinal+500;
                break;
            case 'E':
            case 'e':
                preciofinal=preciofinal+300;
                break;
            case 'F':
            case 'f':
                preciofinal=preciofinal+100;
                break;
        }
        
        if (peso <=19) {
            preciofinal=preciofinal+100;
        }     
        
        if (peso>=20 && peso<=49) {
            preciofinal=preciofinal+500;
        }
        
        if (peso>=50 && peso<=79) {
            preciofinal=preciofinal+800;
        }
        
        if (peso>=80) {
            preciofinal=preciofinal+1000;
        }
        e.setPrecio(preciofinal);
     return e;
    }
    
    public void mostrarDatos(){
        System.out.println("Color: "+this.color);
        System.out.println("Peso: "+this.peso);
        System.out.println("Consumo Energetico: "+this.energ);
        System.out.println("Precio: "+this.preciofinal);    
    }
    
    
}
