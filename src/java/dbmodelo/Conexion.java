/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmodelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author niels
 * 
 */
public class Conexion {
   
    Connection miConexion;
    Statement miStatement;
    ResultSet miResultSet;
    
    public Conexion() throws SQLException, ClassNotFoundException
    {
        Class.forName("com.mysql.jdbc.Driver");
        this.miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaparqueo?serverTimezone=UTC","root","");
        this.miStatement = miConexion.createStatement();
    }
    
    public ResultSet resultados(String id) throws SQLException
    {
        
        miResultSet = miStatement.executeQuery("SELECT * FROM vehiculo WHERE No_placa='"+id+"'");
        
        return miResultSet;
    }
    
    public void agregar(String q) throws SQLException
    {
        
        miStatement.executeUpdate(q);
        
    }
    
    public void actualizar(String q) throws SQLException
    {
       // String q="UPDATE example SET nombre=\""+nombre+"\",appellido=\""+apellido+"\" WHERE id=\""+id+"\"";
        miStatement.executeUpdate(q);
    }
    
    public void borrar(String q) throws SQLException
    {
        
        miStatement.executeUpdate(q);
    }
    
    
  
}
