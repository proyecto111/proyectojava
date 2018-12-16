package proyectofinal1.modelo;
import java.util.ArrayList;
import java.util.List;
public class RegistroProductos {
	
	private InicioSesion s;
	private List<Productos> ListaProductos;
	
	public RegistroProductos(){
            
	}

	public RegistroProductos(InicioSesion s) {
		
		this.s = s;
		this.ListaProductos =new ArrayList<>();
	}

	public InicioSesion getS() {
		return s;
	}

	public void setS(InicioSesion s) {
		this.s = s;
	}
	//la lista tiene que tener getter y seter??
	public void AgregarProducto(Productos p){
		this.ListaProductos.add(p);
	}
	public void QuitarProducto(Productos p){
		this.ListaProductos.remove(p);
	}
	
	
	
	
	
	
	
}
