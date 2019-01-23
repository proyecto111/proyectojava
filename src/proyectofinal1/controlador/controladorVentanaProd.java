/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal1.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import proyectofinal1.modelo.Envase;
import proyectofinal1.modelo.Producto;
import proyectofinal1.vista.ventanaProducto;

/**
 *
 * @author PC
 */
public class controladorVentanaProd implements ActionListener {
    private ventanaProducto subVent;
    private Producto prod;
    private Envase env;

    public controladorVentanaProd(ventanaProducto subVent) {
        this.subVent = subVent;
        this.subVent.bAgregProd.addActionListener(this);
        this.subVent.bGenFV.addActionListener(this);
    }

   @Override
   public void actionPerformed(ActionEvent a){
       
       if (a.getSource()==subVent.bAgregProd){
           
           String cod=subVent.casillacodigo.getText();
           String des=subVent.casillaDescrip.getText();
           int can=Integer.parseInt(subVent.casillaCant.getText());
           String lo=subVent.casillaLote.getText();
           Date fe=subVent.selectorFE.getDatoFecha();
           subVent.dispose();
           
       }
       if(a.getSource()==subVent.bGenFV){
           Date fe = subVent.selectorFE.getDatoFecha();
           System.out.println(fe.toString());
           subVent.casillaFV.setText(fe.toString());
           
       }
       
   }
   public void generarEnvases(String cod,String des,int can,String lo,Date fe){
       
   }
   
    
    
}
