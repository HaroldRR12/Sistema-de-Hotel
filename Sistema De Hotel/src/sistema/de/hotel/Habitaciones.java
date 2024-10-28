/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.hotel;

/**
 *
 * @author harold
 */
public class Habitaciones {
    
    private int idTipoH;
    private int numH;
    private int ocupado;

    public Habitaciones(int idTipoH, int numH, int ocupado) {
        this.idTipoH = idTipoH;
        this.numH = numH;
        this.ocupado = ocupado;
    }
    
    public int getIdTipoH() {
        return idTipoH;
    }

    public void setIdTipoH(int idTipoH) {
        this.idTipoH = idTipoH;
    }

    public int getOcupado() {
        return ocupado;
    }

    public void setOcupado(int ocupado) {
        this.ocupado = ocupado;
    }

    public int getNumH() {
        return numH;
    }

    public void setNumH(int numH) {
        this.numH = numH;
    }

    @Override
    public String toString() {
        return "Habitaciones{" + "idTipoH=" + idTipoH + ", numH=" + numH + ", ocupado=" + ocupado + '}';
    }

    
    
    
}
