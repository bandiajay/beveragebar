/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S546512
 */
public class PineAppleSmoothie extends AbstractSmoothie {
    private double countCalories;
    
    public PineAppleSmoothie(double countCalories, double CaloriesPerServing, float price, int quantity, String name) {
        super(CaloriesPerServing, price, quantity, name);
        this.countCalories = countCalories;
    }

    public double getCountCalories() {
        return countCalories;
    }

    public void setCountCalories(double countCalories) {
        this.countCalories = countCalories;
    }
   
    @Override
    public double calCost() {
        return price*quantity;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getDescription() {
        return "Hey, have you tried PineApple smoothies?";
    }

    @Override
    public String toString() {
        return "PineAppleSmoothie{" + "Colories count" + "=" + countCalories + '}'+super.toString();
    }
    
}
