/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author Kiran Kumar Gundapuneni
 */
public class Sprite extends CarbonatedBeverages {
    private double naturalLemonPercentage ;

    public Sprite(double naturalLemonPercentage, String name, double carbonPercent, double waterPercent) {
        super(name, carbonPercent, waterPercent);
        this.naturalLemonPercentage = naturalLemonPercentage;
    }

    @Override
    public String getDescription() {
      
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return "Sprite is a simple and smooth drink to boost your happiness ";
    }

    public double getNaturalLemonPercentage() {
        return this.naturalLemonPercentage;
    }

    public void setNaturalLemonPercentage(double naturalLemonPercentage) {
        this.naturalLemonPercentage=naturalLemonPercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString()+"\n naturalLemonPercentage : "+this.getNaturalLemonPercentage();
    }

    @Override
    double calcPrice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
