/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S546519
 */
public class HiBallEnergy extends EnergyDrinks {
    
    private double price;

  public HiBallEnergy(double price,int quantity, String name) {
        super(quantity, name);
        this.price = price;
    }

   @Override
    public String calculatePrice() {
        return "price*quantity";
    }

    @Override
    public String getDescription() {
       return "Wild Berry Naturally Flavoured";
    }
}
    




