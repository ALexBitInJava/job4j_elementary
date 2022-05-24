package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int bottom) {
        return max(left, max(right, bottom));
    }

    public static int max(int left, int right, int top, int bottom) {
        return max(left, max(right, max(top, bottom)));
    }
}
