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
import sistema.de.hotel.Habitaciones;

/**
 *
 * @author harold
 */
public class HabitacionesController {
    
    private static final String FILE_NAME = "habitaciones.dat";
    private List<Habitaciones> habitaciones;
    
    public HabitacionesController(){
    habitaciones = new ArrayList();
    cargarDatos();
    }
    
    public void agregarHabitacion(Habitaciones cuarto){
        habitaciones.add(cuarto);
        guardarDatos();
    }
    
    public List<Habitaciones> obtenerHabitaciones(){
        return habitaciones;
    }
    
     public void actualizarHabitacion(int index, Habitaciones nuevaHabitacion) {
        if (index >= 0 && index < habitaciones.size()) {
            habitaciones.set(index, nuevaHabitacion);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    public void borrarHabitacion(int index) {
        if (index >= 0 && index < habitaciones.size()) {
            habitaciones.remove(index);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }
    
    public Habitaciones buscarHabitacion(int index){
                
        Optional<Habitaciones> roomSearch = habitaciones.stream().filter(t -> t.getNumH()== index).findFirst();
        
        if(roomSearch.isPresent()){
            System.out.println("Tipo de habitacion encontrado");
            return roomSearch.get();
        }else{
            System.out.println("Tipo de habitacion no encontrada");
            return null;
        }   
    }
    
    private void cargarDatos(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))){
            habitaciones = (List<Habitaciones>) ois.readObject();
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado, creando uno nuevo");
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }   
    }
    
    private void guardarDatos(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
            oos.writeObject(habitaciones);
        }catch(IOException e){
            e.printStackTrace();
        }   
    }
    
}
