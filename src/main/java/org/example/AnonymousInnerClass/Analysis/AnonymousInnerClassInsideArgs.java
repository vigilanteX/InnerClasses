package org.example.AnonymousInnerClass.Analysis;

public class AnonymousInnerClassInsideArgs {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName());
                }

            }
        }).start();
    }
}
