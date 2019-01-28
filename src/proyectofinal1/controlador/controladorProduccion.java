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
import proyectofinal1.vista.ventanaDetalle;
import proyectofinal1.vista.ventanaProducto;
/**
 *
 * @author PC
 */
public class controladorProduccion implements ActionListener{
    
    private ventanaPrincipal vp;
     private RegistroProductos regprod;

    public controladorProduccion(ventanaPrincipal vp,RegistroProductos regprod) {
        this.vp = vp;
        this.regprod=regprod;
        this.vp.botonAgregar.addActionListener(this);
        this.vp.bDetalleProd.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent o){
        if (o.getSource() == vp.botonAgregar) {
            
            ventanaProducto vProduct=new ventanaProducto();
            controladorVentanaProd cprod=new controladorVentanaProd(vp,vProduct,regprod);
            vProduct.setVisible(true);
            
            
            
        }
        if(o.getSource()==vp.bDetalleProd){
            ventanaDetalle vDet=new ventanaDetalle();
            vDet.titulo.setText("Detalle Producto");
            vDet.setTitle("Detalle Producto");
            
            
            vDet.setVisible(true);
        }
    }
    
    
}
