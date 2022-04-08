/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author Anjana Thanguturi
 */
public class Lemonade extends AbstractBeverage {

    /**
     * Constructor
     *
     * @param name name of the instance
     */
    public Lemonade(String name) {
        super(name);
    }

    /**
     * A method to get description
     *
     * @return Returns string
     */
    @Override
    public String getDescription() {
        return "Select a lemonade 1.Mango 2.Orange 3.Strawberry 4.Vanilla";
    }

}
