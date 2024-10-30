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
    private String idCliente;
    private String nombre;
    private String email;
    private String documento;
    private String contrasena;
    private String prefAlimentarias;
    private List<String> alergias;
    private String medicamentos;

    // Constructor vacío
    public Cliente() {}

    // Método para registrar los datos del cliente desde la consola
    public void registrarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese ID del cliente: ");
        this.idCliente = scanner.nextLine();

        System.out.print("Ingrese nombre del cliente: ");
        this.nombre = scanner.nextLine();

        System.out.print("Ingrese email del cliente: ");
        this.email = scanner.nextLine();

        System.out.print("Ingrese documento del cliente: ");
        this.documento = scanner.nextLine();

        System.out.print("Ingrese contraseña: ");
        this.contrasena = scanner.nextLine();

        System.out.print("Ingrese preferencias alimentarias: ");
        this.prefAlimentarias = scanner.nextLine();

        System.out.print("Ingrese alergias (separadas por coma): ");
        this.alergias = List.of(scanner.nextLine().split(","));

        System.out.print("Ingrese medicamentos: ");
        this.medicamentos = scanner.nextLine();
    }

    // Getters
    public String getIdCliente() {
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

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", email=" + email + ", documento=" + documento + ", contrasena=" + contrasena + ", prefAlimentarias=" + prefAlimentarias + ", alergias=" + alergias + ", medicamentos=" + medicamentos + '}';
    }
    
    
    
}