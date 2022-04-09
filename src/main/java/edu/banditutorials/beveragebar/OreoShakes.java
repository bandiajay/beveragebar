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
    
private double CarbohydrateCount;


public OreoShakes(double CarbohydrateCount, double price, double quantity, String name) {
        super(price, quantity, name);
        this.CarbohydrateCount = CarbohydrateCount;
    }

    public double getCarbohydrateCount() {
        return CarbohydrateCount;
    }

    public void setCarbohydrateCount(double CarbohydrateCount) {
        this.CarbohydrateCount = CarbohydrateCount;
    }

    @Override
    public String toString() {
        return super.toString()+"OreoShakes{" + "CarbohydrateCount=" + CarbohydrateCount + '}';
    }

    
    @Override
    public double calculatecost(){
        return price*quantity;
    }
    
    
}
