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
import proyectofinal1.modelo.RegistroProductos;
import proyectofinal1.vista.ventanaPrincipal;
import proyectofinal1.vista.ventanaProducto;

/**
 *
 * @author PC
 */
public class controladorVentanaProd implements ActionListener {
    private ventanaPrincipal vp;
    private ventanaProducto subVent;
    private Producto P;
    private RegistroProductos regprod;
    
    

    public controladorVentanaProd(ventanaPrincipal vp,ventanaProducto subVent,RegistroProductos regprod) {
        this.vp=vp;
        this.subVent = subVent;
        this.regprod=regprod;
        this.subVent.bAgregProd.addActionListener(this);
        this.subVent.bGenFV.addActionListener(this);
        
    }

   @Override
   public void actionPerformed(ActionEvent a){
       
       Date fv=new Date();
       
       if (a.getSource()==subVent.bAgregProd){
           
               
           //tomo datos de las casillas
           String nomP=subVent.casillaNomP.getText();
           String codProd = subVent.casillacodigo.getText();
           String des = subVent.casillaDescrip.getText();
           
           int can = Integer.parseInt(subVent.casillaCant.getText());
           

           String lo = subVent.casillaLote.getText();
           Date fe = subVent.selectorFE.getDatoFecha();
           //creo producto
           
           this.P=new Producto(nomP,codProd,des,lo);
           
           System.out.println("genera producto");
           
           //genero envases
           generarEnvases(P,fe,fv);
           System.out.println("genera envases");
           //agrego producto al registro
           regprod.AgregarProducto(P);
           //genero fila para agregar
           
           String[] fn = generarFila(codProd,des,fe,can);
           //genero modelo de tabla
           DefaultTableModel mdp = (DefaultTableModel) vp.tabla.getModel();
           //agrego fila a la tabla
           mdp.addRow(fn);
           //
           
           

           subVent.dispose();
     
           
       }
       if(a.getSource()==subVent.bGenFV){
           Date fe = subVent.selectorFE.getDatoFecha();
           fv=generarFechaVencim(fe,6);
           
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
    public void generarEnvases(Producto p,Date fechaelab,Date fechavencim){
        //genero envases
        String[] cods = generarCodigos(p.getStock());
        
        
        
        
        for (int i = 0; i <p.getStock(); i++ ){
            
            //GENERO ENVASE
            Envase env=new Envase(cods[i],fechaelab,fechavencim);
            //AGREGO ENVASE A LA LISTA DE PRODUCTOS
            p.AgregarEnvase(env);
        }
    }
    public String[] generarCodigos(int cant){
        //FUNCIONA BIEN
        String[] codigos=new String[cant];
    
        for (int i=0;i<cant;i++){
            //por el momentos genera numeros aleatorios
            codigos[i]=Integer.toString(generarAleatorios());
            
            
        }
        
        return codigos;
        
    }
    public int generarAleatorios(){
        //FUNCIONA BIEN
        int numero=(int)(Math.random()*100)+1;
        return numero;
    }
}
