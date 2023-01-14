package com.company;
class Base1 {
    Base1() {
        System.out.println("Constructor of Base1 class");
    }
    Base1(int x) {
        System.out.println("Overloaded Constructor of Base1 class with value of x as " + x);
    }
}
class Derived1 extends Base1 {
    Derived1() {
        System.out.println("Constructor of Derived1 class");
    }
    Derived1(int x, int y) {
        super(x);
        System.out.println("Overloaded Constructor of Derived1 class with value of y as " + y);
    }
}
class ChildOfDerived1 extends Derived1 {
    ChildOfDerived1() {
        System.out.println("Constructor of ChildOfDerived1 class");
    }
    ChildOfDerived1(int x, int y, int z) {
        super(x, y);
        System.out.println("Overloaded Constructor of ChildOfDerived1 class with value of z as " + z);
    }
}
public class cwh_46_constructors_in_inheritance {
    public static void main(String[] args) {
        ChildOfDerived1 childOfDerived1 = new ChildOfDerived1();
        ChildOfDerived1 childOfDerived1_2 = new ChildOfDerived1(1, 2, 3);
    }
}
