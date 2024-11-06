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
import sistema.de.hotel.TipoDeHabitaciones;

/**
 *
 * @author harold
 */
public class TipoDeHabitacionesController {
    
    private static final String FILE_NAME = "tipodehabitaciones.dat";
    private List<TipoDeHabitaciones> tipodehabitaciones;
    
    public TipoDeHabitacionesController(){
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
    
     public void actualizarTipoDeHabitacion(int id, TipoDeHabitaciones nuevoTipoHabitacion) {
        if (id >= 0 && id < tipodehabitaciones.size()) {
            tipodehabitaciones.set(id, nuevoTipoHabitacion);
            guardarDatos();
        } else {
            System.out.println("Id no válido");
        }
    }

    public void borrarTipoDeHabitacion(int id) {
        if (id >= 0 && id < tipodehabitaciones.size()) {
            tipodehabitaciones.remove(id);
            guardarDatos();
        } else {
            System.out.println("id no válido");
        }
    }
    
    public TipoDeHabitaciones buscarTipoDeHabitacion(int id){ 
        Optional<TipoDeHabitaciones> roomSearch = tipodehabitaciones.stream().filter(t -> t.getId() == id).findFirst();
        
        if(roomSearch.isPresent()){
            System.out.println("Tipo de habitacion encontrado");
            return roomSearch.get();
        }else{
            System.out.println("Tipo de habitacion no encontrada");
            return null;
        }        
    }
    
    public Object[][] refrescarTabla(){
        List<TipoDeHabitaciones> list = obtenerHabitaciones();
        int contador =0;
        Object[][] table = new Object[list.size()][3];
        for (TipoDeHabitaciones h : list) {
            table[contador][0]=h.getId();
            table[contador][1]=h.getTipoHabitacion();
            table[contador][2]=h.getPrecio();
            contador++;
        }
        return table;
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
