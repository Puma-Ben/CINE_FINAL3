/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bababooey
 */
public class Conexion {
    
    Connection conexion = null;
    private static final String driver=("com.mysql.jdbc.Driver");
    private static final String URL = "jdbc:mysql://localhost/prueba"; //url de la base de datos y base de datos
    private static final String USUARIO = "puma";
    private static final String PASS = "root";
    
    
    //establecer la conexion
    
    public static Connection obtenerConexion(){
        try{
            return DriverManager.getConnection(URL, USUARIO, PASS);
            
        }catch (SQLException e){
            throw new RuntimeException ("error al establecer conexion con la BD");
        
    }
    }
    
}
