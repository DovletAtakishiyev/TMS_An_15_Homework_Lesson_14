package com.teachmeskills.lesson14.part_2;

import com.teachmeskills.lesson14.part_2.threads.AdderThread;
import com.teachmeskills.lesson14.part_2.model.Parking;
import com.teachmeskills.lesson14.part_2.threads.ReleaserThread;
import com.teachmeskills.lesson14.part_2.model.RepairShop;

public class Main {
    public static void main(String[] args) {
//        long startTime = System.nanoTime();                       // Block 'A'

        Parking parking = new Parking(30);
        RepairShop sto = new RepairShop();

        Thread threadAdd = new AdderThread(sto, parking);
        Thread threadRelease = new ReleaserThread(sto, parking);

        threadAdd.start();
//        try {                                                     //  Block 'B'
//            threadAdd.join();                                     //
//        } catch (InterruptedException e) {}                       //

        threadRelease.start();

//        try {                                                     //  Block 'C'
//            threadAdd.join();                                     //
//            threadRelease.join();                                 //
//        } catch (InterruptedException e) {}                       //  В блоках (комментариях)
//                                                                  //  A,B,C проверял время выполнения
//        long endTime = System.nanoTime();                         //  программы. Скорость не меняется
//        System.out.println((endTime - startTime) / 1000000000.);  //  от параллельных потоков когда
//                                                                  //  используем синхронный метод
    }
}
