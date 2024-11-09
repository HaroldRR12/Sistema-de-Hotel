/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import sistema.de.hotel.clases.reservacion;

public class global {
    
    
    /** se gurdan y se genera un archivo en txt para poder almacenar los datos 
     * utilizamos el File para poder crear un archivo 
     * @return archivo
     */
    public void archivo(reservacion reservaciones) throws IOException {

        File archivo = new File("DB_reserva.txt");
        FileWriter escribir;
        PrintWriter linea;

        if (!archivo.exists()) {

            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            linea.print("|" + reservaciones.getId());
            linea.print("|" + reservaciones.getIdAbitacion());
            linea.print("|" + reservaciones.getNombre());
            linea.print("|" + reservaciones.getUsuario());

            linea.close();
            escribir.close();

        } else {
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);

            linea.print("|" + reservaciones.getId());
            linea.print("|" + reservaciones.getIdAbitacion());
            linea.print("|" + reservaciones.getNombre());
            linea.print("|" + reservaciones.getUsuario());
            
            linea.close();
            escribir.close();
        }
    }

}