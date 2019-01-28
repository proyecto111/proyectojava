/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal1.controlador;

import proyectofinal1.vista.ventanaPrincipal;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import proyectofinal1.modelo.RegistroProductos;
import proyectofinal1.modelo.Usuario;
/**
 *
 * @author PC
 */
public class controladorPrincipal implements ActionListener{
    
    private  ventanaPrincipal vp;
    private  Usuario u;
    private  RegistroProductos regProd; 
    
    
    public controladorPrincipal(Usuario u,ventanaPrincipal vp){
        this.vp=vp;
        this.u=u;
        
        
        //listeners
        this.vp.botonMenu.addActionListener(this);
        this.vp.etiquetaUsuario.setText(u.getNombre());
        this.vp.botonProduccion.addActionListener(this);
        
        //registros
        this.regProd=new RegistroProductos();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
       
        
        if(e.getSource()==vp.botonProduccion){
            vp.contenedorFrames.removeAll();
            vp.contenedorFrames.repaint();
            vp.contenedorFrames.validate();
            vp.contenedorFrames.add(vp.panelProduccion);
            vp.contenedorFrames.repaint();
            vp.contenedorFrames.validate();
            controladorProduccion cprod=new controladorProduccion(vp,regProd);
        }
       
        
    }
    
    
    
    
    
    
}
