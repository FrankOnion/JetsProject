package com.skilldistillery.jets;

public class CargoJet extends Jet implements CargoCarrier {
    private double cargoCapacity; // Cargo capacity in tons

    public CargoJet(String model, double speed, int range, double price, double cargoCapacity) {
        super(model, speed, range, price, range); // Call the constructor of the parent class (Jet)
        this.cargoCapacity = cargoCapacity;
    }

	
    @Override
    public void fly() {
        System.out.println("Cargo Jet Details:");
        System.out.println(this); 
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
        System.out.println("Flying with cargo...");
    }
    @Override
    public void loadCargo() {
        System.out.println("Loading cargo into the Cargo Jet...");
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}

