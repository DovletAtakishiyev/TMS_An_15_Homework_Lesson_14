package com.teachmeskills.lesson14.part_1;

import com.teachmeskills.lesson14.part_1.threads.BreakfastThread;
import com.teachmeskills.lesson14.part_1.threads.CoffeeRunnable;
import com.teachmeskills.lesson14.part_1.threads.NewspaperRunnable;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<String[]> properties = Arrays.stream(args).map((i)->i.split("=")).toList();

        Thread breakfastThread = new BreakfastThread(properties.get(0));
        Thread newspaperThread = new Thread(new NewspaperRunnable(properties.get(1)));
        Thread coffeeThread    = new Thread(new CoffeeRunnable(properties.get(2)));

        //  First breakfast
        breakfastThread.start();
        breakfastThread.join();
        System.out.println("Breakfast finished");

        // Then reading newspaper and drinking coffee
        newspaperThread.start();
        coffeeThread.start();

        newspaperThread.join();
        System.out.println("Newspaper finished");

        coffeeThread.join();
        System.out.println("Coffee finished");

        System.out.println("----------------------------------------");
        System.out.println(breakfastThread);
        System.out.println(newspaperThread);
        System.out.println(coffeeThread);
    }
}
