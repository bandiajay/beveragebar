/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author s545550
 */
public abstract OreoShakes extends AbstractShakes {
    
    public double Carbohydrate;

    public OreoShakes(double Carbohydrate, float price, int quantity, String name) {
        super(price, quantity, name);
        this.Carbohydrate = Carbohydrate;
    }

    public double getCarbohydrate() {
        return Carbohydrate;
    }

    public void setCarbohydrate(double Carbohydrate) {
        this.Carbohydrate = Carbohydrate;
    }

    @Override
    public String toString() {
        return super.toString()+"OreoShakes{" + "Carbohydrate=" + Carbohydrate + '}';
    }
    
    @Override
    public double calculatecost(){
        return price*quantity;
    }
    
    @Override
    public String getDescription(){
        return ("Yummy Yummy OreoShake, Served Cool");
    }
    
    
}