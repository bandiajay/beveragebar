/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author Aakanksha Sunkireddy S546902
 */
public class ButterscotchShake extends AbstractShakes {
    private double calorieCount;

    public ButterscotchShake(double calorieCount, float price, int quantity, String name) {
        super(price, quantity, name);
        this.calorieCount = calorieCount;
    }

    public double getCalorieCount() {
        return calorieCount;
    }

    public void setCalorieCount(double calorieCount) {
        this.calorieCount = calorieCount;
    }

    
    @Override
    public String getDescription() {
        return("Enjoy ButterScotch Milkshake!!"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
       
    @Override
    public double calculatecost() {
        return price*quantity;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String toString() {
        return super.toString()+"Butter Scotch Shake{" + "Calorie Count=" + calorieCount + '}';
    }
    
}
