/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.hotel;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Stevef
 */
public class Cliente {

      //Variables
    private  int idCliente;
    private String nombre;
    private String email;
    private int documento;
    private String contrasena;
    private String prefAlimentarias;
    private List<String> alergias;
    private String medicamentos;

    // Constructor 

    public Cliente(int idCliente, String nombre, String email, int documento, String contrasena, String prefAlimentarias, List<String> alergias, String medicamentos) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.email = email;
        this.documento = documento;
        this.contrasena = contrasena;
        this.prefAlimentarias = prefAlimentarias;
        this.alergias = alergias;
        this.medicamentos = medicamentos;
    }
  
    // Getters
    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getAlergias() {
        return alergias;
    }

    public String getPrefAlimentarias() {
        return prefAlimentarias;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }
 
    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", email=" + email + ", documento=" + documento + ", contrasena=" + contrasena + ", prefAlimentarias=" + prefAlimentarias + ", alergias=" + alergias + ", medicamentos=" + medicamentos + '}';
    }
    
}