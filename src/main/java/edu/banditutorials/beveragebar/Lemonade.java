/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author Anjana Thanguturi
 */
public abstract class Lemonade extends AbstractBeverage {

    private int quantity;

    /**
     * Constructor
     *
     * @param name name of the instance
     */
    public Lemonade(String name) {
        super(name);
    }

    /**
     * A method to get quantity
     *
     * @return Returns quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * A method to set quantity
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * A method to calculate price
     *
     * @return Returns calculated price
     */
    public abstract String calculatePrice();

}
