package ru.job4j.ru.job4j.converter;

import java.util.Locale;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int valueRub = 140;
        float euro = Converter.rubleToEuro(valueRub);
        System.out.println("140 rubles are " + euro + " euro.");

        float in = valueRub;
        float expected = valueRub / 70;
        float out = Converter.rubleToEuro(valueRub);
        boolean passed = expected == out;
        //System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println(String.format(Locale.ROOT, "%.0f rubles are %.1f. Test result : %b", in, expected, passed)); //пробник

        float valueRub2 = 180;
        float dollar = Converter.rubleToDollar(valueRub2);
        System.out.println("180 rubles are " + dollar + " dollar.");

        float in2 = valueRub2;
        float expected2 = valueRub2 / 60;
        float out2 = Converter.rubleToDollar(valueRub2);
        boolean passed2 = expected2 == out2;
        System.out.println(String.format(Locale.ROOT, "%.0f rubles are %.1f. Test result : %b", in2, expected2, passed2));
    }
}
