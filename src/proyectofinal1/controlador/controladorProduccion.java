/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal1.controlador;

import proyectofinal1.vista.ventanaPrincipal;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import proyectofinal1.vista.ventanaProducto;
/**
 *
 * @author PC
 */
public class controladorProduccion implements ActionListener{
    
    private ventanaPrincipal vp;

    public controladorProduccion(ventanaPrincipal vp) {
        this.vp = vp;
        this.vp.botonAgregar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent o){
        if (o.getSource() == vp.botonAgregar) {
            
            ventanaProducto vProduct=new ventanaProducto();
            controladorVentanaProd cprod=new controladorVentanaProd(vp,vProduct);
            vProduct.setVisible(true);
            
            
            
        } 
    }
    
    
}
