/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.hotel;

import java.util.List;

/**
 *
 * @author Stevef
 */
public class Restaurante {
     private List<Platillos> menu;

    public Restaurante() {
        
        this.menu = Platillos.obtenerMenuPredeterminado();
    }

    public void mostrarMenu() {
        System.out.println("---- Menú del Restaurante ----");
        for (int i = 0; i < menu.size(); i++) {
            System.out.print((i + 1) + ". ");
            menu.get(i).imprimirDetalles();
            System.out.println();
        }
    }
}

