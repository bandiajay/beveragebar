/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S546555
 */

    
public class Gingerale extends CarbonatedBeverages {
    private double cornSyrupPercentage ;

    public Gingerale(double cornSyrupPercentage, String name, double carbonPercent, double waterPercent) {
        super(name, carbonPercent, waterPercent);
        this.cornSyrupPercentage = cornSyrupPercentage;
    }

   @Override
    public String getDescription() {
      
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return "Gingerale is a simple and smooth drink to boost your happiness ";
    }

    public double getCornsyrupPercentage() {
        return this.cornSyrupPercentage;
    }
public void setCornsyrupPercentage(double cornSyrupPercentage) {
        this.cornSyrupPercentage = cornSyrupPercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   //@Override
    public String toString() {
        return super.toString()+"\n Cornsyrup percentage: "+this.getCornsyrupPercentage();
    }

    @Override
    double calcPrice() {
       
        return 24.00;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}