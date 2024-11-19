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

/**
 *
 * @author Stevef
 */
public class ClienteController {
    
    
       private static final String FILE_NAME = "cliente.dat";
    private List<Cliente> clientes;
    
    // Constructor
    public ClienteController(){
    clientes = new ArrayList();
    cargarDatos(); // Cargar los datos del archivo al iniciar
    }
    // termina aca
    
    
    // Método para agregar un cliente a la lista y guardar los datos
    public void agregarCliente(Cliente recepcion){
        clientes.add(recepcion);
        guardarDatos();
    }
    
    
    
      // Obtener la lista de clientes
    public List<Cliente> obtenerCliente(){
        return clientes;
    }
    
    
      // Actualizar los datos de un cliente
    
     public void actualizarCliente(int cedula, Cliente nuevoCliente) {
        if (cedula >= 0 && cedula < clientes.size()) {
            clientes.set(cedula, nuevoCliente);
            guardarDatos();
            
        } else {
            System.out.println("Índice no válido");
        }
    }

    public void borrarCliente(int cedula) {
        if (cedula >= 0 && cedula < clientes.size()) {
            clientes.remove(cedula);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }
    
    public Cliente buscarCliente(int cedula){
                
        Optional<Cliente> roomSearch = clientes.stream().filter(t -> t.getCedula()== cedula).findFirst();
        
        if(roomSearch.isPresent()){
            System.out.println("Cliente encontrado");
            return roomSearch.get();
        }else{
            System.out.println("Cliente no encontrada");
            return null;
        }   
    }
    
    public Object[][] actualizartabla (){
        List<Cliente> list = obtenerCliente();
        int contador = 0;
        Object [][] table = new Object[list.size()][6];
        for (Cliente c : list){
        table [contador][0]= c.getCedula();
        table [contador][1]= c.getNombre();
        table [contador][2]= c.getEmail();
        table [contador][3]= c.getIngreso();
        table [contador][4]= c.getAlergias();
        table [contador][5]= c.getMedicamentos();
        contador++;
    }
        return table;
        
    }
    
    
    private void cargarDatos(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))){
            clientes = (List<Cliente>) ois.readObject();
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado, creando uno nuevo");
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }   
    }
    
    private void guardarDatos(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
            oos.writeObject(clientes);
        }catch(IOException e){
            e.printStackTrace();
        }   
    }

    
}




