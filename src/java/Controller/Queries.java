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
    public static void main(String[] args){
        Queries qu = new Queries();
        System.out.println(qu.authentication("alfredo", "1234"));
    }
}
