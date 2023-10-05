package org.example;

public class Drink {
    protected String name;
    protected double volume;




    public Drink(String name, double volume) {
        this.name = name;
        this.volume = volume;

    }

    public String getName() {
        return name;
    }


    public double getVolume() {
        return volume;
    }




    @Override
    public String toString() {
        return "Drink{"   + name + ", volume=" + volume + '}';
    }
}

