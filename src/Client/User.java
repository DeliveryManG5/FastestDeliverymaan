/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

/**
 *
 * @author Wei Shen
 */
class User {
    private int foodid;
    private String food, price, image;
    
    public User(int foodid, String food, String price, String image)
    {
        this.foodid=foodid;
        this.food=food;
        this.price=price;
        this.image=image;
    }
    
    public int getfoodid(){
    return foodid;
    }
    
    public String getfood(){
    return food;
    }
    
    public String getprice(){
    return price;
    }
    
    public String getimage(){
    return image;
    }
}
