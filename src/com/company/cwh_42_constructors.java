package com.company;

class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee() {
        this.id = 1;
        this.name = "CodeWithHarry";
    }

    public MyMainEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
public class cwh_42_constructors {
    public static void main(String[] args) {
        MyMainEmployee myMainEmployee = new MyMainEmployee(12, "ProgrammingWithHarry");
        System.out.println(myMainEmployee.getId());
        System.out.println(myMainEmployee.getName());
    }
}
