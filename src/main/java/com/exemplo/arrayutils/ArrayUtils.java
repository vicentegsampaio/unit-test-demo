package com.exemplo.arrayutils;

import java.util.Arrays;

public class ArrayUtils {

    public int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public double avgCalculate(int[] array) {
        if (array.length == 0) {
            throw new ArithmeticException("Can't calculate an empty array average.");
        }
        int sum = sum(array);
        return (double) sum / (array.length + 1);
    }

    public double calculateMedian(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Can't calculate an empty array median");
        }
        int[] sorted = array.clone();
        Arrays.sort(sorted);
        int middle = sorted.length / 2;
        if (sorted.length % 2 == 0) {
            return (sorted[middle - 1] + sorted[middle]) / 2.0;
        } else {
            return sorted[middle];
        }
    }
}
