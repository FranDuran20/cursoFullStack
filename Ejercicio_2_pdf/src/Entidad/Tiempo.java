
package Entidad;

import java.util.Scanner;

public class Tiempo {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int hora, min, seg;

    public Tiempo() {
    }

    public Tiempo(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }
    
    public void ingresarHora(){
        
        do {            
            System.out.println("Ingrese una hora valida: (0 a 23 hs)");
            this.hora=leer.nextInt();
        } while (this.hora<0 || this.hora>23);
        
        do {            
             System.out.println("Ingrese los minutos: (0 a 59 min)");
             this.min=leer.nextInt();
        } while (this.min<0 || this.min>59);
        
        do {            
             System.out.println("Ingrese los segundos: (0 a 59 seg)");
             this.seg=leer.nextInt();
        } while (this.seg<0 || this.seg>59);      
    }
    
    public void mostrarHora(){
        System.out.println("Hora inicial ingresada:");
        System.out.println("[ "+this.hora+" : "+this.min+" : "+this.seg+" ]");        
    }
    
    public void delaySegundo(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){}
    }
    
    public void pasarTiempo(){
        for(int h=this.hora;h<24;h++){
            if(h==23){
                this.hora=00;
            }
            for(int m=this.min;m<60;m++){
                if(m==59){
                    this.min=00;
                }
                for(int s=this.seg;s<60;s++){                     
                    if(s==59){
                        this.seg=00;
                    }   
                    System.out.println("[ "+h+" : "+m+" : "+s+" ]");
                    delaySegundo();
                }
            }
        }
        
        
    }
}
