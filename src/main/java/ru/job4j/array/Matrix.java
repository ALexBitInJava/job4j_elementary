package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                array[i][k] = (i + 1) * (k + 1);
            }
        }
        return array;
    }

}
