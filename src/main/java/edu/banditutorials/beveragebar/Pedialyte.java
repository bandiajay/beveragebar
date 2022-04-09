/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author Suresh Gopi Tulam
 */
public class Pedialyte extends Electrolyte
{     private String flavor;

    @Override
    public String calcMineralContent() {
        return "Calicum"+ 35 +" % "+" "+"Magnesium"+ 40 + " %";
        }

    @Override
    public String getDescription() {
return "Pedialyte is awesome!!!!";
    }
    public Pedialyte(String flavor, String manufacture, String type, String name) {
        super(manufacture, type, name);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
     

  
    
    
}
