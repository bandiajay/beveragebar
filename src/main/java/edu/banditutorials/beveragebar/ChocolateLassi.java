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
public class ChocolateLassi extends Lassi{
    
  private static final double CHOCOESSENSECOSTPERSERVING=2;

    public static double getCHOCOESSENSECOSTPERSERVING() {
        return CHOCOESSENSECOSTPERSERVING;
 
    }
    
        
    @Override
    public double calcPrice() {
        return (CHOCOESSENSECOSTPERSERVING+getMilkCostPerServing()+getSugarcostPerserving())*getQuantity();
        }
    
    
}
