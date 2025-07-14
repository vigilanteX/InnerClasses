package org.example.AnonymousInnerClass;

//Implement interface using anonymous class
public class Demo2 {
    public static void main(String[] args) {
        IParent iParent = new IParent() {
            @Override
            public void m1() {
                System.out.println("m1");
            }

            @Override
            public void m2() {
                System.out.println("m2");
            }
        };
        iParent.m1();
        iParent.m2();
    }
}
