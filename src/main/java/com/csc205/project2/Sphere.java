package com.csc205.project2;

public class Sphere extends Shape {

    private double radius;

    public Sphere(double radius) {
        super(0, 0);
        this.radius = radius;
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

    private double computeVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    private double computeSurfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    public double surfaceArea() {
        return getSurfaceArea();
    }

    public double volume() {
        return getVolume();
    }

    @Override
    public String toString() {
        return "Sphere {radius=" + radius + ", surface area=" + getSurfaceArea() + ", volume=" + getVolume() + "}";
    }
}