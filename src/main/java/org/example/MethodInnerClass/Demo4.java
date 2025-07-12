package org.example.MethodInnerClass;

public class Demo4 {
    public void m1() {
        int x = 10;
        class Child4 {
            public void m2() {
                System.out.println(x);
            }

        }
        Child4 child4=new Child4();
        child4.m2();
    }


    public static void main(String[] args) {

        Demo4 demo4=new Demo4();
        demo4.m1();
    }
}
