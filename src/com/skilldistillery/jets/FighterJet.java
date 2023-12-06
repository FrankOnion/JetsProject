package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {
    private int missileCount;

    public FighterJet(String model, double speed, int range, double price, int missileCount) {
        super(model, speed, range, price, missileCount);
        this.missileCount = missileCount;
    }

    @Override
    public void fly() {
        System.out.println("Fighter Jet Details:");
        System.out.println(this); 
        System.out.println("Missile Count: " + missileCount);
        System.out.println("Engaging in combat maneuvers...");
    }

   
    @Override
    public void fight() {
        System.out.println("Fighter Jet is ready to engage in combat!");
        System.out.println("Launching missiles...");
    }

    public int getMissileCount() {
        return missileCount;
    }

    public void setMissileCount(int missileCount) {
        this.missileCount = missileCount;
    }
}

