
package Servicios;

import Constructor.Cuenta;
import java.util.Scanner;

public class ServicioCuenta {

    public Cuenta CrearCuenta(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cuenta c1 = new Cuenta();
        System.out.println("Ingrese su numero de cuenta: ");
        c1.setNumcuent(leer.nextInt());
        System.out.println("Ingrese su DNI:");
        c1.setDni(leer.nextLong());
        System.out.println("Ingrese su saldo actual:");
        c1.setSaldoactua(leer.nextDouble());
        return c1;       
    }
    
    public void ingresar(Cuenta c1){        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿Cuanto dinero desea ingresar?");
        double ingreso=leer.nextDouble();
        c1.setSaldoactua(c1.getSaldoactua()+ingreso);
        System.out.println("Su saldo actual luego del deposito de: $"+ingreso+" es: $"+c1.getSaldoactua());
    }
    
    public void retirar(Cuenta c1){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿Cuanto dinero desea ingresar?");
        double retiro=leer.nextDouble();
        if (retiro>c1.getSaldoactua()) {
            System.out.println("No posee $"+retiro+" en su cuenta, el saldo pasa a $0");
            c1.setSaldoactua(0);
        } else {
            c1.setSaldoactua(c1.getSaldoactua()-retiro);
            System.out.println("A retirado: $"+retiro+". Quedando en su cuenta: $"+c1.getSaldoactua());
        }
    }
    
    public void retiroRapido(Cuenta c1){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Retiro Rapido - Solo podra extrar un 20% de su saldo");
        System.out.println("¿Cuanto desea retirar?");
        double retiro=leer.nextDouble();
        
        if (retiro<(c1.getSaldoactua()*0.2)) {
            c1.setSaldoactua(c1.getSaldoactua()-retiro);
            System.out.println("A retirado: $"+retiro+". El saldo actual es: $"+c1.getSaldoactua());
        } else {
            System.out.println("La suma: $"+retiro+" supera el 20% de su saldo: $"+c1.getSaldoactua());
            System.out.println("Extraccion no realizada");
        }
    }
    
    public void consultarSaldo(Cuenta c1){
        System.out.println("Su saldo actual es: $"+c1.getSaldoactua());
    }
    
    public void consultarDatos(Cuenta c1){
        System.out.println("Los datos de su cuenta son: ");
        System.out.println(c1.toString());
    }
    
    public void menu(Cuenta c1){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioCuenta cuenta1 = new ServicioCuenta();
            
        int opc;   
        do {            
        System.out.println("MENU");
        System.out.println("Seleccione la opcion deseada:");
        System.out.println("1 - Ingresar Dinero");
        System.out.println("2 - Retirar Dinero");
        System.out.println("3 - Extraccion Rapida");
        System.out.println("4 - Consultar Saldo");
        System.out.println("5 - Consultar Datos");
        System.out.println("6 - SALIR");   
        opc=leer.nextInt();
        switch(opc){
            case 1:
                cuenta1.ingresar(c1);
                break;
            case 2:
                cuenta1.retirar(c1);
                break;
            case 3:
                cuenta1.retiroRapido(c1);
                break;
            case 4:
                cuenta1.consultarSaldo(c1);
                break;
            case 5:
                cuenta1.consultarDatos(c1);
                break;
            case 6:
                System.out.println("Hasta la proxima");
                break;
            default:
                System.out.println("Opcion Incorrecta");
                break;            
        }      
        } while (opc!=6);
    }
}
