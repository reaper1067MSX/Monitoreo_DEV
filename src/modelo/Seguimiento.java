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
    private int id;
    private String empresa;
    private Date fecha;
    private int n_procesado;
    private int n_rechazo;
    private String tipo_doc;
    
    //SET & Gets ======================================================
    
    public void setID(int x){
        this.id = x;
    }
    
    public int getID(){
        return this.id;
    }
    
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
    
    public void setProcesado(int numero){
        this.n_procesado = numero;
    }
    
    public int getProcedo(){
        return this.n_procesado;
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
    
    
    public void to_String(){
        
        
        
        
        
    }
    
    
    
    
    
    
    
}
