package org.example.AnonymousInnerClass.Analysis;


class T1 extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}


public class ThreadClassNormalVsAnonymous {
    public static void main(String[] args) {

        T1 t1 = new T1();

        for (int j = 0; j < 10; j++) {
            System.out.println(Thread.currentThread().getName() + " " + j);

        }
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 10; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        };
        t2.start();
        t1.start();


    }
}
