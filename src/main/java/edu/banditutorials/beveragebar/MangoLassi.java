/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author s546985
 */
public abstract class MangoLassi extends Lassi{
    private double glucosecount;
    private double calories;
    private double cost;
    private int quantity;
    

    public MangoLassi(double glucosecount, double calories, double MilkCostPerServing, double SugarcostPerserving, double quantity, double fatContent, String name) {
        super(MilkCostPerServing, SugarcostPerserving, quantity, fatContent, name);
        this.glucosecount = glucosecount;
        this.calories = calories;
    }

    public double getGlucosecount() {
        return glucosecount;
    }

    public void setGlucosecount(double glucosecount) {
        this.glucosecount = glucosecount;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return super.toString()+"MangoLassi{" + "glucosecount=" + glucosecount + ", calories=" + calories + '}';
    }

    @Override
    public double calcPrice() {
        return cost*quantity;
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    @Override
    public String getDescription() {
        return "Tasty"+getName()+"is served cool";
    }

   
    
}
