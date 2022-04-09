/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author s547054 Jessica Salome
 */
    public class ClassicMintMojito extends Mojito {

    private double price;
    private String quantity;

    /**
     * @param name
     * @param price
     * @param quantity
     */
    public ClassicMint(String name, double price, String quantity) {
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
    public String getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return "Hii!!";
    }

    @Override
    public double getTotalPrice() {
        return 0.0;
    }
}
    

