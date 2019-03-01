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
    //array.length%2 ==0;

    public Integer[] range(int start, int stop) {
        int length = stop - start +1;
        Integer [] result = new Integer[length];
        if (length > 0) {
            for (int i = 0; i < result.length; i++) {
                result[i] = start++;
            }

        }
        return result;
    }
    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
     }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[0] * array[1]; }

    }
