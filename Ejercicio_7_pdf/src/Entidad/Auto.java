
package Entidad;

import java.util.Date;


public class Auto {
    
    private String dueno,color,modelo;
    private double km=7500;    
    private int anio,mes,dia;
    private Date vencimiento=new Date(anio,mes,dia);

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public Auto() {
    }

    public Auto(String dueno, String color, String modelo, Date vencimiento, int anio, int mes, int dia) {
        this.dueno = dueno;
        this.color = color;
        this.modelo = modelo;
        this.vencimiento = vencimiento;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getDueno() {
        return dueno;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public double getKm() {
        return km;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setKm(double km) {
        this.km = km;
    }

}
