
package Entidades;

 public final class Gato extends Animal {

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarce() {
        System.out.println(this.nombre);
        System.out.println("Se alimenta de > " + this.alimento);
        System.out.println("");
    }

}
