package com.csc205.project2;


/* write a class that passes the CubeTest tests
* */

public class Cube extends Shape {
    private double sideLength;

    public Cube(double sideLength) {
        super(0, 0);
        this.sideLength = sideLength;
        setVolume(computeVolume());
        setSurfaceArea(computeSurfaceArea());
    }

    public double getWidth() {
        return sideLength;
    }

    public void setWidth(double sideLength) {
        this.sideLength = sideLength;
        setVolume(computeVolume());
        setSurfaceArea(computeSurfaceArea());
    }

    private double computeVolume() {
        return Math.pow(sideLength, 3);
    }

    private double computeSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    public double surfaceArea() {
        return getSurfaceArea();
    }

    public double volume() {
        return getVolume();
    }

    @Override
    public String toString() {
        return "Cube {width=" + sideLength + ", surface area=" + getSurfaceArea() + ", volume=" + getVolume() + "}";
    }
}