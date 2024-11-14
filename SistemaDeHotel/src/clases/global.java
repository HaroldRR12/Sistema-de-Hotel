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
import javax.swing.table.TableRowSorter;
//import sistema.de.hotel.clases.reservacion;

public class global {

    int cont1 = 0001;
    Vector vPrincipal = new Vector();
    //private String fecha = fechaA();
    private String codigo;

    /**
     * se verifica la cantidad de ingresos que hay para poder colocar un codigo
     * apropiado con las cantidades establecidas ( codigo de 4 digitos)
     *
     * @return
     */
    public String Validacion_Ceros() {
        if (cod() <= 9) {
            codigo = "000" + cod();
            return codigo;
        }
        if (cod() > 9 && cod() < 99) {
            codigo = "00" + cod();
            return codigo;
        }
        if (cod() > 99 && cod() < 999) {
            codigo = "0" + cod();
            return codigo;
        } else {
            codigo = "" + cod();
            return codigo;
        }
    }

    public int cod() {
        int cont = 1;
        try {
            FileReader fr = new FileReader("DB_reserva.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
// se le accigana a d la informacion de una persona para poder sumarla luego
            while ((d = br.readLine()) != null) {
                cont++;

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return cont;
    }

    public void guardar(reservacion reserva) {
        vPrincipal.addElement(reserva);

    }

    /**
     * se gurdan y se genera un archivo en txt para poder almacenar los datos
     * utilizamos el File para poder crear un archivo
     *
     * @return archivo
     */
    public void archivo(reservacion reservaciones) throws IOException {

        File archivo = new File("DB_reserva.txt");
        FileWriter escribir;
        PrintWriter linea;

        if (!archivo.exists()) {

            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            linea.print("|" + cod());
            linea.print("|" + reservaciones.getIdAbitacion());
            linea.print("|" + reservaciones.getNombre());
            linea.print("|" + reservaciones.getUsuario());

            linea.close();
            escribir.close();

        } else {
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);

            linea.print("|" + cod());
            linea.print("|" + reservaciones.getIdAbitacion());
            linea.print("|" + reservaciones.getNombre());
            linea.print("|" + reservaciones.getUsuario());
            linea.print("|"+reservaciones.getPrecio());

            linea.close();
            escribir.close();
        }
    }

    //  private TableRowSorter trsfiltro;//Creamos la variable de TipoRowSorter que nos permite acomodar los datos de una tabla para realizar la busqueda en una columna en especifico
    // String filtro; //Se el filtro de tipo strng 
    public DefaultTableModel listarDatos() {
        Vector columnas = new Vector();

        columnas.addElement("ID");
        columnas.addElement("USUARIO");
        columnas.addElement("ID HABITACION");
        columnas.addElement("NOMBRE");
        columnas.addElement("PRECIO");

        // SE CREA LAS COLUMNAS QUE TENDRAN LOS DATOS DE LA TABLA
        // GENERAMOS UN MODELO DE LA TABLA
        DefaultTableModel mdlTabla = new DefaultTableModel(columnas, 0);

        try {
            FileReader fr = new FileReader("DB_reserva.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;

            while ((d = br.readLine()) != null) {

                String[] prueba = new String[d.length()];
                StringTokenizer dato = new StringTokenizer(d, "|");
                Vector x = new Vector();

                prueba[cont1] = d;
                System.out.println(prueba[cont1]);
                cont1 = cont1 + 1;
                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());

                }
                mdlTabla.addRow(x);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdlTabla;
    }
}
