package com.teachmeskills.lesson14.part_2.model;

import java.util.Map;

public class RepairShop {
    public static final int MAX_CAPACITY = 20;
    public int currentCarInRepair = 0;

    synchronized public void addCar(Car car){
        while (currentCarInRepair >= MAX_CAPACITY){
            try {
                wait();
            }catch (InterruptedException e){/**/}
        }

        try{
            Thread.sleep(50);
        } catch (InterruptedException e) {/**/}

        currentCarInRepair++;
        System.out.println("Car " + car.id + " is repairing [" + currentCarInRepair + "/" + MAX_CAPACITY + "]");

        notify();
    }

    synchronized public void releaseCar(){
        while (currentCarInRepair < 1){
            try {
                wait();
            }catch (InterruptedException e){/**/}
        }

        try{
            Thread.sleep(50);
        } catch (InterruptedException e) {/**/}

        currentCarInRepair--;
        System.out.println("Car was fixed [" + currentCarInRepair + "/" + MAX_CAPACITY + "]");
        notify();
    }
}
