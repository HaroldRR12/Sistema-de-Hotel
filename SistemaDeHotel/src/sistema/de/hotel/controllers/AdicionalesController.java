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
import sistema.de.hotel.Adicionales;


/**
 *
 * @author otoniel
 */
public class AdicionalesController {
    
    private static final String FILE_NAME = "listadeadicionales.dat";
    private List<Adicionales> adicionalesLista;
    private int idContador;
    

    
public AdicionalesController(){
    adicionalesLista = new ArrayList<>();
    cargarDatos();
    inicializarIdContador();
    }



//Generar un nuevo id 
public int generarNuevoId() {
    return idContador++; // Asigna el ID actual y luego incrementa
}

//Guardar Adicionales
public void agregarAdicional(Adicionales tipo){
    tipo.setId(generarNuevoId()); // Asigna el ID consecutivo
    adicionalesLista.add(tipo);
    guardarDatos();
    }



// Leer los adicionales creados
    public List<Adicionales> obtenerAdicionales() {
        return adicionalesLista;
    }
    


//Actualizar Adicionales
public void actualizarAdicionales(int id, Adicionales nuevoAdicional) {
        boolean encontrado = false;

        for (int x = 0; x < adicionalesLista.size(); x++) {
            
            Adicionales ad = adicionalesLista.get(x);

            if (ad.getId() == id) { 
                adicionalesLista.set(x, nuevoAdicional); // Actualizar el objeto en la lista
                guardarDatos(); 
                System.out.println("Adicional Actualizado");
                encontrado = true;
                break; 
            }
    }      

    if (!encontrado) {
        System.out.println("ID no válido");
    }
}
 




  

    
// Eliminar Adicional
public void eliminarAdicional(int id) {
        Iterator<Adicionales> iterator = adicionalesLista.iterator();
    boolean encontrado = false;

    while (iterator.hasNext()) {
        Adicionales ad = iterator.next();

        if (ad.getId() == id) {
            iterator.remove();
            encontrado = true;
            guardarDatos();
            System.out.println("Adicional eliminado");
            break;
        }
    }

    if (!encontrado) {
        System.out.println("ID no válido");
    }
          
}
    
    
    
// Buscar adicionales
public Adicionales buscarAdicionales(int id) {
        Optional<Adicionales> roomSearch = adicionalesLista.stream().filter(t -> t.getId() == id).findFirst();

        if (roomSearch.isPresent()) {
            System.out.println("Adicional encontrado");
            return roomSearch.get();
        } else {
            System.out.println("Adicional no encontrada");
            return null;
        }
}
      
     
     
// Refrescar la tabla
public Object[][] refrescarTabla() {
        List<Adicionales> list = obtenerAdicionales();
        Object[][] table = new Object[list.size()][3];
        int contador = 0;

        for (Adicionales a : list) {
            table[contador][0] = a.getNombreAdicional();
            table[contador][1] = a.getPrecioAdicional();
            table[contador][2] = a.getId();
            contador++;
        }
        return table;
}
     
     

// Cargar datos desde el archivo
private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
        // Leer los datos de la lista y el contador de IDs
        adicionalesLista = (List<Adicionales>) ois.readObject();
        idContador = ois.readInt();  // Cargar el contador de IDs
    } catch (FileNotFoundException e) {
        System.out.println("Archivo no encontrado, creando uno nuevo");
        adicionalesLista = new ArrayList<>(); // Inicializar la lista si el archivo no existe
        idContador = 1; // Establecer el primer ID a 1
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
    }
    

 // Guardar datos en el archivo   
private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
        // Guardar la lista de adicionales y el contador de IDs
        oos.writeObject(adicionalesLista);
        oos.writeInt(idContador); // Guardar el contador de IDs
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
     
     
// Inicializar el contador de ID
private void inicializarIdContador() {
       // Si la lista está vacía, se inicializa el contador en 1
    if (adicionalesLista.isEmpty()) {
        idContador = 1;
    } else {
        // Recorre la lista y encuentra el ID más alto.
        int maxId = adicionalesLista.stream().mapToInt(Adicionales::getId).max().orElse(0);
        idContador = maxId + 1;  // Establecer el siguiente ID
    }
}
}



    
    
    
    