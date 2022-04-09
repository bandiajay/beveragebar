/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.banditutorials.beveragebar;

/**
 *
 * author @Shanmukha Sriharsha Kalluri
 */
public class DragonFruitSmoothie extends AbstractSmoothie{

    public DragonFruitSmoothie(double CaloriesPerServing, float price, int quantity, String name) {
        super(CaloriesPerServing, price, quantity, name);
    }

    @Override
    public double calCost() {
        return price*quantity;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getDescription() {
        return "Hey, have you tried Dragon Fruit smoothies?";
    }

    @Override
    public String toString() {
        return "Dragon Fruit Smoothie" +super.toString();
    }

    
    
}
