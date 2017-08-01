/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Controller.RestaurantsController;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Alfredo
 */
public class Restaurant extends Conn{
    
    public boolean save(RestaurantsController rc){
        PreparedStatement pst = null;
        ResultSet rs = null;
        boolean flag = false;
        try{
            String sql ="call insertRestaurant(?.?.?.?.?.?.?.?)";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, rc.getName());
            pst.setString(2,rc.getAddress1());
            pst.setString(2,rc.getAddress2());
            pst.setInt(3,rc.getCity());
            pst.setInt(4,rc.getCategory());
            pst.setFloat(5, rc.getLatitude());
            pst.setFloat(6, rc.getLongitude());
            pst.setString(6, rc.getReviews());
            if(pst.executeUpdate()== 1){
                flag = true;
            }
        }   
        catch(Exception e){
             System.err.println("ERROR"+e);
        }
        finally{
            try{
                if(getConnection()==null){
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
                System.err.println("Error"+e);
            }
        }
        return flag;
    }
    
}
