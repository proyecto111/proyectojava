/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal1.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import proyectofinal1.modelo.Usuario;
import proyectofinal1.modelo.InicioSesion;
import proyectofinal1.vista.ventanaLogin;
import proyectofinal1.vista.ventanaPrincipal;

/**
 *
 * @author PC
 */
public class controladorLogin implements ActionListener{
    private Usuario us;
    private InicioSesion ses;
    private ventanaLogin v;
    
    public controladorLogin(Usuario us, InicioSesion ses, ventanaLogin v){
     this.us=us;
     this.v=v;
     this.ses=ses;
     
     this.v.botonIniciar.addActionListener(this);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        this.v.casillaIngreso.requestFocus();
        String u=v.casillaIngreso.getText().trim();
        String p=v.casillaPass.getText().trim();
        Date fecha=new Date();
        if("qwe".equals(u) && "123".equals(p) && e.getSource()==v.botonIniciar){
            us.setNombre(u);
            us.setContraseña(p);
            ses.setU(us);
            ses.setFecha(fecha);
            ses.setIniciado(true);
            ventanaPrincipal vp=new ventanaPrincipal();
            controladorPrincipal cp=new controladorPrincipal(us,vp);
            
            vp.setVisible(true);
            vp.contenedorFrames.removeAll();
            vp.contenedorFrames.repaint();
            vp.contenedorFrames.validate();
            vp.contenedorFrames.add(vp.tarjetas);
            vp.contenedorFrames.repaint();
            vp.contenedorFrames.validate();
            
            v.dispose();
            
        }
        if(ses.isIniciado()==true){
            ses.mostrar();
        }
        else
            System.out.println("Datos incorrectos");
    }
        
    
    
    
    
    
}
