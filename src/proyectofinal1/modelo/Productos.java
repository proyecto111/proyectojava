package proyectofinal1.modelo;

import java.util.Date;

public class Productos {
	private String nombre;
	private String codId;
	private Date fechaElab;
	private String nroLote;
	private int Stock;
	
	public Productos(){
		
	}

	public Productos(String nombre, String codId, Date fechaElab, String nroLote, int stock) {
		this.nombre = nombre;
		this.codId = codId;
		this.fechaElab = fechaElab;
		this.nroLote = nroLote;
		this.Stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodId() {
		return codId;
	}

	public void setCodId(String codId) {
		this.codId = codId;
	}

	public Date getFechaElab() {
		return fechaElab;
	}

	public void setFechaElab(Date fechaElab) {
		this.fechaElab = fechaElab;
	}

	public String getNroLote() {
		return nroLote;
	}

	public void setNroLote(String nroLote) {
		this.nroLote = nroLote;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}
	public void mostrarProducto(){
		System.out.println("Producto: "+getNombre());
		System.out.println("codigo: "+getCodId());
		System.out.println("fecha de elaboracion: "+getFechaElab());
		System.out.println("Numero de lote: "+getNroLote());
		System.out.println("Stock disponible: "+getStock());
		
	}
	public void iniciarLista(){
            
        }
	
	
}
