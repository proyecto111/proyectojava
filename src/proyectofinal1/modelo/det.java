/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal1.modelo;

/**
 *
 * @author Natu
 */
public class det {
    private String prod;
    private double precio;
    private int cantidad;
    
    
    public det(){
        
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void mostrarDet(){
        System.out.println(this.getProd());
        System.out.println(this.getPrecio());
        System.out.println(this.getCantidad());
    }
    
    
    
    
}
