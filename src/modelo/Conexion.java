/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DEV - Santiago
 */
public class Conexion {
    
    Connection con=null;
    
    public Connection conexion(){
       try {
           //cargar nuestro driver
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://ctrlmonitoreo.arhena.com.ec:3306/ctrl_monitoreo","monitoreo_root","tfd3mon10re_0");
           System.out.println("conexion establecida");
           //JOptionPane.showMessageDialog(null, "conexion establecida");
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println("error de conexion");
           JOptionPane.showMessageDialog(null, "error de conexion "+e);
       }
       return con;
   }
    
    
   public void cierraConexion() {
    try {
        con.close();
    } catch (SQLException sqle) {
        JOptionPane.showMessageDialog(null, "Error al cerrar conexion", "Error", JOptionPane.ERROR_MESSAGE);
        Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, sqle);
    }
}
   
   //Procesos de Base de datos
   
   
   public ResultSet Operaciones(String query){
       
       try{
           PreparedStatement dataset = con.prepareStatement(query);
           ResultSet result = dataset.executeQuery();   
           return result;
           
       }catch(Exception e){
           
           JOptionPane.showMessageDialog(null , e.getMessage());
           return null;
       }
   } //END PROCESS OPERACION
   
    
    
    
    
    
    
}
