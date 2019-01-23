/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal1.modelo;

import java.util.Date;

/**
 *
 * @author PC..
 */
public class Envase {
    private String idEnvase;
    private Date fechaElab;
    private Date fechaVenc;
    private String Descripcion;

    public Envase(String idEnvase, Date fechaElab, Date fechaVenc, String Descripcion) {
        this.idEnvase = idEnvase;
        this.fechaElab = fechaElab;
        this.fechaVenc = fechaVenc;
        this.Descripcion = Descripcion;
    }

    public String getIdEnvase() {
        return idEnvase;
    }

    public void setIdEnvase(String idEnvase) {
        this.idEnvase = idEnvase;
    }

    public Date getFechaElab() {
        return fechaElab;
    }

    public void setFechaElab(Date fechaElab) {
        this.fechaElab = fechaElab;
    }

    public Date getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(Date fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    
    
    
    
    
    
    
    
}

