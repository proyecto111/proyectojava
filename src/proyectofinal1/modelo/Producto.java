package proyectofinal1.modelo;

import java.util.ArrayList;
import java.util.List;

public class Producto {
	private String nombreProducto;
	private String Idproducto;
	private int Stock;
        private List<Envase> listaEnvases;
        private String Descripcion;
        private String Lote;
	
	   public Producto() {
        
    }

    public Producto(String nombreProducto, String Idproducto, String Descripcion,String Lote) {
        this.nombreProducto = nombreProducto;
        this.Idproducto = Idproducto;
        
        this.Lote=Lote;
        this.Descripcion=Descripcion;
        this.listaEnvases =new ArrayList<>();
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getIdproducto() {
        return Idproducto;
    }

    public void setIdproducto(String Idproducto) {
        this.Idproducto = Idproducto;
    }

    public int getStock() {
        
        return this.listaEnvases.size();
        
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public void AgregarEnvase(Envase env){
        this.listaEnvases.add(env);
        this.setStock(this.getStock()+1);
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getLote() {
        return Lote;
    }

    public void setLote(String Lote) {
        this.Lote = Lote;
    }

    
    

    public void mostrarProducto() {
        System.out.println("Producto: " + getNombreProducto());
        System.out.println("codigo: " + getIdproducto());
        System.out.println("Stock disponible: " + getStock());

    }

    

}
