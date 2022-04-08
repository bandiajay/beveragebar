/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S546757
 */
public class StrawberryShake extends AbstractShakes {
    
    public double glucoseContent;


    public StrawberryShake(double glucoseContent, float price, int quantity, String name) {
        super(price, quantity, name);
        this.glucoseContent = glucoseContent;
    }

    public double getGlucoseContent() {
        return glucoseContent;
    }

    public void setGlucoseContent(double glucoseContent) {
        this.glucoseContent = glucoseContent;
    }

    @Override
    public String toString() {
        return super.toString()+ "glucoseContent= " + glucoseContent ;
    }

    @Override
    public String getDescription() {
        return("Yummy Yummy Strawberryshakes"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
        
    
    
    
    
    @Override
    public double calculatecost() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return price * quantity;
    }
    
   
    
}
