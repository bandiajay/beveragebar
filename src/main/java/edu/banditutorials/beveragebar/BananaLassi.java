/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S545153
 */
public class BananaLassi extends Lassi {
    
    private static final double BANANAESSENSECOSTPERSERVING=1;
    
    public BananaLassi(double MilkCostPerServing, double SugarcostPerserving, double quantity, double fatContent, String name) {
        super(MilkCostPerServing, SugarcostPerserving, quantity, fatContent, name);
    }

    public static double getBANANAESSENSECOSTPERSERVING() {
        return BANANAESSENSECOSTPERSERVING;
    }
    @Override
    public double calcPrice() {
        return (BANANAESSENSECOSTPERSERVING+getMilkCostPerServing()+getSugarcostPerserving())*getQuantity();
        }
    
    
}
