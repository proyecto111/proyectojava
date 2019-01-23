package proyectofinal1.modelo;

import java.util.ArrayList;
import java.util.List;

public class Producto {
	private String nombreProducto;
	private String Idproducto;
	private int Stock;
        private List<Envase> listaEnvases;
        private String Descripcion;
	
	public Producto(){
		
	}

    public Producto(String nombreProducto, String Idproducto, int Stock) {
        this.nombreProducto = nombreProducto;
        this.Idproducto = Idproducto;
        this.Stock = Stock;
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
        return Stock;
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

    
    

    public void mostrarProducto() {
        System.out.println("Producto: " + getNombreProducto());
        System.out.println("codigo: " + getIdproducto());
        System.out.println("Stock disponible: " + getStock());

    }

    

}
