package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int rst = -1;
        if (finish < data.length) {
            for (int i = start; i <= data[finish]; i++) {
                if (data[i] == el) {
                    rst = i;
                    break;
                }
            }
        } else {
            System.out.println("Переменная finish > длины массива");
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] data = new int[]{2, 6, 4, 9, 7, 5, 3, 1, 5, 0};
        System.out.println(indexInRange(data, 4, 3, 15));
    }
}
