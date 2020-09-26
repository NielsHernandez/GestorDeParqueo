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
    
     public ResultSet getRegistroData(String id) throws SQLException
    {
        
        ResultSet miResultSet1 = miStatement.executeQuery("SELECT * FROM registro WHERE No_placa='"+id+"' AND Estado='Ocupado'");
        
        return miResultSet1;
    }
     
      public int getTarifa(String id_nivel) throws SQLException
    {
        int tarifa = 0;
        
        ResultSet miResultSet1 = miStatement.executeQuery("SELECT * FROM nivel WHERE Id_nivel='"+id_nivel+"'");
        
        while (miResultSet1.next()) {
            
            tarifa=Integer.parseInt(miResultSet1.getString("Tarifa"));
        }
        
        return tarifa;
    }
      
     
      public int contarRegistro(String nombreTabla,String campo) throws SQLException
    {
        
        ResultSet miResultSet2 = miStatement.executeQuery("SELECT COUNT("+campo+") AS total FROM "+nombreTabla+";");
        int contador=0;
        while (miResultSet2.next()) {
            
            contador=Integer.parseInt(miResultSet2.getString("total"));
        }
        
        return contador;
    }
      
         public String sumarRegistro(String campo,String nombreTabla) throws SQLException
    {
        
        ResultSet miResultSet2 = miStatement.executeQuery("SELECT SUM("+campo+") AS total FROM "+nombreTabla+";");
       String salida="";
       while(miResultSet2.next())
       {
            salida = miResultSet2.getString("total");
       }
           // select SUM(Salario) as total from empleado
            
        
        
        return salida;
    }
      
     
    
      public ResultSet getTablaData(String tableName) throws SQLException
    {
        
        miResultSet = miStatement.executeQuery("SELECT * FROM "+tableName+"");
        
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
