package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {20, 40, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {11, 20, 40};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf6elements() {
        int[] data = new int[] {13, 9, 11, 17, 18, 12};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {9, 11, 12, 13, 17, 18};
        Assert.assertArrayEquals(expected, result);

    }
}