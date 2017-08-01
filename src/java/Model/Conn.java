/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alfredo
 */
public class Conn {
    
    private Connection con;
    private String database = "gourtmaps";
    private String host = "localhost";
    private String password = "";
    private String port = "3306";
    private String username = "root";
    private String className = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://"+host+":"+port+"/"+database;
    
    public Conn(){
        try {
            Class.forName(className);
            con = DriverManager.getConnection(url, username, password);
        }
        catch(ClassNotFoundException e){
            System.err.println("ERROR"+e);
        }
        catch(SQLException e){
            System.err.println("ERROR"+e);
        }   
    }
    
    public Connection getConnection(){
        return con;
    }
    
    public static void main(String[] args) {
        Conn con = new Conn();
    }

}
