package ru.spbstu.main.shapes;

public class Rectangle implements Polygon, Shape {

    public distance p1;
    private distance p2;
    private distance p3;
    private distance p4;
    protected int rotation;

    public Rectangle(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4, int rotation) {
        this.p1 = new distance(x1, y1);
        this.p2 = new distance(x2, y2);
        this.p3 = new distance(x3, y3);
        this.p4 = new distance(x4, y4);
        this.rotation = rotation;
    }

    @Override
    public float getPerimeter()
    {
        return (float) 1.1;
    }

    @Override
    public void setRotation(int angle) {
        this.rotation = angle;
    }

    @Override
    public float getArea() {
        float add1 = this.p1.getX() * this.p2.getY();
        float add2 = this.p2.getX() * this.p3.getY();
        float add3 = this.p3.getX() * this.p4.getY();
        float add4 = this.p4.getX() * this.p1.getY();
        float add5 = this.p2.getX() * this.p1.getY();
        float add6 = this.p3.getX() * this.p2.getY();
        float add7 = this.p4.getX() * this.p3.getY();
        float add8 = this.p1.getX() * this.p4.getY();
        return (float) 0.5 * Math.abs(add1 + add2 + add3 + add4 - add5 - add6 - add7 - add8);
    }

    @Override
    public int getRotation() {
        return 1;
    }

    @Override
    public float getLength() {
        return 0;
    }
}
