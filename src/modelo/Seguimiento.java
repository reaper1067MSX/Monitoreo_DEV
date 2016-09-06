/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;



/**
 *
 * @author DEV - Santiago
 */
public class Seguimiento {
    
    //Atributos
    private String empresa;
    private Date fecha;
    private int n_aprobado;
    private int n_rechazo;
    private String tipo_doc;
    
    //SET & Gets ======================================================
    
    public void setEmpresa(String emp){
        this.empresa = emp;
    }
    
    public String getEmpresa(){
        return this.empresa;
    }
    
    public void setFecha(Date fec){
        this.fecha = fec;
    }
    
    public Date getFecha(){
        return this.fecha;
    }
    
    public void setAprobado(int numero){
        this.n_aprobado = numero;
    }
    
    public int getAprobado(){
        return this.n_aprobado;
    }
    
    public void setRechazado(int numero){
        this.n_rechazo = numero;
    }
    
    public int getRechazado(){
        return this.n_rechazo;
    }
    
    public void setTipo_doc(String doc){
        this.tipo_doc = doc;
    }
    
    public String getTipo_doc(){
        return this.tipo_doc;
    }
    
    
    
    
}
