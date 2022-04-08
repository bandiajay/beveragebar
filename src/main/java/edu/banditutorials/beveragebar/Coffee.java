package edu.banditutorials.beveragebar;

/**
 * Custom class for regular hot coffee.
 * 
 * @author Ajay Bandi
 */
public abstract class Coffee extends AbstractBeverage{

    private Boolean isServeredHot;
    private double caffeine;

    public Coffee(Boolean isServeredHot, double caffeine,String name) {
        super(name);
        this.isServeredHot = isServeredHot;
        this.caffeine = caffeine;
    }

    public Coffee(String name) {
        super(name);
    }

    public Boolean getIsServeredHot()  {
        return isServeredHot;
    }

    public void setIsServeredHot(Boolean isServeredHot) {
        this.isServeredHot = isServeredHot;
    }

    public double getCaffeine() {
        return caffeine;
    }

    public void setCaffeine(double caffeine) {
        this.caffeine = caffeine;
    }
    
    public String getHealthSafety()
    {
        if (caffeine>70)
            return "Its adviced to consume less";
        else 
            return "Canffeine content in limits";
    }
        
    public abstract double calcPrice();
    

    @Override
    public String getDescription() {
        return "a delicious cup of coffee is severd.";
    }
    
}
