package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double expected = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double out = Point.distance(x1, x2, y1, y2);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when12to34then1dot4142135623730951() {
        int x1 = 1;
        int x2 = 2;
        int y1 = 3;
        int y2 = 4;
        double expected = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double out = Point.distance(x1, x2, y1, y2);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when41to42then3dot605551275463989() {
        int x1 = 4;
        int x2 = 1;
        int y1 = 4;
        int y2 = 2;
        double expected = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double out = Point.distance(x1, x2, y1, y2);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
        System.out.println(out);
    }

    @Test
    public void when20to20then2dot8284271247461903() {
        int x1 = 2;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double expected = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double out = Point.distance(x1, x2, y1, y2);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }
}