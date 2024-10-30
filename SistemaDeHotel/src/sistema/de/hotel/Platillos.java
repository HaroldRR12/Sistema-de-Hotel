/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.hotel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stevef
 */
public class Platillos {
    private String nombre;
    private double precio;
    private List<String> ingredientes;
    private List<String> alergenos;

    public Platillos(String nombre, double precio, List<String> ingredientes, List<String> alergenos) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.alergenos = alergenos;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public List<String> getAlergenos() {
        return alergenos;
    }

    public void imprimirDetalles() {
        System.out.println(nombre + " - $" + precio);
        System.out.println("Ingredientes: " + String.join(", ", ingredientes));
        System.out.println("Alergenos: " + String.join(", ", alergenos));
    }

    // Lista de platillos 
    public static List<Platillos> obtenerMenuPredeterminado() {
        List<Platillos> menu = new ArrayList<>();
        menu.add(new Platillos("Pasta Alfredo", 15.65, List.of("Pasta", "Crema", "Queso"), List.of("Lácteos")));
        menu.add(new Platillos("Ensalada César", 10.50, List.of("Lechuga", "Pollo", "Queso", "Croutons"), List.of("Lácteos", "Gluten")));
        menu.add(new Platillos("Sopa de Tomate", 8.99, List.of("Tomate", "Cebolla", "Ajo"), List.of("Ninguno")));
        menu.add(new Platillos("Pasta Carbonara", 14.70, List.of("Pasta", "Guancile", "Queso", "Huevos", "Pimienta"), List.of("Lacteos")));
        return menu;
    }
}
