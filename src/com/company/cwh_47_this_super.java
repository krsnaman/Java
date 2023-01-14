package com.company;

class A {
    int a;

    A() {
        System.out.println("A's constructor");
    }

    public void print() {
        System.out.println(this.a);
        System.out.println("A's print class executed");
    }
}

class B extends A {
    int b;
    B() {
        System.out.println("B's constructor");
        this.printB();
        super.print();
    }

    public void printB() {
        System.out.println(super.a);
        System.out.println("B's print class executed");
    }
}

public class cwh_47_this_super {
    public static void main(String[] args) {
        B b = new B();
    }
}
