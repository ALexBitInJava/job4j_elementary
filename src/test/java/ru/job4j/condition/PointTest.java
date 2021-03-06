package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        double expected = 2;
        double out = a.distance(b);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when12to34then1dot41() {
        Point a = new Point(1, 3);
        Point b = new Point(2, 4);
        double expected = 1.41;
        double out = a.distance(b);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when41to42then3dot61() {
        Point a = new Point(4, 4);
        Point b = new Point(1, 2);
        double expected = 3.61;
        double out = a.distance(b);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);

    }

    @Test
    public void when20to20then2dot83() {
        Point a = new Point(2, 2);
        Point b = new Point(0, 0);
        double expected = 2.83;
        double out = a.distance(b);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when333to121then3() {
        Point a = new Point(3, 3, 3);
        Point b = new Point(1, 2, 1);
        double expected = 3.0;
        double out = a.distance3d(b);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }
}