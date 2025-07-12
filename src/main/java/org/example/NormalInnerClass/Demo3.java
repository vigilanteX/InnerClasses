package org.example.NormalInnerClass;

class P {
    int x=10;
    class C1 {
        int x=100;
        class C2 {
            int x=1000;
            public void m1() {
                int x=10000;
                System.out.println("m1");
                System.out.println(x);
                System.out.println(C2.this.x);
                System.out.println(C1.this.x);
                System.out.println(P.this.x);

            }
        }

    }
}


public class Demo3 {
    public static void main(String[] args) {
        P p = new P();
        p.new C1().new C2().m1();
    }
}
