package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to5() {
        int[] input = {1, 2, 3, 4, 6, 9};
        int source = 2;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 6, 4, 3, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to10() {
        int[] input = {3, 1, 6, 2, 8, 4, 7, 5, 0};
        int source = 3;
        int dest = input.length - 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {3, 1, 6, 4, 8, 2, 7, 5, 0};
        Assert.assertArrayEquals(expected, result);
    }
}