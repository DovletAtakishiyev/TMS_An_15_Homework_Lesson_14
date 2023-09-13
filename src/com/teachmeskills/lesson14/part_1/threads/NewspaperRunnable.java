package com.teachmeskills.lesson14.part_1.threads;

public class NewspaperRunnable implements Runnable{
    String name;
    Integer priority;

    public NewspaperRunnable(String[] data){
        this.name = data[0];
        this.priority = Integer.parseInt(data[1]);
    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);
        Thread.currentThread().setPriority(priority);

        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println("Reading newspaper - " + i);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
