package proyectofinal1.modelo;
import java.util.ArrayList;
import java.util.List;
public class RegistroProductos {
	
	private InicioSesion s;
	private List<Producto> ListaProductos;
	
	public RegistroProductos(){
            
	}

	public RegistroProductos(InicioSesion s) {
		
		this.s = s;
		this.ListaProductos =new ArrayList<>();
	}

	public InicioSesion getSesion() {
		return s;
	}

	public void setSesion(InicioSesion s) {
		this.s = s;
	}
	//la lista tiene que tener getter y seter??
	public void AgregarProducto(Producto p){
		this.ListaProductos.add(p);
	}
	public void QuitarProducto(Producto p){
		this.ListaProductos.remove(p);
	}
	
	
	
	
	
	
	
}
