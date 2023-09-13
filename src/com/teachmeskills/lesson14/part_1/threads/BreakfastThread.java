package com.teachmeskills.lesson14.part_1.threads;

public class BreakfastThread extends Thread{
    public BreakfastThread(String[] data){
        super.setName(data[0]);
        super.setPriority(Integer.parseInt(data[1]));
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println("Eating breakfast - " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
