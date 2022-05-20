package ru.job4j;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Info {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sDF = new SimpleDateFormat("MM.dd.yyyy");
        String test = sDF.format(date);
        System.out.println(test);
    }
}