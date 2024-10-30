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
    
    private int numH;
    private boolean ocupado;
    private int tipoDeH;

    public Habitaciones(int numH, boolean ocupado, int tipoDeH) {
        this.numH = numH;
        this.ocupado = ocupado;
        this.tipoDeH = tipoDeH;
    }

    public int getNumH() {
        return numH;
    }

    public void setNumH(int numH) {
        this.numH = numH;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Habitaciones{" + "numH=" + numH + ", ocupado=" + ocupado + '}';
    }

    int getidCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
