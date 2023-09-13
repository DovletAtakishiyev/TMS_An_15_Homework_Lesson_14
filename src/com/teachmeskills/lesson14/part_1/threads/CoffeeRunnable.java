package com.teachmeskills.lesson14.part_1.threads;

public class CoffeeRunnable implements Runnable{
    String name;
    Integer priority;

    public CoffeeRunnable(String[] data){
        this.name = data[0];
        this.priority = Integer.parseInt(data[1]);
    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);
        Thread.currentThread().setPriority(priority);

        try {
            for (int i = 5; i >= 0; i--) {
                Thread.sleep(500);
                System.out.println("Drinking coffee - " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
