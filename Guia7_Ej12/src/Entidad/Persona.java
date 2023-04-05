
package Entidad;

import java.util.Date;

public class Persona {
    
    private String nombre;
    private int dia;
    private int mes;
    private int anio;
    private Date fecha;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Persona() {
    }

    public Persona(String nombre, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
}
