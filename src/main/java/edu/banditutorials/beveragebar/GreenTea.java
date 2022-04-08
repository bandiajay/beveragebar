/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author Ram Reddy. Boppidi
 */
public class GreenTea extends Tea {
    
    private String brand;
    private double price;
    private int quantity ;

    public GreenTea(String brand, double price, int quantity, String name) {
        super(name);
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    /*public String getName() {
        return name;
    }*/

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    @Override
    public String toString() {
        return super.getName()+", "+"brand=" + brand + ", price=" + price + ", quantity=" + quantity ;
    }
    
    @Override
    public double totalprice(){
        return price*quantity;
    }

    @Override
    public String getDescription() {
        return "A cup of tea is a cup of peace.";
    }

    
    
    
}
