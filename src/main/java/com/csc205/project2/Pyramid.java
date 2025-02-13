package com.csc205.project2;

//write a class that passes the pyramid tests
public class Pyramid extends Shape {
    private double baseLength;
    private double height;

    public Pyramid(double baseLength, double height) {
        super(0, 0);
        this.baseLength = baseLength;
        this.height = height;
        setVolume(computeVolume());
        setSurfaceArea(computeSurfaceArea());
    }

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
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
        return (1.0 / 3.0) * Math.pow(baseLength, 2) * height;
    }

    private double computeSurfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(height, 2) + Math.pow(baseLength / 2, 2));
        return Math.pow(baseLength, 2) + 2 * baseLength * slantHeight;
    }

    public double surfaceArea() {
        return getSurfaceArea();
    }

    public double volume() {
        return getVolume();
    }

    @Override
    public String toString() {
        return "Pyramid {baseLength=" + baseLength + ", height=" + height + ", surface area=" + getSurfaceArea() + ", volume=" + getVolume() + "}";
    }
}