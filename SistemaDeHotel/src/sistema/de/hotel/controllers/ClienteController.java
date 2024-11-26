/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.hotel.controllers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Optional;
import sistema.de.hotel.Cliente;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


/**
 *
 * @author Stevef
 */
public class ClienteController {
    
    
        private static final String FILE_NAME = "cliente.dat";
    private List<Cliente> clientes;
    
    // Constructor
    public ClienteController(){
    clientes = new ArrayList<>();
    cargarDatos(); // Cargar los datos del archivo al iniciar
    }
    // termina aca
    
    
    // Método para agregar un cliente a la lista y guardar los datos
    public boolean agregarCliente(Cliente cliente) {
    File archivo = new File(FILE_NAME);
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
        bw.write(cliente.toString()); // Reemplaza con el formato de salida que uses
        bw.newLine();
        return true;
    } catch (IOException e) {
        System.err.println("Error al guardar el cliente: " + e.getMessage());
        return false;
    }
}
    
    
    
      // Obtener la lista de clientes
    public List<Cliente> obtenerCliente(){
        return new ArrayList<>(clientes);
    }
    
    
     
            
     public boolean actualizarCliente(String cedula, String nombre, String email, String ingreso, String alergias, String medicamentos) {
    for (int i = 0; i < clientes.size(); i++) {
        if (clientes.get(i).getCedula().equals(cedula)) { 
            
            Cliente clienteActualizado = new Cliente(cedula, nombre, email, ingreso, alergias, medicamentos);
            clientes.set(i, clienteActualizado); 
            guardarDatos(); 
            return true; 
        }
    }
    System.out.println("No se encontró cliente con el número de cédula " + cedula);
    return false; 
}

   public boolean borrarCliente(String cedula) {
    Iterator<Cliente> iterator = clientes.iterator();
    while (iterator.hasNext()) {
        if (iterator.next().getCedula().equals(cedula)) { 
            iterator.remove();
            guardarDatos();     
            return true; 
        }
    }
    System.out.println("No se encontró un cliente con la cédula " + cedula);
    return false;
}
    
    
    
   public boolean buscarCliente(String cedula) {
    return clientes.stream().anyMatch(c -> c.getCedula().equals(cedula));
}

    
     public Object[][] generarDatosTabla() {
        Object[][] table = new Object[clientes.size()][6];
        int contador = 0;
        for (Cliente c : clientes) {
            table[contador][0] = c.getCedula();
            table[contador][1] = c.getNombre();
            table[contador][2] = c.getEmail();
            table[contador][3] = c.getIngreso();
            table[contador][4] = c.getAlergias();
            table[contador][5] = c.getMedicamentos();
            contador++;
        }
        return table;
    }
    
    
   public void cargarDatos() {
    File archivo = new File(FILE_NAME);
    if (!archivo.exists()) {
        System.out.println("El archivo no existe. No hay datos que cargar.");
        return;
    }

    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
        clientes = (List<Cliente>) ois.readObject(); // Carga la lista de clientes
    } catch (FileNotFoundException e) {
        System.out.println("Archivo no encontrado, creando uno nuevo.");
    } catch (IOException | ClassNotFoundException e) {
        System.err.println("Error al cargar los datos: " + e.getMessage());
    }
}

    
    public void guardarDatos() {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
        oos.writeObject(clientes); // Guarda toda la lista de clientes
    } catch (IOException e) {
        System.err.println("Error al guardar los datos: " + e.getMessage());
    }
}
    
    
}




