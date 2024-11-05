/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.hotel;

import java.io.Serializable;

/**
 *
 * @author otoniel
 */
public class Aditional implements Serializable {
    //Constructor
    public Aditional(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = (int) Math.random();
    }
    
    
    //Atributos
    private String nombre;
    private int precio;
    private int id;
    
    // Getters and Setters 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getPrecio() {
    return precio; 
    }
    
    //To string 

    @Override
    public String toString() {
        return "Aditional{" + "nombre=" + nombre + ", id=" + id + '}';
    }
    
    
}
