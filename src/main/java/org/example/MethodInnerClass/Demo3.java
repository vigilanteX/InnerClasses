package org.example.MethodInnerClass;


public class Demo3 {


    private static int x = 10;
    private static int y = 20;

    public static void m1() {
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
        Demo3 demo2 = new Demo3();
        demo2.m1();

    }
}
