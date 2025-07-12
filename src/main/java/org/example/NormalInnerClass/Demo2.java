package org.example.NormalInnerClass;

public class Demo2 {
    int x = 10;

    class Child2 {
        int x = 100;

        public void m1() {
            int x = 1000;
            //Accessing local member
            System.out.println(x);
            //Accessing Inner class instance member
            System.out.println(this.x);
            //Accessing Outer class instance member
            System.out.println(Demo2.this.x);
        }

    }


    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.new Child2().m1();

    }
}
