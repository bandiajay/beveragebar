/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banditutorials.beveragebar;

/**
 *
 * @author S546757
 */
public abstract class AbstractShakes extends AbstractBeverage {
    public float price;
    public int quantity;

   
    public AbstractShakes(float price, int quantity, String name) {
        super(name);
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String getDescription(){
        return "a delicious shake, served cold.";
    }

    @Override
    public String toString() {
        return "price=" + price + "quantity=" + quantity ;
    }
    
    
    
    
    public abstract double calculatecost();
}
