package proyectofinal1.modelo;

public class Usuario {
	private String nombre;
	private String Contraseña;

	
	public Usuario(){
		
	}


	public Usuario(String nombre, String contraseña) {
		
		this.nombre = nombre;
		this.Contraseña = contraseña;
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getContraseña() {
		return Contraseña;
	}


	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	
	
 
}
