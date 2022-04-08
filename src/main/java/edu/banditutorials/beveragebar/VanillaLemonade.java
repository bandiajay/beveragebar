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
     * Constructor
     *
     * @param name name of the instance
     */
    public VanillaLemonade(String name) {
        super(name);
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
     * @param quantity Number of ordered lemonades
     * @return Returns string
     */
    @Override
    public String getQuantity(int quantity) {
        return "You have ordered " + quantity + " Vanilla Lemonade";
    }
}
