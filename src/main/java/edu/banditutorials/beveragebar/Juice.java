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
public abstract class Juice  extends AbstractBeverage{
    
    public Juice(String name)
    {
      super(name);  
    }
    public abstract  String juiceCost();
    
  
    
}
