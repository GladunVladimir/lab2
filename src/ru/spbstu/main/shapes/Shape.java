package ru.spbstu.main.shapes;

public interface Shape {

    float getArea();

    default int getRotation(){
        return 0;
    }

    float getLength();

    float getPerimeter();

    public void setRotation(int angle);
}