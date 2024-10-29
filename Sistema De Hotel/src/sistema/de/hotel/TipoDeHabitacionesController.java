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
import java.util.Optional;

/**
 *
 * @author harold
 */
public class TipoDeHabitacionesController {
    
    private static final String FILE_NAME = "tipodehabitaciones.dat";
    private List<TipoDeHabitaciones> tipodehabitaciones;
    
    private TipoDeHabitacionesController(){
    tipodehabitaciones = new ArrayList();
    cargarDatos();
    }
    
    public void agregarTipoDeHabitacion(TipoDeHabitaciones tipo){
        tipodehabitaciones.add(tipo);
        guardarDatos();
    }
    
    public List<TipoDeHabitaciones> obtenerHabitaciones(){
        return tipodehabitaciones;
    }
    
     public void actualizarTipoDeHabitacion(int index, TipoDeHabitaciones nuevoTipoHabitacion) {
        if (index >= 0 && index < tipodehabitaciones.size()) {
            tipodehabitaciones.set(index, nuevoTipoHabitacion);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    public void borrarTipoDeHabitacion(int index) {
        if (index >= 0 && index < tipodehabitaciones.size()) {
            tipodehabitaciones.remove(index);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }
    
    public void buscarTipoDeHabitacion(int index){ 
        Optional<TipoDeHabitaciones> roomSearch = tipodehabitaciones.stream().filter(t -> t.getId() == index).findFirst();
        
        if(roomSearch.isPresent()){
            System.out.println("Tipo de habitacion encontrado" + roomSearch.get());
        }else{
            System.out.println("Tipo de habitacion no encontrada");
        }        
    }
    
    private void cargarDatos(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))){
            tipodehabitaciones = (List<TipoDeHabitaciones>) ois.readObject();
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado, creando uno nuevo");
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }   
    }
    
    private void guardarDatos(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
            oos.writeObject(tipodehabitaciones);
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
    }
}
