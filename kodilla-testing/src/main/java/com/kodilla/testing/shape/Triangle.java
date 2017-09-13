package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private double base;
    private double altitude;

    public Triangle(double base, double altitude) {
        this.base = base;
        this.altitude = altitude;
    }

    @Override
    public String getShapeName(){
        return Triangle.class.getName();
    }

    @Override
    public double getField(){
        return base * altitude / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.base, base) != 0) return false;
        return Double.compare(triangle.altitude, altitude) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(base);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(altitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
