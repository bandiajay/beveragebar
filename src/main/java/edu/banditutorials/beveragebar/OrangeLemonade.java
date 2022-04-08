/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author SRAVANI NALLA
 */
public class OrangeLemonade extends Lemonade implements LemonadeOrder{

    public OrangeLemonade(String name) {
        super(name);
    }
    
    /**
     * A method to get description
     *
     * @return Returns string
     */
    @Override
    public String getDescription() {
        return "You have selected Orange Lemonade";
    }

    /**
     * A method to print selected quantity
     *
     * @param quantity Number of ordered lemonades
     * @return Returns string
     */
    
    @Override
    public String getQuantity(int quantity) {
       return "You have ordered " + quantity + " Orange Lemonade";
    }
    
}
