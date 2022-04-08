/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author Anudeep somarouthu
 */
public abstract class RefreshmentDrinks extends AbstractBeverage {
    public RefreshmentDrinks(String name) {
super(name);
}



public String getName() {
return name;
}



public void setName(String name) {
this.name = name;
}



@Override
public String getDescription(){
return "Refreshment in every sip";
}

public abstract double calculatebill();
    
}
