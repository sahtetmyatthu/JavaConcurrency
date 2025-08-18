package com.ngasa.thread;

public class ThreadExample4 {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable is running");
                System.out.println("Runnable is finished");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

    }
}
