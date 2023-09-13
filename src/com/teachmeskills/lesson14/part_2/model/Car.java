package com.teachmeskills.lesson14.part_2.model;

public class Car {
    int id;
    boolean fixed;
    static int carCount;

    public Car(){
        fixed = false;
        id = carCount;
        carCount++;
    }

    @Override
    public String toString() {
        return "car " + id + (fixed ? " is fixed" : " not fixed");
    }
}
