/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author NIKHILA CHOWDARY VAITLA
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
