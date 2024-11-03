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
import sistema.de.hotel.Usuarios;



/**
 *
 * @author CALUFA
 */
public class UsuarioController {
 private static final String FILE_NAME = "usuario.dat";
    private List<Usuarios> usuarios;
    
    public boolean validarLogin(String usuario, String contrasena){
        String usuarioCorrecto ="admin";
        String contrasenaCorrecto ="12345";
        return  usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecto);
    }
    public UsuarioController(){
    usuarios = new ArrayList();
    cargarDatos();
    }
    
    public void agregarUsuario(Usuarios user){
        usuarios.add(user);
        guardarDatos();
    }
     private void cargarDatos(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))){
            usuarios = (List<Usuarios>) ois.readObject();
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado, creando uno nuevo");
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }   
    }
         private void guardarDatos(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
            oos.writeObject(usuarios);
        }catch(IOException e){
            e.printStackTrace();
        }
        
         }
}
