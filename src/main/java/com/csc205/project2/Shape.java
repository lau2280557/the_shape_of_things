package com.csc205.project2;

public abstract class Shape implements ThreeDimensionalShape {
    private double volume;
    private double surfaceArea;

    public Shape(double volume, double surfaceArea) {
        this.volume = volume;
        this.surfaceArea = surfaceArea;
    }

    public double getVolume() {
        return volume;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "volume=" + volume +
                ", surfaceArea=" + surfaceArea +
                '}';
    }
}
