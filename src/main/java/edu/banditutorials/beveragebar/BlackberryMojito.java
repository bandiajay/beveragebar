/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S546947
 */
public class BlackberryMojito {
    private double price;
    private string quantity;
    private int calories;
    
    //constructor
    public BlackberryMojito(double price,string quantity, int calories ){
        this.price=price;
        this.quantity=quantity;
        this.calories=calories;
    }
    
    //setter
    public void setPrice(double price){
        this.price=price;
    }
    public void setQuantity(string quantity){
        this.quantity=quantity;
    }
    public void setCalories(int calories){
        this.calories=calories;
    }
    
    //getter
    public double getPrice(){
        return price;
    }
    public string getQuantity(){
        return quantity;
    }
    public int getCalories(){
        return calories;
    }
    
    //getter abstract
    public abstract double getTotalPrice();
}
