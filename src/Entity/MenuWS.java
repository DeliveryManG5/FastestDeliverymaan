/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import static javafx.scene.input.KeyCode.T;
import ADT.ListInterface;
import ADT.LListWS;

/**
 *
 * @author Wei Shen
 * 
 * 
 */

public class MenuWS {

    private String foodid, food, price, restaurantName;

    public MenuWS(String foodid, String food, String price, String restaurantName) {
        this.foodid = foodid;
        this.food = food;
        this.price = price;
        this.restaurantName = restaurantName;
    }

    public String getFoodid() {
        return foodid;
    }

    public String getFood() {
        return food;
    }

    public String getPrice() {
        return price;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setFoodid(String foodid) {
        this.foodid = foodid;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    @Override
    public String toString() {
        return "Menu{" + "foodid=" + foodid + ", food=" + food + ", price=" + price + ", restaurantName=" + restaurantName + '}';
    }
    
    
    
       

   
    }

