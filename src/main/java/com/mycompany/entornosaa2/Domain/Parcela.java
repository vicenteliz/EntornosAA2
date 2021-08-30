
package com.mycompany.entornosaa2.Domain;


public class Parcela {
    
    int idParcela;
    String ciudad;
    String camping;
    int clase;
    float longitud;

    public Parcela(int idParcela, String ciudad, String camping, int clase, float longitud) {
        this.idParcela = idParcela;
        this.ciudad = ciudad;
        this.camping = camping;
        this.clase = clase;
        this.longitud = longitud;
    }

    public int getIdParcela() {
        return idParcela;
    }

    public void setIdParcela(int idParcela) {
        this.idParcela = idParcela;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCamping() {
        return camping;
    }

    public void setCamping(String camping) {
        this.camping = camping;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Parcela{" + "idParcela=" + idParcela + ", ciudad=" + ciudad + ", camping=" + camping + ", clase=" + clase + ", longitud=" + longitud + '}';
    }
    
    

  
}
