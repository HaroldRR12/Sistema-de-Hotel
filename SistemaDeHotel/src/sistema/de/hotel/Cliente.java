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
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
   

    // Variables
    private String cedula;
    private String nombre;
    private String email;
    private String ingreso;
    private String alergias;
    private String medicamentos;

    // Constructor
    public Cliente(String cedula, String nombre, String email, String ingreso, String alergias, String medicamentos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
        this.alergias = alergias;
        this.medicamentos = medicamentos;
        this.ingreso = ingreso;
    }

    // Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            throw new IllegalArgumentException("El email no es válido.");
        }
        this.email = email;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        if (ingreso == null || ingreso.trim().isEmpty()) {
            throw new IllegalArgumentException("La fecha de ingreso no puede estar vacía.");
        }
        this.ingreso = ingreso;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias == null ? "" : alergias;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos == null ? "" : medicamentos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", email=" + email + ", ingreso=" + ingreso + ", alergias=" + alergias + ", medicamentos=" + medicamentos + '}';
    }

    
    
}