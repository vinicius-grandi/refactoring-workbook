package com.vinicius_grandi.chapter3;

public class Matcher {
    public boolean match(int[] expected, int[] actual, int clipLimit, int delta) {
        if (isArrLengthDifferent(expected, actual)) return false;
        clipLargeValues(actual, clipLimit);
        return !isValueOutDelta(expected, actual, delta);
    }

    private static boolean isValueOutDelta(int[] expected, int[] actual, int delta) {
        for (int i = 0; i < actual.length; i++)
            if (Math.abs(expected[i] - actual[i]) > delta) return true;
        return false;
    }

    private static void clipLargeValues(int[] actual, int clipLimit) {
        for (int i = 0; i < actual.length; i++)
            if (actual[i] > clipLimit) actual[i] = clipLimit;
    }

    private static boolean isArrLengthDifferent(int[] expected, int[] actual) {
        return actual.length != expected.length;
    }
}
