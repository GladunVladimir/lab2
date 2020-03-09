package ru.spbstu.main;

import ru.spbstu.main.shapes.Circle;
import ru.spbstu.main.shapes.Rectangle;
import ru.spbstu.main.shapes.Triangle;

import ru.spbstu.main.shapes.Shape;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0] = new Circle(1, 1, 100);
        shapes[1] = new Rectangle(1, 2, 3, 4, 5, 6, 7, 8, 0);
        shapes[2] = new Circle(2, 1, 100);
        shapes[3] = new Triangle(0, 2, 10, 10, 1000, 10, 9);
        shapes[4] = new Circle(1, 111, 10);
        shapes[5] = new Circle(1, 22, 11);
        shapes[6] = new Circle(-1, 1, 90);
        shapes[7] = new Circle(-10, 10, 10);
        shapes[8] = new Circle(1, 122, 101);
        shapes[9] = new Circle(1, 2, 102);
        System.out.println(findMaxArea(shapes));
    }

    public static String findMaxArea(Shape[] shapes) {
        ArrayList<Float> areas = new ArrayList<Float>();
        for (Shape s : shapes) {
            areas.add(s.getArea());
        }
        float maxArea = Collections.max(areas);
        int indexOfMaxArea = areas.indexOf(maxArea);
        return String.format("Максимальная площадь фигуры под номером %d is %f", indexOfMaxArea, maxArea);
    }
}