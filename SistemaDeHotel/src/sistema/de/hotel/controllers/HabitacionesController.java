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
import java.util.Iterator;
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
    
    public void actualizarHabitacion(int id, Habitaciones nuevaHabitacion) {
        boolean encontrado = false;

        for (int x = 0; x < habitaciones.size(); x++) {
            
            Habitaciones h = habitaciones.get(x);

            if (h.getNumH() == id) { 
                habitaciones.set(x, nuevaHabitacion); // Actualizar el objeto en la lista
                guardarDatos(); 
                System.out.println("Habitacion actualizada exitosamente");
                encontrado = true;
                break; 
            }
      
        }  
        if (!encontrado) {
           System.out.println("ID no válido");
        }    
    }

    public void borrarHabitacion(int id) {
        
        Iterator<Habitaciones> iterator = habitaciones.iterator();
        boolean encontrado = false;//Boolean en caso de no encontrar la id
        
        while (iterator.hasNext()) {      
            Habitaciones h = iterator.next();
        
            if (h.getNumH()== id) { //Verificar id
                iterator.remove();
                encontrado = true;
                guardarDatos();
                System.out.println("Habitacion eliminada exitosamente");
                break; 
            }
        }
        if (!encontrado) {
            System.out.println("ID no válido");
        }
    }
    
    public Habitaciones buscarHabitacion(int index){
                
        Optional<Habitaciones> roomSearch = habitaciones.stream().filter(t -> t.getNumH()== index).findFirst();
        
        if(roomSearch.isPresent()){
            System.out.println("Habitacion encontrada");
            return roomSearch.get();
        }else{
            System.out.println("Habitacion no encontrada");
            return null;
        }   
    }
    
    public Object[][] refrescarTabla(){
        List<Habitaciones> list = obtenerHabitaciones();
        int contador =0;
        Object[][] table = new Object[list.size()][4];
        for (Habitaciones h : list) {
            table[contador][0]=h.getNumH();
            table[contador][1]=h.getTipoDeH();
            table[contador][2]=h.getPrecio();
            table[contador][3]=h.getOcupado();
            contador++;
        }
        return table;
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
