/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Date;

public class Caja {
    private int idCaja;
    private Double montoApertura;
    private ArrayList<String> egreso;//siempre el usuario actual lo realiza
    private ArrayList<String> movimiento;//"+"descripcionDeposito"##"jTextFieldNombreUsuario ** "-"descripcionExtraccion"##"jTextFieldNombreUsuario
    private Double monto;
    private Usuario user;
    private String fecha;

    public Caja(Double montoApertura, Usuario user, String fecha){
        this.montoApertura = montoApertura;
        this.movimiento = new ArrayList();
        this.egreso = new ArrayList();
        this.monto= montoApertura;
        this.user = user;
        this.fecha = fecha;
        
    }
    
    public Caja(Double montoApertura, Double monto, String fecha){
        this.montoApertura = montoApertura;
        this.monto= montoApertura;
        this.fecha = fecha;
        
    }
     public void setMontoApertura (Double x){
        this.montoApertura=x;
    }
    public void setMovimiento (ArrayList<String> x){
        this.movimiento =x;
    }
    public void setEgreso (ArrayList<String> x){
        this.egreso =x;
    }
    
    public void setMonto (Double x){
        this.monto=x;
    }
    public void setUsuario (Usuario x){
        this.user=x;
    }
    
    public ArrayList getMovimiento (){
        return this.movimiento;
    }
    public ArrayList getEgreso (){
        return this.egreso;
    }
    public Double getMonto(){
        return this.monto;
    }
    public Usuario getUser(){
        return this.user;
    }
    public Double getMontoApertura (){
        return this.montoApertura;
    }

    public int getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(int idCaja) {
        this.idCaja = idCaja;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
