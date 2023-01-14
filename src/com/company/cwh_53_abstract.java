package com.company;
abstract class Parent {
    abstract public void greet();
    public void greetGA() {
        System.out.println("Gd Afternoon");
    }
}
class Child1 extends Parent {
    @Override
    public void greet() {
        System.out.println("Good morning!!!");
    }

    @Override
    public void greetGA() {
        System.out.println("Good Afternoon");
    }
}
abstract class Child2 extends Parent {
}
public class cwh_53_abstract {
    public static void main(String[] args) {
        // Parent p = new Parent(); ---> error because Parent is an abstract class, and we can't create its object.
        Child1 c1 = new Child1();
        c1.greet();
        c1.greetGA();
        Parent p = new Child1(); // We can create reference to an abstract class and object of the concrete subclass.
        p.greet();
        // Child2 c2 = new Child2(); ---> error because Child2 is also an abstract class, and we can't create its object.
    }
}
