
package Servicios;

import Constructor.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {
    
    public Rectangulo CrearRectangulo(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Rectangulo rec = new Rectangulo();
        System.out.println("Ingrese la Base del rectangulo:");
        rec.setBase(leer.nextInt());
        System.out.println("Ingrese la Altura del rectangulo:");
        rec.setAltura(leer.nextInt());
        return rec;
    }
    
    public void Superficie(Rectangulo rec){
        System.out.println("La Superficie de su rectangulo es: "+ (rec.getBase()*rec.getAltura()));
      }
    
    public void Perimetro(Rectangulo rec){
        System.out.println("El Perimetro de su rectangulo es: "+ ((rec.getBase()+rec.getAltura())*2));
      }
    
    public void Dibujar(Rectangulo rec){
        for (int f = 1; f <= rec.getAltura(); f++) {
            for (int c = 1; c <= rec.getBase(); c++) {
                if (f==1||f==rec.getAltura()||c==1||c==rec.getBase()) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }   
            }
            System.out.println("");
        }
      }
    
}
