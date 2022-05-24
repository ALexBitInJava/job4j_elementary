package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void whenMax2To3To4Then4() {
        int left = 2;
        int right = 3;
        int bottom = 4;
        int result = Max.max(left, right, bottom);
        int expected = 4;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void whenMax4To5To6To7Then7() {
        int left = 4;
        int right = 5;
        int bottom = 6;
        int top = 7;
        int result = Max.max(left, right, bottom, top);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To1Then5() {
        int left = 5;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void whenMax3To7Then7() {
        int left = 3;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(result, expected);

    }
}