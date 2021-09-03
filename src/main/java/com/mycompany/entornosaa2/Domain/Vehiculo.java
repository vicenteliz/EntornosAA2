package com.mycompany.entornosaa2.Domain;

/**
 *
 * @author Vicente
 */
public class Vehiculo {

    private int idVehiculo;
    private String color;
    private String matricula;
    private int caballos;
    private float longitud;

    public Vehiculo(int modelo, String color, String matricula, int caballos, float longitud) {
        this.idVehiculo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.caballos = caballos;
        this.longitud = longitud;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", color=" + color + ", matricula=" + matricula + ", caballos=" + caballos + ", longitud=" + longitud + '}';
    }

}
