package com.jilingy.deep.learning.base.test;

public class ThreadDemo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() +" "+ i + "hhhh");
        }
    }

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ",当前数字：" + i);
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ",当前数字：" + i);
            }
        }).start();

        new Thread(new ThreadDemo()).start();
    }
}
