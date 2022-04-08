/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S546442
 */
public class PurpleTea extends Tea{
    private double quantity;
    private double price;
    private String brand;


    public PurpleTea(double quantity, double price, String brand, String name) {
        super(name);
        this.quantity = quantity;
        this.price = price;
        this.brand = brand;
    }

   

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return super.getName()+", "+"PurpleTea{" + "quantity=" + quantity + ", price=" + price + ", brand=" + brand + '}';
    }

    @Override
    public double totalprice(){
        return price*quantity;
    }
    
    @Override
    public String getDescription() {
        return "A cup of tea makes everything better.";
    }
    
}
