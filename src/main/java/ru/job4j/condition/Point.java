package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int x2, int y1,  int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 5, 4, 9);
        System.out.println("result (2, 4) to (5, 9) " + result);
    }
}
