/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.banditutorials.beveragebar;

/**
 *@author Tirumala Reddy Hitesh Reddy
 * @author S545131
 */
public class MangoLemonade extends  Lemonade implements LemonadeOrder{

    public MangoLemonade(String name) {
        super(name);
    }

     /**
     * A method to get description
     *
     * @return Returns string
     */
    @Override
    public String getDescription() {
        return "You have selected Mango Lemonade";
    }
     /**
     * A method to print selected quantity
     *
     * @param quantity Number of ordered lemonades
     * @return Returns string
     */

    @Override
    public String getQuantity(int quantity) {
      return "You have ordered " + quantity + " Mango Lemonade";
    }
    
}
