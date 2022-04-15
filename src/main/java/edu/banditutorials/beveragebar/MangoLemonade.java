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

       /**
     * A constructor
     *
     * @param name
     * @param quantity
     */
    public MangoLemonade(String name, int quantity) {
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
        return "You have selected Mango Lemonade";
    }
  
   /**
     * A method to print selected quantity
     *
     * @return Returns string
     */
    @Override
    public String getQuantityStatement() {
        return "ordered " + super.getQuantity();
    }

    /**
     * A method to calculate price
     *
     * @return Return calculated price
     */
    @Override
    public String calculatePrice() {
        return "You have to pay $" + super.getQuantity() * 6;
    }

}

