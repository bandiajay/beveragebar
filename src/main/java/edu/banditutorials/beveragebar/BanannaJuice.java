/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S545534(Srilatha Vunnam)
 */
public class BanannaJuice extends Juice{

    public BanannaJuice(String name) {
        super(name);
    }

    @Override
    public String juiceCost() {
       if(name == "bananna")
       {
           return "5.5";
       }
       else
       {
           return "0.0";
       }
    }
    

    @Override
    public String getDescription() {
        if(name == "bananna")
        {
            return "Bananas are high in the electrolyte potassium, which is crucial for sending nerve signals around the body. We lose potassium when we sweat and this is what can lead to us seizing up and cramping";
        }
        else
        {
            return "ur are not at right place";
        }
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
