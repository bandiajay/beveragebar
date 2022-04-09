/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author Ravichandrika Annadanam - S545547 
 */
public class VanillaLemonade extends Lemonade implements LemonadeOrder {

    /**
     * A constructor
     *
     * @param name
     * @param quantity
     */
    public VanillaLemonade(String name, int quantity) {
        super(name);
        super.setQuantity(quantity);
    }

    /**
     * A method to get description
     *
     * @return Returns string
     */
    @Override
    public String getDescription() {
        return "You have selected Vanilla Lemonade";
    }

    /**
     * A method to print selected quantity
     *
     * @return Returns string
     */
    @Override
    public String getQuantityStatement() {
        return "You have ordered " + super.getQuantity() + " Vanilla Lemonade";
    }

    /**
     * A method to calculate price
     *
     * @return Return calculated price
     */
    @Override
    public String calculatePrice() {
        return "Your have to pay $" + super.getQuantity() * 2;
    }

}
