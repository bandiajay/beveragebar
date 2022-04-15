/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author s546964 Vamsidhar reddy
 */
public class CoconutMojito extends Mojito {

    private double price;
    private double quantity;

    /**
     * @param name
     * @param price
     * @param quantity
     */
    public CoconutMojito(String name,double quantity, double price) {
        super(name);
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @param quantity
     */
    public void setQuantity(double quantity) {
        this.price = price;

    }

    /**
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return quantity
     */
    public double getQuantity() {
        return quantity;
    }

    @Override
    public String getDescription() {
        return "with a total cost of: $";
    }

    @Override
    public double getTotalPrice() {
        return price*quantity;
  
    }
}
