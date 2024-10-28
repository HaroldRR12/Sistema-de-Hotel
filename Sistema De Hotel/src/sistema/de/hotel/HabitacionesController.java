/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.hotel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class HabitacionesController {
    
    private static final String FILE_NAME = "habitaciones.dat";
    private List<Habitaciones> habitaciones;
    
    private HabitacionesController(){
    habitaciones = new ArrayList();
    cargarDatos();
    }
    
    public void agregarEstudiante(Habitaciones cuarto){
        habitaciones.add(cuarto);
        guardarDatos();
    }
    
    public List<Habitaciones> obtenerHabitaciones(){
        return habitaciones;
    }
    
     public void actualizarEstudiante(int index, Habitaciones nuevaHabitacion) {
        if (index >= 0 && index < habitaciones.size()) {
            habitaciones.set(index, nuevaHabitacion);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    public void borrarEstudiante(int index) {
        if (index >= 0 && index < habitaciones.size()) {
            habitaciones.remove(index);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
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
