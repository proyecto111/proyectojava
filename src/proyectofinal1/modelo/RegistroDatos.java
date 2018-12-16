
package proyectofinal1.modelo;

import java.util.ArrayList;
import java.util.List;


public class RegistroDatos {
  private List<Factura>listagastos;
  
  public RegistroDatos(){
      this.listagastos=new ArrayList<>();
  }
  public void AgregarFactura(Factura fac){
      listagastos.add(fac);
  }
  
  public void quitarfactura(Factura fac){
      listagastos.remove(fac);
  }
  public void modifica(Factura fac){
      if (listagastos.isEmpty()){
           listagastos.add(fac);
       }
       else{
           
           Factura a = listagastos.get(listagastos.indexOf(fac.getIDFactura()));
           a.getFechaFactura();
           a.getIDFactura();
           a.getMontoTotal();
           a.getProveedor();
       }
  }
  
   public void mostrarFac(){
        for(Factura i:listagastos){
           i.mostrarfactura();
        }
    }
    
}

