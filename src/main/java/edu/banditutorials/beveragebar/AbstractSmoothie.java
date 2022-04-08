/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author Ram Reddy
 */
public abstract class AbstractSmoothie extends AbstractBeverage {
    
    public double CaloriesPerServing;
    public float price;
    public int quantity;


    public AbstractSmoothie(Double CaloriesPerServing, float price, int quantity, String name) {
        super(name);
        this.CaloriesPerServing = CaloriesPerServing;
        this.price = price;
        this.quantity = quantity;
    }

    public Double getCaloriesPerServing() {
        return CaloriesPerServing;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setCaloriesPerServing(Double CaloriesPerServing) {
        this.CaloriesPerServing = CaloriesPerServing;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return super.getName()+", "+"AbstractSmoothie{" + "CaloriesPerServing=" + CaloriesPerServing + ", price=" + price + ", quantity=" + quantity + '}';
    }

    @Override
    public String getDescription() {
        return "Wrap your day right with smoothies.";
    }
    
    public abstract double calCost();
    
}
