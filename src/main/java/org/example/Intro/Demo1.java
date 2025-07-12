package org.example.Intro;

public class Demo1
{
    public class Child
    {
        public void greet()
        {
            System.out.println("Hello!");
        }
    }

    public static void main(String[] args) {
        /*
        * Accessing inner class code from Outer class static method
        * */
        Demo1 demo1=new Demo1();
        Demo1.Child child=demo1.new Child();
        child.greet();

        //Another way
        Demo1.Child child2=new Demo1().new Child();
        child2.greet();

        //Another way
        new Demo1().new Child().greet();
    }
}
