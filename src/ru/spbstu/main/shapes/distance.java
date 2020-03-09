package ru.spbstu.main.shapes;

public class distance implements Point {

    private float X;
    private float Y;

    public distance(float x, float y){
        this.X = x;
        this.Y = y;
    }

    @Override
    public float getX(){
        return this.X;
    }
    @Override
    public float getY(){
        return this.Y;
    }
}
