/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author Aishwarya Mallela
 */
public abstract class Mojito extends AbstractBeverage{
    
    public Mojito(String name) {
        super(name);
    }
    
    public abstract double getTotalPrice();
}
