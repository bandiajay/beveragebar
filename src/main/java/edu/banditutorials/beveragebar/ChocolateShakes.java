/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author s546664
 */
public abstract class ChocolateShakes extends AbstractShakes {
    
    public double ProteinCount;

    public ChocolateShakes(double ProteinCount, float price, int quantity, String name) {
        super(price, quantity, name);
        this.ProteinCount = ProteinCount;
    }

    public double getProteinCount() {
        return ProteinCount;
    }

    public void setProteinCount(double ProteinCount) {
        this.ProteinCount = ProteinCount;
    }

    @Override
    public String toString() {
        return super.toString()+"ChocolateShakes{" + "ProteinCount=" + ProteinCount + '}';
    }
    
    @Override
    public double calculatecost(){
        return price*quantity;
    }
    
    
}
