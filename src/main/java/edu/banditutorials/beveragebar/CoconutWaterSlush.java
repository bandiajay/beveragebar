/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author Kankanalapalli,Nikitha Srivyshnavi
 */
public class CoconutWaterSlush extends RefreshmentDrinks{
    
    private double price;
    private int quantity;

    public CoconutWaterSlush(double price, int quantity, String name) {
        super(name);
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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
    public double calculatebill() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public String toString() {
        return "CoconutWaterSlush{" + "price=" + price + ", quantity=" + quantity + '}';
    }
    
    
    @Override
    public String getDescription() {
        return " A cocunut water slush ";

}
}
