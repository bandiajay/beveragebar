/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author Ram Reddy
 */
public class PeachSmoothie extends AbstractSmoothie {

    private double Flavour_Extract_By_Volume;

    public PeachSmoothie(double Flavour_Extract_By_Volume, Double CaloriesPerServing, float price, int quantity, String name) {
        super(CaloriesPerServing, price, quantity, name);
        this.Flavour_Extract_By_Volume = Flavour_Extract_By_Volume;
    }

    public double getFlavour_Extract_By_Volume() {
        return Flavour_Extract_By_Volume;
    }

    public void setFlavour_Extract_By_Volume(double Flavour_Extract_By_Volume) {
        this.Flavour_Extract_By_Volume = Flavour_Extract_By_Volume;
    }
    
    @Override
    public double calCost(){
        return price*quantity;
    }
    
    @Override
    public String getDescription() {
        return "Hey, have you tried Peach smoothies?";
    }

    @Override
    public String toString() {
        return "PeachSmoothie{" + "Flavour_Extract_By_Volume=" + Flavour_Extract_By_Volume + '}'+super.toString();
    }
    
}
