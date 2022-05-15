package ru.job4j.ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        //Допишите метод square, используя три формулы для h, l и s.
        //2. Доработайте метод main с демонстрацией работы программы с параметрами p = 6, k = 2, площадь должна быть 2.
        //h = p / (2 * (k + 1)); l = h * k;ns = l * h; p = 2 * h * (k + 1);
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);

    }
}
