
package Servicio;

import Entidad.Triangulo;
import java.util.Scanner;

public class ServicioTriangulo {
    Scanner leer=new Scanner(System.in);
    
    public Triangulo crear(){
        Triangulo tri = new Triangulo();
        System.out.print("Ingrese la Base de su triangulo isoscele > ");
        tri.setLado(leer.nextInt());
        System.out.print("Ingrese los lados iguales de su triangulo isoscele > ");
        tri.setLadoigual(leer.nextInt());       
        return tri;
    }
    
    public void calcularArea(Triangulo tri){
         double h,x;
        x=tri.getLado()/2;
        h= Math.sqrt((tri.getLadoigual()*tri.getLadoigual())-(x*x));
        tri.setSuperficie((tri.getLado()*h)/2);     
    }
 
    public void calcularPerimetro(Triangulo tri){
        tri.setPerimetro(tri.getLado()+(2*tri.getLadoigual()));        
    }
    
    public void Mostrar(Triangulo tri){
        System.out.println("Area/Superficie del triangulo isosceles: "+tri.getSuperficie());
        System.out.println("Perimetro del triangulo isosceles: "+tri.getPerimetro());
    }
    
}
