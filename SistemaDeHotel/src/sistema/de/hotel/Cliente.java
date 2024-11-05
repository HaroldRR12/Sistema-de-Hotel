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
    private String Nacimiento;
    private String alergias;
    private String medicamentos;
    

    // Constructor 

    public Cliente(int Cedula, String nombre, String email, String alergias, String medicamentos, String Nacimiento) {
        this.Cedula = Cedula;
        this.nombre = nombre;
        this.email = email;
        this.alergias = alergias;
        this.medicamentos = medicamentos;
        this.Nacimiento = Nacimiento;
        
    }
  
    // Getters
    
    
    public int getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getAlergias() {
        return alergias;
    }
    
     public String getMedicamentos() {
        return medicamentos;
    }

     
    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Cedula=" + Cedula + ", nombre=" + nombre + ", email=" + email + ", Nacimiento=" + Nacimiento + ", alergias=" + alergias + ", medicamentos=" + medicamentos + '}';
    }

   
    
    
}