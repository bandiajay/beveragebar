/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author s544100
 */
public class LMNT extends Electrolyte{
    private double calories;

    @Override
    public String calcMineralContent() {
        
     //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      return "Sodium"+ 16 +"%"+" "+"Magnesium"+ 29 + " %";
    }
    

    @Override
    public String getDescription() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return "LMNT are used to treat dehydration";
    }

    public LMNT(double calories, String manufacture, String type, String name) {
        super(manufacture, type, name);
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
      @Override
    public String getManufacture() {
        return manufacture;
    }
      
    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
    
    @Override

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
      @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    
}
    

