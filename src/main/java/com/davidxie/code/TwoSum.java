package com.davidxie.code;

public class TwoSum {
    public static int[] find(final int[] numbers, final int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[i] + numbers[j + i] == target) {
                    return new int[]{i, j + i};
                }
            }
        }

        return new int[]{0, 0};
    }
}
