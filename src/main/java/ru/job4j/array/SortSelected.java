package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }

//    public static void main(String[] args) {
//        int[] data = new int[] {3, 4, 1, 2, 5};
//        int min = MinDiapason.findMin(data, 0, data.length - 1);
//        System.out.println(min);
//        System.out.println(FindLoop.indexInRange(data, min, 0+1, data.length - 1));
//    }
}
