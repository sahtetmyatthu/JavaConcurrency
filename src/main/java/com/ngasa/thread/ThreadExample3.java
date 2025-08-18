package com.ngasa.thread;

public class ThreadExample3 {

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("MyRunnable is running");
            System.out.println("MyRunnable is finished");
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
