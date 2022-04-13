/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author s546518
 */
public class RedBull extends EnergyDrinks{
    
    private double caffine_percentage;
    private double sweetner_percentage;
    private double price;

    public RedBull(double caffine_percentage, double sweetner_percentage,double price, int quantity, String name) {
        super(quantity, name);
        this.caffine_percentage = caffine_percentage;
        this.sweetner_percentage = sweetner_percentage;
    }
    
    
    @Override
    public String calculatePrice() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return "price*quantity";
    }

    @Override
    public String getDescription() {
        return "High instant energy with RedBull";
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
   
   


