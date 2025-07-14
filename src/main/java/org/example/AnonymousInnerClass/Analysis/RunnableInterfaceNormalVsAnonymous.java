package org.example.AnonymousInnerClass.Analysis;


class R implements Runnable {

    @Override
    public void run() {
        for (int j = 0; j < 10; j++) {
            System.out.println(Thread.currentThread().getName());

        }
    }
}


public class RunnableInterfaceNormalVsAnonymous {
    public static void main(String[] args) {
        Thread thread = new Thread(new R());
        thread.start();
        for (int j = 0; j < 10; j++) {
            System.out.println(Thread.currentThread().getName());
        }


        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 10; j++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        };
        Thread thread2 = new Thread(r2);
        thread2.start();

    }
}
