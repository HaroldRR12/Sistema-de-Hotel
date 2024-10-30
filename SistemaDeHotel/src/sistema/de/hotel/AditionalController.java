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
 * @author otoniel
 */
public class AditionalController {
    private static final String FILE_NAME = "aditionals.dat"; 
    private List<Aditional> aditionals; //Lista para guardar objetos de tipo "adicional"
    
    
    //Array list para guardar los datos cargados
    public AditionalController()
    {
        aditionals = new ArrayList<>();
    }
    
    //Agregar Adicionales a la lista
    public void agregarAdicional (Aditional servicio)
    {
        aditionals.add(servicio);
    }
    
    //Obtener lista de adicionales en la lista
    public List<Aditional> obtenerAdicionales()
    {
     return aditionals;   
    }
    
    // Cargar Datos
   private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            aditionals = (List<Aditional>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
   
   private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(aditionals);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
      
}
