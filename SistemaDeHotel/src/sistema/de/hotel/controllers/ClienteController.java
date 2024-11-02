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
import java.util.Optional;
import sistema.de.hotel.Cliente;

/**
 *
 * @author Stevef
 */
public class ClienteController {
    
    
       private static final String FILE_NAME = "cliente.dat";
    private List<Cliente> clientes;
    
    public ClienteController(){
    clientes = new ArrayList();
    cargarDatos();
    }
    
    public void agregarCliente(Cliente recepcion){
        clientes.add(recepcion);
        guardarDatos();
    }
    
    public List<Cliente> obtenerCliente(){
        return clientes;
    }
    
     public void actualizarCliente(int index, Cliente nuevoCliente) {
        if (index >= 0 && index < clientes.size()) {
            clientes.set(index, nuevoCliente);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    public void borrarCliente(int index) {
        if (index >= 0 && index < clientes.size()) {
            clientes.remove(index);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }
    
    public Cliente buscarCliente(int index){
                
        Optional<Cliente> roomSearch = clientes.stream().filter(t -> t.getCedula()== index).findFirst();
        
        if(roomSearch.isPresent()){
            System.out.println("Cliente encontrado");
            return roomSearch.get();
        }else{
            System.out.println("Cliente no encontrada");
            return null;
        }   
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




