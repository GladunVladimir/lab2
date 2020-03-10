package ru.spbstu.main.shapes;

import java.lang.Math;
import ru.spbstu.main.shapes.distance;

public class Circle implements Ellipse {

    private double rad;
    protected distance p1;

    public Circle(float x1, float y1, double radius) {
        this.p1 = new distance(x1, y1);
        this.rad = radius;
    }

    public float getArea() {
        return (float) (Math.PI * Math.pow(this.rad, 2.0));
    }

    @Override
    public int getRotation() {
        return 0;
    }

    @Override
    public float getPerimeter() {
        return 0;
    }

    @Override
    public void setRotation(int angle) {
    }

    public float getLength()
    {
        return (float) (2 * Math.PI * this.rad);
    }
}