/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.hotel.controllers;

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
    if (clientes.stream().anyMatch(c -> c.getCedula().equals(cliente.getCedula()))) {
        System.out.println("El cliente con la cedula numero: " + cliente.getCedula() + " ya existe.");
        return false; // No se pudo agregar porque ya existe
    } else {
        clientes.add(cliente);
        guardarDatos();
        return true; // Cliente agregado con éxito
    }


}
    
    
    
      // Obtener la lista de clientes
    public List<Cliente> obtenerCliente(){
        return new ArrayList<>(clientes);
    }
    
    
      // Actualizar los datos de un cliente
            
     public boolean actualizarCliente(String cedula, String nombre, String email, String ingreso, String alergias, String medicamentos) {
    for (int i = 0; i < clientes.size(); i++) {
        if (clientes.get(i).getCedula().equals(cedula)) { // Usa equals para comparar las cédulas
            // Crear un nuevo cliente con los datos actualizados
            Cliente clienteActualizado = new Cliente(cedula, nombre, email, ingreso, alergias, medicamentos);
            clientes.set(i, clienteActualizado); // Reemplazar el cliente en la lista
            guardarDatos(); // Guardar los datos actualizados en el archivo
            return true; // Indicar que la actualización fue exitosa
        }
    }
    System.out.println("No se encontró cliente con el número de cédula " + cedula);
    return false; // Si no se encuentra el cliente
}

   public boolean borrarCliente(String cedula) {
    Iterator<Cliente> iterator = clientes.iterator();
    while (iterator.hasNext()) {
        if (iterator.next().getCedula().equals(cedula)) { // Usa equals para comparar strings
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
    
    
    private void cargarDatos() {
    File archivo = new File(FILE_NAME);
    if (archivo.exists()) {
        archivo.delete();  // Elimina el archivo existente
        System.out.println("Archivo anterior eliminado.");
    }

        
        
        
        
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
        clientes = (List<Cliente>) ois.readObject();  // Deserializa los objetos y asigna a la lista
    } catch (FileNotFoundException e) {
        System.out.println("Archivo no encontrado, creando uno nuevo.");
    } catch (IOException | ClassNotFoundException e) {
        System.err.println("Error al cargar los datos: " + e.getMessage());
    }
}

    
    private void guardarDatos() {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
        oos.writeObject(clientes); // Guardar la lista de clientes en el archivo
    } catch (IOException e) {
        e.printStackTrace();
    }
}   
    
    
}




