package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        Integer[] arg = new Integer[array.length];
        if (arg.length % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Integer[] range(int start, int stop) {
        int length = stop - start;
        Integer [] result = new Integer[length + 1];
        if (length > 0) {
            for (int i = 0; i < result.length; i++) {
                result[i] = start++;
            }

        }
        return result;
    }
    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer num = 0;
        for (int i = 0; i < array.length; i++) {

            num = array[0] + array[1];

        }
        return num;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        Integer num = 0;
        for (int i = 0; i < array.length; i++) {

            num = array[0] * array[1];

        }
        return num;
    }
}