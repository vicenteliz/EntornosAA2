
package com.mycompany.entornosaa2.Domain;

/**
 *
 * @author Vicente
 */
public class Piso {
    
   private int idPiso;
   private String ciudad;
   private String direccion;
   private int fechaConstruccion;
   private float precioDia;

    public Piso(int idPiso, String ciudad, String direccion, int fechaConstruccion, float precioDia) {
        this.idPiso = idPiso;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.fechaConstruccion = fechaConstruccion;
        this.precioDia = precioDia;
    }

    public int getIdPiso() {
        return idPiso;
    }

    public void setIdPiso(int idPiso) {
        this.idPiso = idPiso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(int fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public float getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(float precioDia) {
        this.precioDia = precioDia;
    }

    @Override
    public String toString() {
        return "Piso{" + "idPiso=" + idPiso + ", ciudad=" + ciudad + ", direccion=" + direccion + ", fechaConstruccion=" + fechaConstruccion + ", precioDia=" + precioDia + '}';
    }
    
    

}