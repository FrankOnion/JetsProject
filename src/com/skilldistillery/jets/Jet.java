package com.skilldistillery.jets;

public abstract class Jet {
    private String model;
    private double speed; 
    private int range;   
    private double price;
    // Constructor
    public Jet(String model, double speed, int range, double price, int other) {
        this.model = model;
        this.speed = speed;
        this.range = range;
        this.price = price;
        
    }

    public Jet(String model2, double speed2, int range2, long price2, int range3) {
	}

    public abstract void fly();

    public String getModel() {
        return model;
    }

    public double getSpeed() {
        return speed;
    }

    public int getRange() {
        return range;
    }

    public double getPrice() {
        return price;
    }

    public double calculateFlightTime() {
        return range / speed; 
    }

    @Override
    public String toString() {
        return "Model: " + model + "\n" +
               "Speed: " + speed + " MPH\n" +
               "Range: " + range + " miles\n" +
               "Price: $" + price + "\n" +
               "Flight Time: " + calculateFlightTime() + " hours";
    }
}