package com.company;

class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class Cellphone {
    public void ringing() {
        System.out.println("Ringing");
    }
    public void vibrate() {
        System.out.println("Vibrating");
    }
}

class Square {
    int side;
    public void setSide(int s) {
        side = s;
    }
    public int calcArea() {
        return side*side;
    }
    public int calcPerimeter() {
        return 4*side;
    }
}


public class cwh_39_ch8ps {
    public static void main(String[] args) {
        //prob 1
        System.out.println("\nProb 1");
        Employee harry = new Employee();
        harry.salary = 34;
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());

        //prob2
        System.out.println("\nProb 2");
        Cellphone apple = new Cellphone();
        apple.ringing();
        apple.vibrate();

        //prob3
        System.out.println("\nProb 3");
        Square s = new Square();
        s.setSide(5);
        System.out.println(s.calcArea());
        System.out.println(s.calcPerimeter());

    }
}
