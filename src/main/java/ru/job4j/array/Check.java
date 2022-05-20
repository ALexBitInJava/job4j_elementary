package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        int count = 0;
        for (boolean datum : data) {
            if (data[0] == datum) {
                count++;
            }
        }
        return count == data.length;
    }
}
