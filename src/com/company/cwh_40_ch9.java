package com.company;

class Circle {
    private int radius;
    private double area;
    private double circumference;

    public void setRadius(int r) {
        this.radius = r;
    }

    public void setArea(double area) {
        double areaOfCircle = 3.14*radius*radius;
        if(area != areaOfCircle) {
            System.out.println("Area of circle being set is not right.");
            return;
        }
        this.area = area;
        System.out.println("Area of circle is " + this.area);
    }
}

public class cwh_40_ch9 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.setArea(78.5);
        circle.setArea(12);
    }

}
