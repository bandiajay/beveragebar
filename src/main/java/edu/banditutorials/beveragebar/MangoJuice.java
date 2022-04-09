/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S546900
 */
public class MangoJuice extends Juice{

    public MangoJuice(String name)
    {
        super(name);
    }
    
    @Override
    public String juiceCost() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return "The Cost of Mango Juice of 250 ml is 35$";
    }

    @Override
    public String getDescription() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return "Happiness is having a chilled mango juice in summers";
    }
    
    
    
}
