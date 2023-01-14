package com.company;

interface Bicycle {
    int speed = 10;
    void applyBrake(int decrement);
    void accelerate(int increment);
}

interface BlowHorn {
    void blowHornPee();
    void blowHornPoo();
}

class AvonCycle implements Bicycle, BlowHorn {

    void blowHorn() {
        System.out.println("Pee Pee");
    }

    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying brakes");
    }

    @Override
    public void accelerate(int increment) {
        System.out.println("Accelerating");
    }

    @Override
    public void blowHornPee() {
        System.out.println("Pee");
    }

    @Override
    public void blowHornPoo() {
        System.out.println("Po");
    }
}

public class cwh_54_interface {
    public static void main(String[] args) {
        AvonCycle avonCycle = new AvonCycle();
        avonCycle.accelerate(1);
        // You can create properties(variables) in interfaces but can't change it as they are final.
        // avonCycle.speed = 1; -> gives error
        Bicycle a = new AvonCycle();
        // a can only call methods defined in the interface Bicycle.
        BlowHorn b = new AvonCycle();
        // b can call methods defined in the interface BlowHorn.
        avonCycle.blowHornPee();
        avonCycle.blowHornPoo();
    }
}
