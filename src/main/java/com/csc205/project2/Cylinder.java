package com.csc205.project2;


// write a class that passes the CylinderTest tests


public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double height, double radius) {
        super(0, 0);
        this.radius = radius;
        this.height = height;
        setVolume(computeVolume());
        setSurfaceArea(computeSurfaceArea());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        setVolume(computeVolume());
        setSurfaceArea(computeSurfaceArea());
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        setVolume(computeVolume());
        setSurfaceArea(computeSurfaceArea());
    }

    private double computeVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    private double computeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double surfaceArea() {
        return getSurfaceArea();
    }

    public double volume() {
        return getVolume();
    }

    @Override
    public String toString() {
        return "Cylinder {height=" + height + ", radius=" + radius + ", surface area=" + getSurfaceArea() + ", volume=" + getVolume() + "}";
    }
}

