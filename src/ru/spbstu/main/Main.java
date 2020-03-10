package ru.spbstu.main;

import ru.spbstu.main.shapes.Circle;
import ru.spbstu.main.shapes.Rectangle;
import ru.spbstu.main.shapes.Triangle;

import ru.spbstu.main.shapes.Shape;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Shape[] shape = new Shape[10];
        shape[0] = new Circle(1, 1, 5);
        shape[1] = new Rectangle(1, 2, 3, 4, 5, 6, 7, 8, 2);
        shape[2] = new Triangle(0, 2, 10, 10, 1000, 10, 9);
        shape[3] = new Circle(1, 1, 5);
        shape[4] = new Rectangle(1, 2, 3, 4, 5, 6, 7, 8, 3);
        shape[5] = new Triangle(0, 2, 10, 10, 1000, 10, 9);
        shape[6] = new Circle(1, 1, 5);
        shape[7] = new Rectangle(1, 2, 3, 4, 5, 6, 7, 8, 4);
        shape[8] = new Triangle(0, 2, 10, 10, 1000, 10, 9);
        shape[9] = new Circle(1, 243, 21);
        System.out.println(findMaxArea(shape));

        for (int i =0; i <= 9; i++) {
            System.out.println("-------------------");
            System.out.println("Фигура номер " + i);
            System.out.println("Периметр");
            System.out.println(shape[i].getPerimeter());
            System.out.println("Площадь");
            System.out.println(shape[i].getArea());
            System.out.println("Длина окружности");
            System.out.println(shape[i].getLength());
            System.out.println("-------------------");
        }
    }

    public static String findMaxArea(Shape[] shapes) {
        ArrayList<Float> areas = new ArrayList<>();
        for (Shape s : shapes) {
            areas.add(s.getArea());
        }
        float maxArea = Collections.max(areas);
        int indexOfMaxArea = areas.indexOf(maxArea);
        return String.format("Максимальная площадь фигуры под номером %d is %f", indexOfMaxArea, maxArea);
    }
}