/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author s546664
 */
public abstract class OreoShakes extends AbstractShakes {
    
private double carbohydrateCount;

    public OreoShakes(float price, int quantity, String name, double carbohydrateCount ) {
        super(price, quantity, name);
        this.carbohydrateCount = carbohydrateCount;  
    }
    
    public double getCarbohydrateCount() {
        return carbohydrateCount;
    }

    public void setCarbohydrateCount(double CarbohydrateCount) {
        this.carbohydrateCount = CarbohydrateCount;
    }

    @Override
    public String toString() {
        return super.toString()+"OreoShakes{" + "CarbohydrateCount=" + carbohydrateCount + '}';
    }

    
    @Override
    public double calculatecost(){
        return price*quantity;
    }
    
    
}
