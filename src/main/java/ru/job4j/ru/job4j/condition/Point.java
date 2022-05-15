package ru.job4j.ru.job4j.condition;

public class Point {
    public static double distance(int x1, int x2, int y1,  int y2) {
        //для удобства поменял местами x2 и y1.
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 5, 4, 9);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
