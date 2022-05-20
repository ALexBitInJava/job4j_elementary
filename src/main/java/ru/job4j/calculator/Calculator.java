package ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        six -= 5;
        System.out.println(six);
        System.out.println(plus(100, 500));
        System.out.println(plus(4, 2));
        System.out.println(plus(3, 5));
        int count = plus(1, 2);
    }

    public static int plus(int first, int second) {
        return first + second;
    }
}
