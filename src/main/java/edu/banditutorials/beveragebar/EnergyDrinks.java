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
public class EnergyDrinks extends AbstractBeverage {
    
    private String drinkName;
    private String originCountry;
    private String companyName;

    public EnergyDrinks(String drinkName, String originCountry, String companyName, String name) {
        super(name);
        this.drinkName = drinkName;
        this.originCountry = originCountry;
        this.companyName = companyName;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    
    @Override
    public String toString() {
        return drinkName + " " + originCountry + " " + companyName;
    }
    
    @Override
    public String getDescription() {
        return "a jar of energy drink for instant energy.";
    }
  
}

    

