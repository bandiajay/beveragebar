/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S546959
 */
public class Essentia extends Electrolyte {
    private int price;
    
    

   @Override
    public String calcMineralContent() {
        
     //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      return "Sodium"+ 30 +"%"+" "+"potassium"+ 50 + " %";
    }
    

    @Override
    public String getDescription() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return "ORS are used to treat dehydration";
    }
    
 public Essentia(int price, String manufacture, String type, String name) {
        super(manufacture, type, name);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price= price;
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


   