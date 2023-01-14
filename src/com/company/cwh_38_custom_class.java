package com.company;

class Employee1 {
    int id;
    String name;
    int salary;

    public void printDetails() {
        System.out.println("Id is "+ id);
        System.out.println("and name is "+ name);
    }

    public int getSalary() {
        return salary;
    }
}
public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 harry = new Employee1();
        harry.id=12;
        harry.name="CodeWithHarry";
        harry.salary=34;

        Employee1 john = new Employee1();
        john.id=17;
        john.name="John Cena";
        john.salary=12;

//        System.out.println(harry.id);
//        System.out.println(harry.name);

        harry.printDetails();
        System.out.println("and salary is "+ harry.getSalary());
        john.printDetails();
        System.out.println("and salary is "+ john.getSalary());
    }
}
