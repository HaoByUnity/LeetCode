package com.bzh.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class RotateArray {

    @Test
    public void test() {

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 0));
        Assert.assertArrayEquals(new int[]{7, 1, 2, 3, 4, 5, 6}, rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 1));
        Assert.assertArrayEquals(new int[]{6, 7, 1, 2, 3, 4, 5}, rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 2));
        Assert.assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3));
        Assert.assertArrayEquals(new int[]{4, 5, 6, 7, 1, 2, 3}, rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 4));
        Assert.assertArrayEquals(new int[]{3, 4, 5, 6, 7, 1, 2}, rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 5));
        Assert.assertArrayEquals(new int[]{2, 3, 4, 5, 6, 7, 1}, rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 6));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 7));
        Assert.assertArrayEquals(new int[]{2, 1}, rotate(new int[]{1, 2}, 1));
        Assert.assertArrayEquals(new int[]{2, 1}, rotate(new int[]{1, 2}, 3));

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, rotate1(new int[]{1, 2, 3, 4, 5, 6, 7}, 0));
        Assert.assertArrayEquals(new int[]{7, 1, 2, 3, 4, 5, 6}, rotate1(new int[]{1, 2, 3, 4, 5, 6, 7}, 1));
        Assert.assertArrayEquals(new int[]{6, 7, 1, 2, 3, 4, 5}, rotate1(new int[]{1, 2, 3, 4, 5, 6, 7}, 2));
        Assert.assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, rotate1(new int[]{1, 2, 3, 4, 5, 6, 7}, 3));
        Assert.assertArrayEquals(new int[]{4, 5, 6, 7, 1, 2, 3}, rotate1(new int[]{1, 2, 3, 4, 5, 6, 7}, 4));
        Assert.assertArrayEquals(new int[]{3, 4, 5, 6, 7, 1, 2}, rotate1(new int[]{1, 2, 3, 4, 5, 6, 7}, 5));
        Assert.assertArrayEquals(new int[]{2, 3, 4, 5, 6, 7, 1}, rotate1(new int[]{1, 2, 3, 4, 5, 6, 7}, 6));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, rotate1(new int[]{1, 2, 3, 4, 5, 6, 7}, 7));
        Assert.assertArrayEquals(new int[]{2, 1}, rotate1(new int[]{1, 2}, 1));
        Assert.assertArrayEquals(new int[]{2, 1}, rotate1(new int[]{1, 2}, 3));
    }

    public int[] rotate(int[] nums, int k) {

        k =  k % nums.length;

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }

        return result;
    }

    /**
     * 先调换 0 ~ length - k
     * 再调换 length - k  ~ length - 1
     * 再调换 0 ~ length
     */
    public int[] rotate1(int[] nums, int k) {


        return null;
    }

    public int[] rotate2(int[] nums, int k) {
        return null;
    }

}