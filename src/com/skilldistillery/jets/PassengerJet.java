package com.skilldistillery.jets;

public class PassengerJet extends Jet {
    private int passengerCapacity;

    public PassengerJet(String model, double speed, int range, double price, int passengerCapacity) {
        super(model, speed, range, price, passengerCapacity); 
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void fly() {
        System.out.println("Passenger Jet Details:");
        System.out.println(this); 
        System.out.println("Passenger Capacity: " + passengerCapacity + " passengers");
        System.out.println("Flying with passengers...");
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}

