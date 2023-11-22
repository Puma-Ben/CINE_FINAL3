/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author benja
 */
public class Conexion {
    public static Connection getConexion() {
        String url = "jdbc:oracle:thin:@localhost:1521/xe"; // Reemplaza "nombreDeSID" con el SID de tu base de datos Oracle
        String usuario = "connecion_escritorio";
        String contraseña = "test_123";

        try {
            Connection conx = DriverManager.getConnection(url, usuario, contraseña);
            return conx;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
