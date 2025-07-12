package org.example.Intro;
/*
 *Accessing inner class code from Outside of outer class
 * */

class OuterDemo {
    class InnerDemo {
        public void greet() {
            System.out.println("hello! greet");
        }
    }
}

public class Demo3 {
    public static void main(String[] args) {
        OuterDemo outerDemo=new OuterDemo();
        outerDemo.new InnerDemo().greet();
    }

}
