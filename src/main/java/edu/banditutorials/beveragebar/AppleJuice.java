/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S546833
 */
public class AppleJuice  extends Juice{
    
    public AppleJuice(String name)
    {
        super(name);
    }
    
    @Override
    public String getDescription() {
        return "a delicious glass of Apple Juice, served cold.";
    }
    
    @Override
    public String juiceCost() {
        return "The Cost of Apple Juice of 250 ml is 30$";
    }
    
    
    
    
    
}
