/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S546292
 */
public class DryFruitLassi extends Lassi{
    private static final double DRYFRUITSCOSTPERSERVING=1;
    
    public DryFruitLassi(double MilkCostPerServing, double SugarcostPerserving, double quantity, double fatContent, String name) {
        super(MilkCostPerServing, SugarcostPerserving, quantity, fatContent, name);
    }

    public static double getDRYFRUITSCOSTPERSERVING() {
        return DRYFRUITSCOSTPERSERVING;
    }
    
       
    @Override
    public double calcPrice() {
        return (DRYFRUITSCOSTPERSERVING+getMilkCostPerServing()+getSugarcostPerserving())*getQuantity();
    }

    
    
    
    
}
