/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author Aishwarya Mallela
 */
public class StrawberryMojito extends Mojito{
    private double quantity;
    private double price;
     
    public StrawberryMojito(String name,double quantity,double price){
        super(name);
        this.quantity=quantity;
        this.price=price;
   
    }
    
    public double getQuantity(){
        return quantity;
    }
    
     public double getPrice(){
        return price;
    }
   
     
    @Override
    public double getTotalPrice(){
        return price*quantity;
    }
    
    @Override
    public String getDescription(){
        return "with a total cost of: $";
    }
}
