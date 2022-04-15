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
public class BlackberryMojito extends Mojito {

    private double price;
    private double quantity;

    /**
     * @param name
     * @param price
     * @param quantity
     */
    public BlackberryMojito(String name, double quantity, double price ) {
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
