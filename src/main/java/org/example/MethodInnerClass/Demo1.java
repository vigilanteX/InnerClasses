package org.example.MethodInnerClass;


public class Demo1 {

    public void m1() {
        class Inner {
            public void m1(int x, int y) {
                System.out.println(x + y);
            }
        }
        Inner i = new Inner();
        i.m1(1, 2);
        i.m1(1, 22);
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.m1();
    }
}
