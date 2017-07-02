/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Alfredo
 */
public class Queries extends Conn {
    public boolean authentication (String username, String password){
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            pst = getConnection().prepareStatement(query);
            pst.setString(1,username);
            pst.setString(2,password);
            rs = pst.executeQuery();
            if(rs.absolute(1)){
                return true;
            }
        }
        catch(Exception e){
             System.err.println("ERROR"+e);
        }
        finally{
            try{
                if(getConnection() != null){
                    getConnection().close();
                }
                if(pst != null){
                    pst.close();
                }
                if(rs != null){
                    rs.close();
                }
                
            }
            catch(Exception e){
                System.err.println("ERROR"+e);
            }
        }
        return false;
    }
    public boolean register(String firstName, String lastName, String email, String userName, String password){
        PreparedStatement pst = null;
        try{
           
            String query = "INSERT INTO users(firstname,lastname,email,username,password) VALUES(?,?,?,?,?)";
            pst = getConnection().prepareStatement(query);
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, email);
            pst.setString(4, userName);
            pst.setString(5, password);
            if(pst.executeUpdate() == 1){
                return true;
            }
        }
        catch(Exception e){
            System.err.print("Error"+e);
        }
        finally{
            try{
                if(getConnection()!=null){
                    getConnection().close();
                }
                if(pst != null){
                    pst.close();
                }
            }
            catch(Exception e){
                 System.err.println("ERROR"+e);
            }
        }
        return false;
    }
    public static void main(String[] args){
        Queries qu = new Queries();
        System.out.println(qu.register("Gabriela", "Rodriguez","gabriela33@gmail.com","mariga","1234"));
        //System.out.println(qu.authentication("alfrassvetdam90", "alfrassvetdam90"));
    }
}
