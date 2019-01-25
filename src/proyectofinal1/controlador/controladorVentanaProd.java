/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal1.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import proyectofinal1.modelo.Envase;
import proyectofinal1.modelo.Producto;
import proyectofinal1.vista.ventanaPrincipal;
import proyectofinal1.vista.ventanaProducto;

/**
 *
 * @author PC
 */
public class controladorVentanaProd implements ActionListener {
    private ventanaPrincipal vp;
    private ventanaProducto subVent;
    
    

    public controladorVentanaProd(ventanaPrincipal vp,ventanaProducto subVent) {
        this.vp=vp;
        this.subVent = subVent;
        this.subVent.bAgregProd.addActionListener(this);
        this.subVent.bGenFV.addActionListener(this);
    }

   @Override
   public void actionPerformed(ActionEvent a){
       
       if (a.getSource()==subVent.bAgregProd){
           try{
           String nomP=subVent.casillaNomP.getText();
           String codProd = subVent.casillacodigo.getText();
           String des = subVent.casillaDescrip.getText();
           int can = Integer.parseInt(subVent.casillaCant.getText());
           

           String lo = subVent.casillaLote.getText();
           Date fe = subVent.selectorFE.getDatoFecha();
           
           String[] fn = generarFila(codProd,des,fe,can);
           
           DefaultTableModel mdp = (DefaultTableModel) vp.tabla.getModel();
           mdp.addRow(fn);
           //genero objeto producto
           Producto Prod=new Producto();
           

           subVent.dispose();
           }
           catch(Exception e){
               System.out.println("Datos incompletos o incorrectos");
           }
           
       }
       if(a.getSource()==subVent.bGenFV){
           Date fe = subVent.selectorFE.getDatoFecha();
           Date fv=generarFechaVencim(fe,6);
          
           subVent.casillaFV.setText(formatearFecha(fv));
           
       }
       
   }
   
   public Date generarFechaVencim(Date d, int meses){
       if(meses==0)
           return d;
       Calendar calendario=Calendar.getInstance();
       calendario.setTime(d);
       calendario.add(Calendar.MONTH, meses);
       return calendario.getTime();
   }
   public String formatearFecha(Date d){
       SimpleDateFormat sfd=new SimpleDateFormat("dd/MM/yyyy");
       return sfd.format(d);
       
   }
    public String[] generarFila(String c,String d,Date f,int cnt){
        String[] filanueva = new String[4];
        filanueva[0]=c;
        filanueva[1]=d;
        
        filanueva[2]=formatearFecha(f);
        
        filanueva[3]=String.valueOf(cnt);
        
        return filanueva;
    }
    public void generarEnvases(String descrip,String np, Date felab, Date fVenc,int cant,Producto p){
        String[] cods = generarCodigos(cant);
        p.setDescripcion(descrip);
        p.setNombreProducto(np);
        p.setStock(cant);
        for (int i = 0; i <= cant; i++ ){
            //GENERO ENVASE
            Envase env=new Envase(cods[i],felab,fVenc);
            //AGREGO ENVASE A LA LISTA DE PRODUCTOS
            p.AgregarEnvase(env);
        }
    }
    public String[] generarCodigos(int cant){
        String codigos[]=new String[cant]; 
        for (int i=0;i<=cant;i++){
            //por el momentos genera numeros aleatorios
            codigos[i]=Integer.toString(generarAleatorios(cant));
        }
        return codigos;
    }
    public int generarAleatorios(int cant){
        int numero=(int)(Math.random()*cant)+1;
        return numero;
    }
}
