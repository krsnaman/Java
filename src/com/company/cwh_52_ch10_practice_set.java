package com.company;

class Rectangle {
    private int length;
    private int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int areaOrVolume() {
        return this.length * this.breadth;
    }

    public int perimeterOrSurfaceArea() {
        return 2*(this.length+this.breadth);
    }
}

class Cuboid extends Rectangle {
    private int height;
    Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }
    @Override
    public int areaOrVolume() {
        return super.areaOrVolume()*this.height; // or, super.getLength()*super.getBreadth()*this.height
    }

    @Override
    public int perimeterOrSurfaceArea() {
        return 2*(super.getLength()*super.getBreadth()+this.height*super.getLength()+this.height*super.getBreadth());
    }

}
public class cwh_52_ch10_practice_set {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.areaOrVolume());
        System.out.println(rectangle.perimeterOrSurfaceArea());

        Rectangle cuboid = new Cuboid(5, 10, 20);
        System.out.println(cuboid.areaOrVolume());
        System.out.println(cuboid.perimeterOrSurfaceArea());
    }
}
