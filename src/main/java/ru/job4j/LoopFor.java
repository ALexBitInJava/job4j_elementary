package ru.job4j;

public class LoopFor {
    public static void main(String[] args) {
        int i;
        boolean result11;
        for (i = 5; result11 = i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Индекс после цикла равен: " + i);
        System.out.println("Условие выполнения цикла равно: " + result11);
    }
}
