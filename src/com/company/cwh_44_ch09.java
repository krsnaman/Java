package com.company;

class Cylinder {
    private int radius;
    private int height;

    public Cylinder() {
        this.radius = 4;
        this.height = 5;
    }

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double area() {
        return 2 * Math.PI * this.radius * (this.radius + this.height);
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}
public class cwh_44_ch09 {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.area());
        System.out.println(cylinder.volume());
        cylinder.setHeight(10);
        cylinder.setRadius(5);
        cylinder = new Cylinder(5, 10);
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.area());
        System.out.println(cylinder.volume());
    }
}
