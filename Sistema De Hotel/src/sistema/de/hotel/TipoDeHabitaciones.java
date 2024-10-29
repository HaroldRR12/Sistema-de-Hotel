/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.hotel;

/**
 *
 * @author harold
 */
public class TipoDeHabitaciones {
    
    private int precio;
    private String tipoHabitacion;
    private int id;

    public TipoDeHabitaciones(int precio, String tipoHabitacion, int id) {
        this.precio = precio;
        this.tipoHabitacion = tipoHabitacion;
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "TipoDeHabitaciones{" + "precio=" + precio + ", tipoHabitacion=" + tipoHabitacion + ", id" + id + '}';
    }
    
    
    
}
