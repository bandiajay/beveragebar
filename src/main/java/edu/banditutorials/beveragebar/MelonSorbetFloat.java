/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author Anudeep Somarouthu
 */
public class MelonSorbetFloat extends RefreshmentDrinks {
    private float price;
private int quantity;



public MelonSorbetFloat(float price, int quantity, String name) {
super(name);
this.price = price;
this.quantity = quantity;
}



public float getPrice() {
return price;
}



public void setPrice(float price) {
this.price = price;
}



public int getQuantity() {
return quantity;
}



public void setQuantity(int quantity) {
this.quantity = quantity;
}



public String getName() {
return name;
}



public void setName(String name) {
this.name = name;
}



@Override
public String toString() {
return super.toString()+"price= s" + price + "quantity= " + quantity + '}';
}




@Override
public double calculatebill() {
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
return price * quantity;
}
    
}
