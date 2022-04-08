package edu.banditutorials.beveragebar;

/**
 *
 * @author YogaNarasimhaReddy Peddireddy
 */
public class Latte extends Coffee {
    
    private static final double MILKCOSTPERSERVING=1.25;
    private static final double WATERCOSTPERSERVING=1;
    private static final double BEANSCOSTPERSERVING=11.85;
    private static final double SUGARCOSTPERSERVING=2;
    private int quantity;
    

    public Latte(int quantity, Boolean isServeredHot, double caffeine,String name) {
        super(isServeredHot, caffeine, name);
        this.quantity = quantity;
    }  
    
    
    @Override
    public double calcPrice() {       
        
        return (MILKCOSTPERSERVING+WATERCOSTPERSERVING+BEANSCOSTPERSERVING+SUGARCOSTPERSERVING)*quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static double getMilkCostPerServing() {
        return MILKCOSTPERSERVING;
    }

    public static double getWaterCostPerServing() {
        return WATERCOSTPERSERVING;
    }

    public static double getBeansCostPerServing() {
        return BEANSCOSTPERSERVING;
    }

    public static double getSugarCostPerServing() {
        return SUGARCOSTPERSERVING;
    }

    
    
    @Override
    public String toString() {
        String out;
        if (super.getIsServeredHot())
        {   
            if (quantity>1)
            out=quantity+" Lattes served hot";
            else
            out="one Latte served hot";
        }
        else
        {
            if (quantity>1)
            out=quantity+" Lattes served cold";
            else
            out="one Latte served cold";
        }
        return out;
    }
    
    
    
    
}