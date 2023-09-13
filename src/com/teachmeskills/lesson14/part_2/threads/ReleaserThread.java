package com.teachmeskills.lesson14.part_2.threads;

import com.teachmeskills.lesson14.part_2.model.Parking;
import com.teachmeskills.lesson14.part_2.model.RepairShop;

public class ReleaserThread extends ControllerThread{
    public ReleaserThread(RepairShop sto, Parking parkingLot){
        this.sto = sto;
        this.parkingLot = parkingLot;
    }

    @Override
    public void run() {
        for (int i = 0; i < parkingLot.size(); i++) {
            sto.releaseCar();
        }
    }
}
