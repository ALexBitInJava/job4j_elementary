package ru.job4j.condition;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Greeting {

    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea += "But I am a newbie.";
        Date date = new Date();
        SimpleDateFormat dateYear = new SimpleDateFormat("yyyy");
        String test = dateYear.format(date);
        idea += test;
        System.out.println(idea);
    }
}