package ru.spbstu.main.shapes;

public class Triangle implements Shape, Polygon {

    private distance p1;
    private distance p2;
    private distance p3;
    private int rotation;

    public Triangle(float x1, float y1, float x2, float y2, float x3, float y3, int rotation) {
        this.p1 = new distance(x1, y1);
        this.p2 = new distance(x2, y2);
        this.p3 = new distance(x3, y3);
        this.rotation = rotation;
    }

    @Override
    public float getPerimeter() {
        return (float) 1.0;
    }

    @Override
    public float getArea() {
//    воспользовался формулой площади Гаусса для треугольника
        float add1 = this.p1.getX() * this.p2.getY();
        float add2 = this.p2.getX() * this.p3.getY();
        float add3 = this.p3.getX() * this.p1.getY();
        float add4 = this.p2.getX() * this.p1.getY();
        float add5 = this.p3.getX() * this.p2.getY();
        float add6 = this.p1.getX() * this.p3.getY();
        float result = (float) 0.5 * Math.abs(add1 + add2 + add3 - add4 - add5 - add6);
        return result;
    }

    @Override
    public int getRotation() {
        return this.rotation;
    }

    public void setRotation(int angle) {
        this.rotation = angle;
    }
}
