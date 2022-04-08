/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author s546443
 */
public class BlueBerriesSmoothie extends AbstractSmoothie{
    private double Flavour_Extract_By_Percentage;

    public BlueBerriesSmoothie(double Flavour_Extract_By_Volume, double CaloriesPerServing,
        float price, int quantity, String name) {
        super(CaloriesPerServing, price, quantity, name);
        this.Flavour_Extract_By_Percentage = Flavour_Extract_By_Volume;
    }

    public double getFlavour_Extract_By_Percentage(){ 
        return Flavour_Extract_By_Percentage;
    }

    public void setFlavour_Extract_By_Volume(double Flavour_Extract_By_Percentage) {
        this.Flavour_Extract_By_Percentage = Flavour_Extract_By_Percentage;
    }
    

    @Override
    public double calCost() {
        return price*quantity;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String getDescription() {
        return "Hey, have you tried Blueberries?";
    }

    @Override
    public String toString() {
        return "BluberriesSmoothie{" + "Flavour_Extract_By_Volume=" + Flavour_Extract_By_Volume + '}'+super.toString();
    }
    
}
