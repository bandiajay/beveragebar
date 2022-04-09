/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author s546444
 */
public abstract class EnergyDrinks extends AbstractBeverage {
    
    private int quantity;

    public EnergyDrinks(int quantity, String name) {
        super(name);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
    public abstract String calculatePrice();   
  
}

