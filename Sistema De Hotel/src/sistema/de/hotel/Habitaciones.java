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
    private int ocupado;

    public Habitaciones(int numH, int ocupado) {
        this.numH = numH;
        this.ocupado = ocupado;
    }

    public int getNumH() {
        return numH;
    }

    public void setNumH(int numH) {
        this.numH = numH;
    }

    public int getOcupado() {
        return ocupado;
    }

    public void setOcupado(int ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Habitaciones{" + "numH=" + numH + ", ocupado=" + ocupado + '}';
    }
    
    
}
