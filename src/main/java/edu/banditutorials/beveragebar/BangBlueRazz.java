/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author s546444
 */
public class BangBlueRazz extends EnergyDrinks {
    
    private double price;

    public BangBlueRazz(double price,int quantity, String name) {
        super(quantity, name);
        this.price = price; 
    }

   @Override
    public String calculatePrice() {
        return "price*quantity";
    }

    @Override
    public String getDescription() {
       return "Potent Brain and Body Energy with razz flavour";
    }
    
    

    
    }
   
   


