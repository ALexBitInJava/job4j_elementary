package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, x2, y1, y2);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when12to34then1dot41() {
        int x1 = 1;
        int x2 = 2;
        int y1 = 3;
        int y2 = 4;
        double expected = 1.41;
        double out = Point.distance(x1, x2, y1, y2);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when41to42then3dot61() {
        int x1 = 4;
        int x2 = 1;
        int y1 = 4;
        int y2 = 2;
        double expected = 3.61;
        double out = Point.distance(x1, x2, y1, y2);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);

    }

    @Test
    public void when20to20then2dot83() {
        int x1 = 2;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double expected = 2.83;
        double out = Point.distance(x1, x2, y1, y2);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

}