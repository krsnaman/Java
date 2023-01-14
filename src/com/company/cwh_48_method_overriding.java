package com.company;

class ClassA {
    void meth() {
        System.out.println("Method of ClassA is called.");
    }
    void meth2() {
        System.out.println("Method2 of ClassA is called.");
    }
}

class ClassB extends ClassA {
    @Override
    public void meth() {
        System.out.println("Method of ClassB is called.");
    }
}
public class cwh_48_method_overriding {
    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.meth();
        b.meth2();
    }
}
