/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Conexion {
    private String username = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306/proyectousuario";
    private String classname = "com.mysql.jdbc.Driver";
    private Connection con;
    
    public Conexion(){
        try {
            Class.forName(classname);
            con = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (SQLException el){
            System.out.println("Error: " + el);
        }
    }
    
    public Connection getConexion(){
        return con;
    }    
}
