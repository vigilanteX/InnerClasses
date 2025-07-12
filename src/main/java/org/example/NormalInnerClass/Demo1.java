package org.example.NormalInnerClass;

public class Demo1 {
    private int x=10;
    private static int y=122;

    class Demo2Child {
        public void m1() {
            System.out.println(x);
            System.out.println(y);

        }
    }

    public static void main(String[] args) {
        //Important case here we are accessing static variable in inner class, not tobe confused with
        //previous cases in those we mentioned that in inner class we cannot mention static fields
        Demo1 demo1 = new Demo1();
        demo1.new Demo2Child().m1();

    }

}
