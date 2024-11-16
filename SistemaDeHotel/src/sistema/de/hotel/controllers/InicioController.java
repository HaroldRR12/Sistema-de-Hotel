/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.de.hotel.controllers;

import java.util.List;
import sistema.de.hotel.Usuarios;

/**
 *
 * @author Jafeth
 */
public class InicioController {
    private final UsuarioController u;
    public InicioController() {
        u = new UsuarioController();
    }
    public boolean validarLogin(String usuario, String contrasena)
    {     
        List<Usuarios> listaUser = u.obtenerUsuario();
        for (Usuarios p: listaUser) 
        {


            if(p.getUsuario().equals(usuario)&& p.getContrasena().equals(contrasena))
            {
                return true;
            }
            
        }
        return false;
    
}
}
