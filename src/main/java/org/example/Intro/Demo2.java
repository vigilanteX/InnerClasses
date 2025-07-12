package org.example.Intro;

/*
 * Accessing inner class code from Outer class instance area
 * */
public class Demo2 {
    public class Child2 {
        public void greet() {
            System.out.println("Hello! from Child2");
        }
    }

    public void m1() {
        Child2 child2 = new Child2();
        child2.greet();

    }

    public static void main(String[] args) {

        Demo2 demo2 = new Demo2();
        demo2.m1();
    }
}
