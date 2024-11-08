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
import sistema.de.hotel.TipoDeHabitaciones;

/**
 *
 * @author harold
 */
public class TipoDeHabitacionesController {
    
    private static final String FILE_NAME = "tipodehabitaciones.dat";
    private List<TipoDeHabitaciones> tipodehabitaciones;
    private int idContador;
    
    public TipoDeHabitacionesController(){
    tipodehabitaciones = new ArrayList();
    cargarDatos();
    inicializarIdContador();
    }
    //Guardar Tipo de habitaciones
    public void agregarTipoDeHabitacion(TipoDeHabitaciones tipo){
        tipodehabitaciones.add(tipo);
        guardarDatos();
    }
    //Leer los tipos creados
    public List<TipoDeHabitaciones> obtenerHabitaciones(){
        return tipodehabitaciones;
    }
    //Actualizar tipos creados
    public void actualizarTipoDeHabitacion(int id, TipoDeHabitaciones nuevoTipoHabitacion) {
        boolean encontrado = false;

        for (int x = 0; x < tipodehabitaciones.size(); x++) {
            
            TipoDeHabitaciones th = tipodehabitaciones.get(x);

            if (th.getId() == id) { 
                tipodehabitaciones.set(x, nuevoTipoHabitacion); // Actualizar el objeto en la lista
                guardarDatos(); 
                System.out.println("Tipo de habitacion actualizado exitosamente");
                encontrado = true;
                break; 
            }
    }      

    if (!encontrado) {
        System.out.println("ID no válido");
    }
}
    //Encontrar el id maximo
    private void inicializarIdContador() {
        
        int maxId = 0;
      
        for (TipoDeHabitaciones th : tipodehabitaciones) {
        if (th.getId() > maxId) {
            maxId = th.getId();
        }
    }

    idContador = maxId + 1;
    }
    //Generar un nuevo id 
    public int generarNuevoId() {
        return idContador++;
    }
    //Eliminar tipo de habitacion
    public void borrarTipoDeHabitacion(int id) {
        
        Iterator<TipoDeHabitaciones> iterator = tipodehabitaciones.iterator();
        boolean encontrado = false;//Boolean en caso de no encontrar la id
        
        while (iterator.hasNext()) {      
        TipoDeHabitaciones th = iterator.next();
        
        if (th.getId() == id) { //Verificar id
            iterator.remove();
            encontrado = true;
            guardarDatos();
            System.out.println("Tipo de Habitacion eliminado exitosamente");
            break; 
        }
    }
        if (!encontrado) {
            System.out.println("ID no válido");
        }else{
            inicializarIdContador(); //Reajustar las ID;
        }
    }
    //Buscar tipo de habitacion
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
    //Refrescar la tabla
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
