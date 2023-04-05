package Servicios;

import Entidades.Armadura;
import Entidades.Bota;
import Entidades.Casco;
import Entidades.Guante;
import java.util.Scanner;

public class ServicioArmadura {

    Armadura arm = new Armadura();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearIronMan() {
        Bota b1 = new Bota();
        Bota b2 = new Bota();
        Guante g1 = new Guante();
        Guante g2 = new Guante();
        Casco cas = new Casco();
        arm.setB1(b1);
        arm.setB2(b2);
        arm.setC(cas);
        arm.setG1(g1);
        arm.setG2(g2);
        bateria();
    }

    public void caminar() {
        int horas;
        System.out.println("Indique distancia a caminar: ");
        horas = leer.nextInt();
        arm.setEnergiaTotal(arm.getEnergiaTotal() - (arm.getB1().getConsumoCamina() * 2 * horas));
        bateria();
    }
    
    public void correr() {
        int horas;
        System.out.println("Indique distancia a correr: ");
        horas = leer.nextInt();
        arm.setEnergiaTotal(arm.getEnergiaTotal() - ((arm.getB1().getConsumoCamina() * 2 * horas))*2);
        bateria();
    }
    
    public void propulsarse() {       
        System.out.println("Propulsando el traje... indique distancia de propulcion: ");
        int horas=leer.nextInt();
        arm.setEnergiaTotal(arm.getEnergiaTotal()-((arm.getB1().getConsumoVuela()*2)*3)*horas );
        bateria();
    }
    
    public void volar() {       
        System.out.println("Inicio de vuelo");
        int energBotas=(arm.getB1().getConsumoVuela()*3)*2;
        int energGuantes= (arm.getG1().getConsumoVuela()*2)*2;
        arm.setEnergiaTotal(arm.getEnergiaTotal()-(energBotas+energGuantes));
        bateria();
    }
    
     public void ataque() {       
        System.out.println("Modo ataque activado... comenzando ataque");        
        arm.setEnergiaTotal(arm.getEnergiaTotal()-(arm.getG1().getConsumoAtaque()*3)*2);
        bateria();
    }
     
      public void escribir() {     
        arm.setEnergiaTotal(arm.getEnergiaTotal()-arm.getC().getConsumoEscribir());
        bateria();
    }

    public void bateria() {
        arm.setBateria((arm.getEnergiaTotal() * 100) / 1000000);
        // System.out.println(arm.getBateria()+"%");       
    }
    
    public void estadoBateria(){
        System.out.println("Bateria actual al: "+arm.getBateria()+"%");
    }

    public void sufriendoDano(){
        
        
        
    }
    
    public void mostrarIronMan(){
        System.out.println("Integridad de la Armadura: ");
        System.out.println("");
        System.out.println(arm.toString());      
    }

}
