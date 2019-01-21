/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal1.controlador;

import proyectofinal1.vista.ventanaPrincipal;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import proyectofinal1.modelo.Usuario;
/**
 *
 * @author PC
 */
public class controladorPrincipal implements ActionListener{
    
    private final ventanaPrincipal vp;
    private final Usuario u;
    
    
    public controladorPrincipal(Usuario u,ventanaPrincipal vp){
        this.vp=vp;
        this.u=u;
        this.vp.botonMenu.addActionListener(this);
        this.vp.etiquetaUsuario.setText(u.getNombre());
        this.vp.botonProduccion.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        int position=vp.panelMenu.getX();
        
        if(e.getSource()==vp.botonProduccion){
            vp.contenedorFrames.removeAll();
            vp.contenedorFrames.repaint();
            vp.contenedorFrames.validate();
            vp.contenedorFrames.add(vp.panelProduccion);
            vp.contenedorFrames.repaint();
            vp.contenedorFrames.validate();
        }
       
        
    }
    
    
    
    
    
}
