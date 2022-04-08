/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S546515
 */
public class ORS extends Electrolyte {
    
    private String flavor;

    @Override
    public String calcMineralContent() {
        
     //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      return "Calicum"+ 20 +" % "+" "+"Magnesium"+ 30 + " %";
    }
    

    @Override
    public String getDescription() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return "ORS are used to treat dehydration";
    }

    public ORS(String flavor, String manufacture, String type, String name) {
        super(manufacture, type, name);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
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
