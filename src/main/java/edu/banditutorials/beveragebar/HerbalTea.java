/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S546442
 */
public class HerbalTea extends Tea{

    private double price;
    private double quantity;
    private String brand;

    public HerbalTea(double price, double quantity, String brand, String name) {
        super(name);
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
    }

   
    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "HerbalTea{" + "price=" + price + ", quantity=" + quantity + ", brand=" + brand + '}';
    }

    @Override
    public double totalprice() {
        return price*quantity;
    }
    
    @Override
    public String getDescription() {
        return "A cup of tea changes Bitter to Better.";
    }
}
