package proyectofinal1.modelo;

import java.util.*;


public class RegistroInsumos{
   private Date fecha;
   
   private InicioSesion ses;
   private List<Insumo> listainsumo;
   
   public RegistroInsumos(){
    listainsumo=new ArrayList<>();
}

    public Date getFecha() {
        return fecha;
    }

    

    public InicioSesion getSes() {
        return ses;
    }

    public List<Insumo> getListainsumo() {
        return listainsumo;
    }

    

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    

    public void setSes(InicioSesion ses) {
        this.ses = ses;
    }

    public void setListainsumo(List<Insumo> listainsumo) {
        this.listainsumo = listainsumo;
    }

    public void agregarinsumo(Insumo i){
        listainsumo.add(i);
    }
    public void quitarinsumo(Insumo i){
        listainsumo.remove(i);
    }
   public void modificarinsumo(Insumo i, String nombre,String descripcion, int c){
       if (listainsumo.isEmpty()){
           listainsumo.add(i);
       }
       else{
           
           Insumo a = listainsumo.get(listainsumo.indexOf(i.getNombre()));
           a.setNombre(nombre);
           a.setDescripcion(descripcion);
           a.setCantidad(c);
       }
       
       
   }
  
  
   public void devuelvedatos(){
       for(Insumo i:listainsumo){
           System.out.println(i.getNombre());
           System.out.println(i.getDescripcion());
           System.out.println(i.getCantidad());
       }
   }
    
 
   
}
