package proyectofinal1.modelo;

import java.util.Date;

public class InicioSesion {
	private Usuario U;
	private Date fecha;
	private boolean iniciado;
	
	
	public InicioSesion(){
		
	}


	public InicioSesion(Usuario u, Date fecha, boolean iniciado) {
		
		this.U = u;
		this.fecha = fecha;
		this.iniciado = iniciado;
	}


	public Usuario getU() {
		return U;
	}


	public void setU(Usuario u) {
		U = u;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public boolean isIniciado() {
		return iniciado;
	}


	public void setIniciado(boolean iniciado) {
		this.iniciado = iniciado;
	}
	public void mostrar(){
		if(this.iniciado==true)
		System.out.println("Sesion Iniciada");
		System.out.println("Usuario "+U.getNombre());
		System.out.println(fecha);
	}
	public void SalirSesion(){
		this.setIniciado(false);
		
	}
	
	
	
}
