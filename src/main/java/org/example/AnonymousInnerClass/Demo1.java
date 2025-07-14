package org.example.AnonymousInnerClass;
//Extend class using anonymous class
public class Demo1
{
    public static void main(String[] args)
    {
        Parent parent1=new Parent(){
            @Override
            public void getAge() {
                System.out.println("getage overided");
            }

        };
        Parent parent2=new Parent(){
            @Override
            public void getAge() {
                System.out.println("getage overided");
            }

        };

        Parent parent3=new Parent();
//        parent.getAge();
//        parent.getName();
        System.out.println(parent1.getClass().getName());
        System.out.println(parent2.getClass().getName());
        System.out.println(parent3.getClass().getName());


    }
}
