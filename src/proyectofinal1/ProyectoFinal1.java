/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal1;


import proyectofinal1.controlador.controladorLogin;
import proyectofinal1.modelo.InicioSesion;
import proyectofinal1.modelo.Usuario;
import proyectofinal1.vista.ventanaLogin;

/**
 *
 * @author PC
 */
public class ProyectoFinal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario u=new Usuario();
        InicioSesion s=new InicioSesion();
        ventanaLogin v=new ventanaLogin();
       
        controladorLogin c=new controladorLogin(u,s,v);
       
        v.setLocationRelativeTo(null);
        v.setVisible(true);
        
        
    }
    
    
}
