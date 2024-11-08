/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.hotel;

import java.io.Serializable;

/**
 *
 * @author harold
 */
public class Habitaciones implements Serializable{
    
    private int numH;
    private String ocupado;
    private String tipoDeH;
    private int precio;

    public Habitaciones(int numH, String ocupado, String tipoDeH, int precio) {
        this.numH = numH;
        this.ocupado = ocupado;
        this.tipoDeH = tipoDeH;
        this.precio = precio;
    }

    public int getNumH() {
        return numH;
    }

    public void setNumH(int numH) {
        this.numH = numH;
    }

    public String getOcupado() {
        return ocupado;
    }

    public void setOcupado(String ocupado) {
        this.ocupado = ocupado;
    }

    public String getTipoDeH() {
        return tipoDeH;
    }

    public void setTipoDeH(String tipoDeH) {
        this.tipoDeH = tipoDeH;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Habitaciones{" + "numH=" + numH + ", ocupado=" + ocupado + ", tipoDeH=" + tipoDeH + ", precio=" + precio + '}';
    }
}
