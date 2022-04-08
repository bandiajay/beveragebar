/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S546553
 */
public class Coke extends CarbonatedBeverages{
    private double cokeExtraPercentage ;
    
 public Coke(double cokeExtraPercentage, String name, double carbonPercent, double waterPercent) {
        super(name, carbonPercent, waterPercent);
        this.cokeExtraPercentage = cokeExtraPercentage;
    }

    @Override
    public String getDescription() {
      
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return "Carbonated Coke is a simple and smooth drink to boost your happiness ";
    }

    public double getCokeExtraPercentage() {
        return cokeExtraPercentage;
    }

    public void setCokeExtraPercentage(double cokeExtraPercentage) {
        this.cokeExtraPercentage = cokeExtraPercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Coke Extract percentage: "+this.getCokeExtraPercentage();
    }

    @Override
    double calcPrice() {
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return 12.75;
    }
    
    
    
    
}
