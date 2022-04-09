/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author Abdul khayyam sahib shaik
 */
public class RaspberryVanillaSoda extends RefreshmentDrinks {

    private double price;
    private int quantity;

    public RaspberryVanillaSoda(double price, int quantity, String name) {
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

    @Override
    public String toString() {
        return "RaspberryVanillaSoda" + " price=" + price + ", quantity=" + quantity;
    }

    @Override
    public String getDescription() {
        return " A light and refreshing raspberry soda flavored with vanilla ";
    }

    @Override
    public double calculatebill() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return price * quantity;
    }

}
