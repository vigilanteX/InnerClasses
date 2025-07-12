package org.example.MethodInnerClass;


public class Demo2 {


    private int x = 10;
    private int y = 20;

    public void m1() {
        class Inner {
            public void m2() {
                System.out.println(x);
                System.out.println(y);
            }
        }
        Inner i = new Inner();
        i.m2();
    }


    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.m1();

    }
}
