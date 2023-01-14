package com.company;

class Base {
    private int x;

    public int getX() {
        System.out.println("In the base class");
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        System.out.println("In the derived class");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class cwh_45_inheritance {
    public static void main(String[] args) {

        Base b = new Base();
        b.setX(1);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setX(54);
        System.out.println(d.getX());
        d.setY(2);
        System.out.println(d.getY());
    }
}
