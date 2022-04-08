/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S546553
 */
public abstract class CarbonatedBeverages extends AbstractBeverage {
    
  private  double  carbonPercent ;
     private  double  waterPercent;

   
    abstract double calcPrice();
    
    public CarbonatedBeverages(String name, double carbonPercent, double waterPercent ) {
        super(name);
        this.carbonPercent = carbonPercent;
        this.waterPercent = waterPercent;
    }

    public double getCarbonPercent() {
        return carbonPercent;
    }

    public void setCarbonPercent(double carbonPercent) {
        this.carbonPercent = carbonPercent;
    }

    public double getWaterPercent() {
        return waterPercent;
    }

    public void setWaterPercent(double waterPercent) {
        this.waterPercent = waterPercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CarbonatedBeverage\nBeverage Name :"+super.getName()+ "\nCO2 percentage :"+carbonPercent+"\nH2O percentage :"+waterPercent;
    }

  
}
