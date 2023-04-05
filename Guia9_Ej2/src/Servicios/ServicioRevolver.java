package Servicios;

import Entidades.Revolver;

public class ServicioRevolver {

    public Revolver llenarRevolver() {
        Revolver r = new Revolver();
        r.setPosAgu((int) (Math.random() * 6) + 1);
        //  System.out.println("Posicion Agua: " + r.getPosAgu());
        r.setPosAct((int) (Math.random() * 6) + 1);
        //   System.out.println("Posicion del tambor: " + r.getPosAct());
        return r;
    }

    public Revolver recargarRevolver(Revolver r) {
        r.setPosAgu((int) (Math.random() * 6) + 1);
        return r;
    }

    public boolean mojar(Revolver r) {
        boolean mojado = false;
        if (r.getPosAct() == r.getPosAgu()) {
            mojado = true;
            System.out.println("MOJADO");
        } else {
            System.out.println("NO MOJADO");
        }
        return mojado;
    }

    public Revolver siguienteChorro(Revolver r) {
        r.setPosAct((r.getPosAct() + 1));
        if (r.getPosAct() >= 7) {
            r.setPosAct(1);
        }
        //    System.out.println("POSICION ACTUALIZADA: " + r.getPosAct());
        return r;
    }

    public void mostrarRevolver(Revolver r) {
        System.out.println("Posicion del TAMBOR actual: " + r.getPosAct());
        System.out.println("Posicion de la bala con Agua: " + r.getPosAgu());
    }
}
