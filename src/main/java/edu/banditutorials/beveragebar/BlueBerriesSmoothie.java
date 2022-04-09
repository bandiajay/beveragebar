/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author Naina Sahiri s546443
 */
public class BlueBerriesSmoothie extends AbstractSmoothie{
    private double flavourExtract;

    public BlueBerriesSmoothie(double flavourExtract, double CaloriesPerServing,
            float price, int quantity, String name) {
        super(CaloriesPerServing, price, quantity, name);
        this.flavourExtract = flavourExtract;
    }

    public double getFlavourExtract() {
        return flavourExtract;
    }

    public void setFlavourExtract(double flavourExtract) {
        this.flavourExtract = flavourExtract;
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
        return "Bluberries Smoothie{" + "Flavour Percentage=" + flavourExtract + '}'+super.toString();
    }
    
}
