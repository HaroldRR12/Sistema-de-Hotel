

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
public class Adicionales implements Serializable {
    
    //Variables
     private String nombreAdicional;
     private int precioAdicional;
     private int id;
    
    //Constructor
     public Adicionales(String nombreAdicional, int precioAdicional, int id) {
        this.nombreAdicional = nombreAdicional;
        this.precioAdicional = precioAdicional;
        this.id = id;
    }
    
    
    //Getters And Setters 

    public String getNombreAdicional() {
        return nombreAdicional;
    }

    public void setNombreAdicional(String nombreAdicional) {
        this.nombreAdicional = nombreAdicional;
    }

    public int getPrecioAdicional() {
        return precioAdicional;
    }

    public void setPrecioAdicional(int precioAdicional) {
        this.precioAdicional = precioAdicional;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     //To string 

    @Override
    public String toString() {
        return "Adicionales{" + "nombreAdicional=" + nombreAdicional + ", precioAdicional=" + precioAdicional + ", id=" + id + '}';
    }
    

    

    
    
    
    
    

}
