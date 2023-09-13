package com.teachmeskills.lesson14.part_2.model;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    public List<Car> cars = new ArrayList<>();

    public Parking(int n){
        for (int i = 0; i < n; i++)
            cars.add(new Car());
    }

    public int size(){
        return cars.size();
    }

    @Override
    public String toString() {
        return cars.toString();
    }
}
