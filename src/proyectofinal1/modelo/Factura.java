package proyectofinal1.modelo;
  
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura{
    private String IDFactura;
    private Date fechaFactura;
    private double montoTotal;
    private String proveedor;
    private List<det>detalle;
    
    public Factura(){
        this.detalle=new ArrayList<>();
    }

    public String getIDFactura() {
        return IDFactura;
    }

    public void setIDFactura(String IDFactura) {
        this.IDFactura = IDFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    public void agregadetalle(det detail){
        detalle.add(detail);
    }
    public void modificar(det detail){
        if (detalle.isEmpty()){
           detalle.add(detail);
       }
       else{
           
           det a = detalle.get(detalle.indexOf(detail.getProd()));
           a.setCantidad(0);
           a.setPrecio(montoTotal);
           a.setProd(proveedor);
       }
      
    }
    
    public void eliminar(det detail){
        detalle.remove(detail);
    }
    public void mostrarfactura(){
        System.out.println(this.IDFactura);
        System.out.println(this.fechaFactura);
        System.out.println(this.proveedor);
        for(det i:detalle){
            System.out.println(i.getCantidad());
            System.out.println(i.getPrecio());
            System.out.println(i.getProd());
        }
        System.out.println(this.montoTotal);
    }
}

