package ru.job4j.ru.job4j.calculator;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        String roundEuro = String.format("%.2f", euro);
        System.out.println("140 rubles are " + roundEuro + " euro.");
        float dollar = Converter.rubleToDollar(180);
        String roundDollar = String.format("%.2f", dollar);
        System.out.println("180 rubles are " + roundDollar + " dollar.");

    }
}
