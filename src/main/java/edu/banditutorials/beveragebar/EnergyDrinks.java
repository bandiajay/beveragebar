/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author NIKHILA CHOWDARY VAITLA
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
        return "Hi instant energy with RedBull";
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
