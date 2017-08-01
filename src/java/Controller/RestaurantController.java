/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.RestaurantModel;
import Include.Restaurant;

/**
 *
 * @author Alfredo
 */
public class RestaurantController {
    public boolean store(Restaurant r){
        RestaurantModel rm = new RestaurantModel();
        return rm.save(r);
    }
}

