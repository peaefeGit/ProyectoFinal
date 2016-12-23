/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author Pedro
 */
public class Movimiento {
   
    private int idMovimiento;
    private double monto;  
    private String responsable;
    private String descripcion;
    private Date fecha;
    private String proveedor;
    private String tipo;
    
   

    
    public Movimiento(double monto, String responsable, String descripcion , Date fecha, String proveedor, String tipo) {
        this.monto = monto;
        this.responsable = responsable;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }
    
   

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
