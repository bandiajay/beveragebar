/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S545554
 */
public class MonsterEnergy extends EnergyDrinks {
    
    private double price;

  public MonsterEnergy(double price,int quantity, String name) {
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
