package ru.job4j.ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);

    }

    @Test
    public void whenP8K3Square3() {
        double p = 8;
        double k = 3;
        double expected = 3;
        double out = SqArea.square(p, k);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenP10K4Square4() {
        double p = 10;
        double k = 4;
        double expected = 4;
        double out = SqArea.square(p, k);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }
}