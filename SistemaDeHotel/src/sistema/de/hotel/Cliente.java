/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.hotel;

import java.io.Serializable;


/**
 *
 * @author Stevef
 */
public class Cliente implements Serializable{


      //Variables
    private  int Cedula;
    private String nombre;
    private String email;
    private String Ingreso;
    private String alergias;
    private String medicamentos;
    

    // Constructor 

    public Cliente(int Cedula, String nombre, String email, String alergias, String medicamentos, String Ingreso) {
        this.Cedula = Cedula;
        this.nombre = nombre;
        this.email = email;
        this.alergias = alergias;
        this.medicamentos = medicamentos;
        this.Ingreso = Ingreso;
        
    }
  
    // Getters

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIngreso() {
        return Ingreso;
    }

    public void setIngreso(String Ingreso) {
        this.Ingreso = Ingreso;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    
  

    @Override
    public String toString() {
        return "Cliente{" + "Cedula=" + Cedula + ", nombre=" + nombre + ", email=" + email + ", Ingreso=" + Ingreso + ", alergias=" + alergias + ", medicamentos=" + medicamentos + '}';
    }

   
    
    
}