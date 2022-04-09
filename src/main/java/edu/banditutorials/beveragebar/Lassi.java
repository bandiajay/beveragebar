/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S546961
 */
public abstract class Lassi extends AbstractBeverage{
    
     private double MilkCostPerServing;
    private double SugarcostPerserving;
    private double quantity;
    private double fatContent;

    public Lassi(double MilkCostPerServing, double SugarcostPerserving, double quantity, double fatContent, String name) {
        super(name);
        this.MilkCostPerServing = MilkCostPerServing;
        this.SugarcostPerserving = SugarcostPerserving;
        this.quantity = quantity;
        this.fatContent = fatContent;
    }

    public double getMilkCostPerServing() {
        return MilkCostPerServing;
    }

    public void setMilkCostPerServing(double MilkCostPerServing) {
        this.MilkCostPerServing = MilkCostPerServing;
    }

    public double getSugarcostPerserving() {
        return SugarcostPerserving;
    }

    public void setSugarcostPerserving(double SugarcostPerserving) {
        this.SugarcostPerserving = SugarcostPerserving;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    
    public abstract double calcPrice();
    
    
    @Override
    public String getDescription() {
        return getName()+"Is serverd cold!";
    }

    @Override
    public String toString() {
        return getName()+" has "+fatContent+"% per serving";
    }

    
    
    
    
    
    
    
}
